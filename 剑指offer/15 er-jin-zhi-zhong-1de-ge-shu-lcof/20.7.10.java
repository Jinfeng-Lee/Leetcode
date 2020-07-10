public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while(n!=0){
            n &= n-1;
            ans++;
        }
        return ans;
    }
}
//消去最右边的1
