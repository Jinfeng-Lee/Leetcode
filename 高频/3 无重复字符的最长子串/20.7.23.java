class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){return 0;}
        HashMap<Character,Integer> cur = new HashMap();
        int ans = 0;
        int left = 0;
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(cur.containsKey(temp)){
                left = Math.max(left,cur.get(temp)+1);
            }
            cur.put(temp,i);
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
