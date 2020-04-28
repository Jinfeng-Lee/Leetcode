class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()==0){
            return true;
        }
        Stack<Character> stack1 = new Stack();
        Stack<Character> stack2 = new Stack();
        for(int i =0;i<moves.length();i++){ 
            if(moves.charAt(i) == 'U'|| moves.charAt(i) == 'D'){
                if(!stack1.isEmpty() && stack1.peek() != moves.charAt(i)){
                    stack1.pop();
                }else{
                    stack1.push(moves.charAt(i));
                }   
            }else if(moves.charAt(i) == 'L' || moves.charAt(i) == 'R'){
                if(!stack2.isEmpty() && stack2.peek() != moves.charAt(i)){
                    stack2.pop();
                }else{
                    stack2.push(moves.charAt(i));
                }
            }
        }
        if(stack1.isEmpty() && stack2.isEmpty()){ return true;}
        return false;
    }
}
//第一时间想到栈 可以用二维数组
