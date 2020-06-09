class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> lookup = new HashMap<>();
        for(char c:s.toCharArray()){ lookup.put(c,0);}
        for(char c:t.toCharArray()){
            if(lookup.containsKey(c)){
                lookup.put(c,lookup.get(c)+1);
            }else{
                return "";
            }
        }
        int start = 0;
        int end = 0;
        int count = t.length();
        String res = "";
        int min_value = Integer.MAX_VALUE;
        while(end < s.length()){
            char c = s.charAt(end);
            if(lookup.get(c) > 0)  count--;
            lookup.put(c,lookup.get(c)-1);
            end++;
            while(count == 0){
                if(end-start<min_value){
                    min_value = end-start;
                    res = s.substring(start,end);
                }
                char l = s.charAt(start);
                if(lookup.get(l) == 0) count++;
                lookup.put(l,lookup.get(l)+1);
                start++;
            }
        }
        return res;
    }
}
//map 2for 2 while
