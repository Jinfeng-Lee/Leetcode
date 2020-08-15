public class Solution {
    public int Fibonacci(int n) {
        if(n == 0){ return 0;}
        if(n == 1){ return 1;}
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i & 1] = dp[0] + dp[1];
        }
        return dp[n & 1];
    }
}
