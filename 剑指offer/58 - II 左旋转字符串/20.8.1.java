class Solution {
    public String reverseLeftWords(String s, int n) {
        if(n == s.length()){ return s;}
        n = n % s.length();
        StringBuilder ans = new StringBuilder();
        ans.append(s.substring(n,s.length())).append(s.substring(0,n));
        return ans.toString();
    }
}
