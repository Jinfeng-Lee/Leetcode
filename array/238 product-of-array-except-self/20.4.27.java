class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int temp = 1;
        for(int i=0;i<nums.length;i++){
            ans[i] = temp;
            temp *= nums[i];
        }
        int temp2 = 1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i] *= temp2;
            temp2 *= nums[i];
        }
        return ans;
    }
}
//两遍遍历
