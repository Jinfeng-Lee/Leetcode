class Solution {
    public String reverseWords(String s) {
        if(s == null){ return "";}
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        int right = s.length();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                ans.append(s.substring(i+1,right));
                ans.append(" ");
                while(s.charAt(i-1) == ' '){
                    i--;
                }
                right = i;
            }
        }
        ans.append(s.substring(0,right));
        return ans.toString();        
    }
}
