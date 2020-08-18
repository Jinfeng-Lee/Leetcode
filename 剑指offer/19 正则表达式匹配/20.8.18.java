public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str == null){ return pattern == null;}
        int m = str.length;
        int n = pattern.length;
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int i = 2;i<=n;i+=2){
            if(pattern[i-1] == '*'){
                dp[0][i] = dp[0][i-2];
            }
        }
        for(int i= 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                int s1 = i-1;
                int s2 = j-1;
                if(pattern[s2] == '*'){
                    dp[i][j] = dp[i][j-2] || dp[i-1][j] && (pattern[s2-1] == '.'|| pattern[s2-1] == str[s1]);
                }else if(pattern[s2] == '.' || pattern[s2] == str[s1]){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
