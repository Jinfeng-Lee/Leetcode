class Solution {
    public int titleToNumber(String s) {
        int l = s.length();
        int ans = 0;
        int m = 0;
        while(m < l){
            ans += Math.pow(26,l-m-1) * (s.charAt(m) - 'A' + 1);
            m++;
        }
        return ans;
    }
}
