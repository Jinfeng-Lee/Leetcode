class Solution {
    public int trailingZeroes(int n) {
        int m = 1;
        int ans = 0;
        while(Math.pow(5,m) <= n){
            ans += n/Math.pow(5,m);
            m++;
        }
        return ans;
    }
}
