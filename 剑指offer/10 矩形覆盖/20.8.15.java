public class Solution {
    public int RectCover(int target) {
        if(target == 0){ return 0;}
        if(target == 1){ return 1;}
        if(target == 2){ return 2;}
        int[] dp = new int[2];
        dp[0] = 2;
        dp[1] = 1;
        for(int i = 3;i<=target;i++){
            dp[i & 1] = dp[0] + dp[1];
        }
        return dp[target & 1];
    }
}
