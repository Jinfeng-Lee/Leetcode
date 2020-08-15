public class Solution {
    public int JumpFloor(int target) {
        if(target == 0){ return 1;}
        if(target == 1){ return 1;}
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<=target;i++){
            dp[i & 1] = dp[0] + dp[1];
        }
        return dp[target & 1];
    }
}
