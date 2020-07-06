class Solution {
    public int countSubstrings(String s) {
        if(s == null) { return 0;}
        int ans = 0;
        int left = 0;
        int right = 0;
        for(int i = 0;i<s.length();i++){
            left = i-1;
            right = i+1;
            while(left>=0 && right <s.length() &&s.charAt(left) == s.charAt(right)){
                ans++;
                left--;
                right++;
            }
            left = i;
            right = i+1;
            while(left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
                ans++;
                left--;
                right++;
            }
        }
        ans+= s.length();
        return ans;
    }
}
//双指针
