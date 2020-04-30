class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0){
            return 0;
        }
        Stack<Integer> cur = new Stack();
        int a = 0;
        int b = 0;
        for(int i = 0;i<tokens.length;i++){
            switch(tokens[i]){
                case "+" :
                    a = cur.pop();
                    b = cur.pop();
                    cur.push(a+b);
                    break;
                case "-" :
                    a = cur.pop();
                    b = cur.pop();
                    cur.push(b-a);
                    break;
                case "*" :
                    a = cur.pop();
                    b = cur.pop();
                    cur.push(b*a);
                    break;
                case "/" :
                    a = cur.pop();
                    b = cur.pop();
                    cur.push(b/a);
                    break;
                default:
                    cur.push(Integer.parseInt(tokens[i]));
                    
            }
        }
        return cur.pop();
    }
}
//将操作数压入栈中 很像基于栈的解释器执行过程
