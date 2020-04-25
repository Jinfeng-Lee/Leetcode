class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] temp = new int[nums.length];
        temp[nums.length-1] = 1;
        int ans = 1;
        for(int i=nums.length-2;i>=0;i--){
            int temp2 = 1;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    temp2 = Math.max(temp2,temp[j]+1);
                }
            }
            temp[i] = temp2;
            ans = Math.max(ans,temp2);
        }
        return ans;
        }

}
