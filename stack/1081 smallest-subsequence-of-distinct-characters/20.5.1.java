class Solution {
    public String smallestSubsequence(String text) {
        Stack<Character> temp = new Stack();
        Map<Character,Integer> cur = new HashMap();
        StringBuilder ans = new StringBuilder();
        Set<Character> temp2 = new HashSet();       //if it exist,continue next Character
        for(int i =0;i<text.length();i++){
            cur.put(text.charAt(i),i);
        }
        for(int i =0;i<text.length();i++){
            char s = text.charAt(i);
            if(!temp2.contains(s)){
                while(!temp.isEmpty() && temp.peek()> s && cur.get(temp.peek()) > i){
                temp2.remove(temp.pop());
                }
                temp.push(s);
                temp2.add(s);
            }
        }
        for(Character c:temp){
            ans.append(c.charValue());
        }
        return ans.toString();
        
    }
}
//equals 316
