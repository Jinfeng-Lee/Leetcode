public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str == null){ return pattern == null;}
        int l1 = str.length;
        int l2 = pattern.length;
        boolean[][] dp =  new boolean[l1+1][l2+1];
        dp[0][0] = true;
        for(int i = 2;i<=l2;i+=2){
            dp[0][i]  = dp[0][i-2] && (pattern[i-1] == '*'); 
        }
        for(int i = 1;i<=l1;i++){
            for(int j = 1;j<=l2;j++){
                int m = i-1;
                int n = j-1;
                if(pattern[n] == '*'){
                    dp[i][j] = dp[i-1][j] && (pattern[n-1] == str[m] || pattern[n-1] == '.') || dp[i][j-2];
                }else if(pattern[n] == '.' || pattern[n] == str[m]){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[l1][l2];
    }
}
