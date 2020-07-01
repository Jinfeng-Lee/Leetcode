class Solution {
    public int numSquares(int n) {
        int count = (int)Math.pow(n,0.5);       //注意两个参数都是double
        int[] dp = new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0] = 0;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=count;j++){
                if(i>=(int)Math.pow(j,2)){
                    dp[i] = Math.min(dp[i],dp[i-(int)Math.pow(j,2)]+1);
                }
            }
        }
        return dp[n];
    }
}
