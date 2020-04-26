class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int temp = 1;
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>=k){
                temp = 1;
                left = i+1;
                continue;             //遇到大于的数 要重置
            }
            if(nums[i] * temp < k){
                right = i;
                ans += right-left+1;  
                temp *= nums[i];      //记得别忘了乘
            }else{
                while(nums[i] * temp >= k){
                    temp /= nums[left];
                    left++;
                }
                right++;
                ans += right-left+1;
                temp *= nums[i];      //记得别忘了乘
            }
        }
        return ans;
    }
}
//经典双指针
