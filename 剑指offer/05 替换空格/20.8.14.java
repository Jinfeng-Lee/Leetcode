public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if(str.length() == 0){ return "";}
        String str2 = str.toString();
        StringBuffer ans = new StringBuffer();
        for(int i = 0;i<str2.length();i++){
            if(str2.charAt(i) == ' '){
                ans.append("%20");
            }else{
                ans.append(str2.charAt(i));
            }
        }
        return ans.toString();
    }
}
