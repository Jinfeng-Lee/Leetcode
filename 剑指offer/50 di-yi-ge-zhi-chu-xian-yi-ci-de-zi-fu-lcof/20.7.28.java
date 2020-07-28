class Solution {
    public char firstUniqChar(String s) {
        if(s == null || s.length()== 0){
            return ' ';
        }
        HashMap<Character,Integer> cur = new HashMap();
        for(char c:s.toCharArray()){
            cur.put(c,cur.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){  //注意
            if(cur.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
}
