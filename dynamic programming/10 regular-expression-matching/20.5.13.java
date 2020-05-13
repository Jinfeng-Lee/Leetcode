class Solution {
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()){ return s.isEmpty();}
        int l1 = s.length();
        int l2 = p.length();
        boolean[][] dp = new boolean[l1+1][l2+1];
        dp[0][0] = true;
        for(int i = 2;i<=l2;i+=2){
            dp[0][i] = dp[0][i-2] && p.charAt(i-1) == '*'; 
        }
        for(int i = 1;i<=l1;i++){
            for(int j = 1;j<=l2;j++){
                int m = i-1;
                int n = j-1;
                if(p.charAt(n) == '*'){
                        dp[i][j] = dp[i][j-2] || dp[i-1][j] && (s.charAt(m) == p.charAt(n-1) || p.charAt(n-1) == '.');
                }else if(p.charAt(n) == s.charAt(m) || p.charAt(n) == '.'){
                        dp[i][j] = dp[i-1][j-1];
                }//p下一个字符是否为 * 若与s下一个字符不相同 则默认为false
            }
        }
        return dp[l1][l2];
    }
}
//默认*号前面必须有非*字符
//动态规划 先初始化 在从1 1开始逐个增加 进行动态规划 
