class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){ return 0;}
        int ans = 0,left = 0;
        HashMap<Character,Integer> cur = new HashMap();
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(cur.containsKey(temp)){
                left = Math.max(cur.get(temp)+1,left);
            }
            cur.put(temp,i);
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
