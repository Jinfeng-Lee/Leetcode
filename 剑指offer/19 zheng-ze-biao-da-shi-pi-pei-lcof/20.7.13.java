class Solution {
    public boolean isMatch(String s, String p) {
        if(p.length() == 0) return s.length() == 0;     //注意
        int l1 = s.length();
        int l2 = p.length();
        boolean[][] dp = new boolean[l1+1][l2+1];       //注意是boolean
        dp[0][0] = true;
        for(int i = 2;i<=l2;i+=2){
            dp[0][i] = dp[0][i-2] && p.charAt(i-1) == '*';
        }
        for(int i = 1;i<=s.length();i++){
            for(int j = 1;j<=p.length();j++){
                int m = i-1;
                int n = j-1;
                if(p.charAt(n) == '*'){
                    dp[i][j] = dp[i][j-2] || dp[i-1][j] && (p.charAt(n-1) == s.charAt(m) || p.charAt(n-1) == '.');      //这里有个小括号
                }else if(p.charAt(n) == '.' || p.charAt(n) == s.charAt(m)){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[l1][l2];
    }
}
