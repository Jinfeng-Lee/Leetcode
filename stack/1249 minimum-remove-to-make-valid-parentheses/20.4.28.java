class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        boolean[] isinvalid = new boolean[s.length()];    //用boolean数组做标记位 为了最后append
        Stack<Integer> stack = new Stack();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(i);
                isinvalid[i] =true;                       //为左括号时 压入栈 标记true
            }else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    isinvalid[i] =true;                   //栈内为空 标记为true
                }else{
                    isinvalid[stack.pop()] = false;       //栈内不为空 将前一个左括号标记为false
                }
            }
        }
        for(int i = 0;i<s.length();i++){
            if(!isinvalid[i]){
                ans.append(s.charAt(i));
            }
        }                                                 //最后进行append
        return ans.toString();
    }
}
