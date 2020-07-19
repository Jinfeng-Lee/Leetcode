class Solution {
    public String[] permutation(String s) {
        if(s == null){ return new String[0];}
        LinkedList<String> cur = new LinkedList<>();
        StringBuilder temp = new StringBuilder();
        recur(s.toCharArray(),cur,temp);
        String[] ans = new String[cur.size()];
        int i = 0;
        while(!cur.isEmpty()){
            ans[i++] = cur.poll();
        }
        return ans;
    }
    public void recur(char[] s, List<String> cur,StringBuilder temp){
        if(temp.length() == s.length){
            cur.add(temp.toString());
            return;
        }
        HashSet<Character> exist = new HashSet<>(); //剪枝用HashSet
        for(int i = 0;i<s.length;i++){
            if(s[i]!='?' && !exist.contains(s[i])){
                exist.add(s[i]);
                temp.append(s[i]);
                char temp2 = s[i];
                s[i] = '?';
                recur(s,cur,temp);
                s[i] = temp2;
                temp.deleteCharAt(temp.length()-1);
            }
        }    
    }
}
