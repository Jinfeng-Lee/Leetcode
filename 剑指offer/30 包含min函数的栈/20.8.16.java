import java.util.Stack;
import java.util.LinkedList;

public class Solution {
    
    LinkedList<Integer> stack = new LinkedList();
    int temp = Integer.MAX_VALUE;
    public void push(int node) {
        if(!stack.isEmpty()){
             temp = stack.peek();
        }
         stack.push(node);
         if(temp<node){
                 stack.push(temp);
          }else{
                 stack.push(node);
           }
    }
    
    public void pop() {
        stack.pop();
        stack.pop();
    }
    
    public int top() {
        int temp = stack.pop();
        int temp2 = stack.peek();
        stack.push(temp);
        return temp2;
    }
    
    public int min() {
        return stack.peek();
    }
}
