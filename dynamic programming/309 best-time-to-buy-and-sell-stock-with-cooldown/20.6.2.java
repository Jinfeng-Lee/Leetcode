class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len < 2){
            return 0;
        }
        int[][] dp = new int[2][3];//滚动数组
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;         //初始化
        
        for(int i = 1;i<prices.length;i++){
            dp[i & 1][0] = Math.max(dp[(i-1) & 1][0],dp[(i-1) & 1][1] + prices[i]); //0 只能由0 1 转换过来
            dp[i & 1][1] = Math.max(dp[(i-1) & 1][1],dp[(i-1) & 1][2] - prices[i]); //1 只能由1 2 转换过来
            dp[i & 1][2] = dp[(i-1) & 1][0];                                        //2 只能由 0 转换过来    
        }
        return Math.max(dp[(len-1) & 1][0],dp[(len-1) & 1][2]);
    }
}
