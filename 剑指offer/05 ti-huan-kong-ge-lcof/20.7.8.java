class Solution {
    public String replaceSpace(String s) {
        if(s == null || s.length()<1){
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                ans.append("%20");
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
