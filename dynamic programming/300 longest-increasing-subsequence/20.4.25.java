class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] temp = new int[nums.length];         //创建辅助数组，用来记住从这点开始到最后的最长子序列长度
        temp[nums.length-1] = 1;                   //初始化
        int ans = 1;
        for(int i=nums.length-2;i>=0;i--){          //从后往前遍历
            int temp2 = 1;
            for(int j = i+1;j<nums.length;j++){     //从前往后遍历找比它大的数
                if(nums[j]>nums[i]){
                    temp2 = Math.max(temp2,temp[j]+1);  //找到比它大的最大的temp[j]
                }
            }
            temp[i] = temp2;                    
            ans = Math.max(ans,temp2);              //找出最大的temp[j]
        }
        return ans;
        }

}
