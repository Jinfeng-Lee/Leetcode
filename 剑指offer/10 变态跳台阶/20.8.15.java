public class Solution {
    public int JumpFloorII(int target) {
        if(target == 0){ return 1;}
        if(target == 1) {return 1;}
        int count = 2;
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<=target;i++){
            dp[i] = dp[i-1] * 2;
        }
        return dp[target];
    }
}
//贪心 直接乘2就行了
