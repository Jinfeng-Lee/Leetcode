class Solution {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        int n = len + 2;
        int[] cur = new int[n];
        for(int i = 0;i<len;i++){
            cur[i+1] = nums[i];
        }
        cur[0] = cur[n-1] = 1;              //左右加两个1
      
        int[][] dp = new int[n][n];
        return dfs(cur,0,n-1,dp);
    }
    public int dfs(int[] nums,int left,int right,int[][] dp){
        if(left+1 == right){ return 0;}
        if(dp[left][right]>0){ return dp[left][right];}
        for(int i = left+1;i<right;i++){
            dp[left][right] = Math.max(dp[left][right],dfs(nums,left,i,dp) + dfs(nums,i,right,dp) + nums[left] * nums[i] * nums[right]);//反着来 往数组里面加数
        }
        return dp[left][right];
    }
}
