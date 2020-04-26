class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                temp +=nums[j];
                if(temp == k){
                    ans++;
                }
            }
            temp = 0;
        }
        return ans;
    }
}
//可以用hashmap降低时间复杂度
