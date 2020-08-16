class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed == null || popped == null){ return false;}
        int cur = 0;
        int move = 0;
        int len = pushed.length;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(cur<len){
            while(move<=len){
                if(move == len && popped[cur] != stack.peek()){
                    return false;
                }
                if(!stack.isEmpty() && popped[cur] == stack.peek()){
                        stack.pop();
                        cur++;
                        break;
                }else{
                    stack.push(pushed[move]);
                    move++;
                }
            }
        }
        return true;
    }

}
