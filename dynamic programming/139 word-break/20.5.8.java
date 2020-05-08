class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;                   //默认空的为true
        for(int i = 1;i<=s.length();i++){
            for(int j =0;j<i;j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){     //从最大子串开始遍历 减少时间
                    dp[i] = true; 
                    break;                                            //只要满足一种情况就return true 不再继续遍历
                }
            }
        }
        return dp[s.length()];
    }
}
