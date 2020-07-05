class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        if(Math.abs(S)>Math.abs(sum)){ return 0;}
        int[][] dp = new int[nums.length][2*sum+1];
        if(nums[0] == 0){
            dp[0][sum] =2;
        }else{
            dp[0][sum+nums[0]] = 1;
            dp[0][sum-nums[0]] = 1;
        }
        for(int i =0;i<nums.length-1;i++){
            for(int j=0;j<2*sum+1;j++){
                if(dp[i][j] == 0){ continue;}
                if(j-nums[i+1]>=0){ dp[i+1][j-nums[i+1]] += dp[i][j];}
                if(j+nums[i+1]<=2*sum) { dp[i+1][j+nums[i+1]] += dp[i][j];}
            }
        }
        return dp[nums.length-1][sum+S];
    }
}
//一层一层dp
