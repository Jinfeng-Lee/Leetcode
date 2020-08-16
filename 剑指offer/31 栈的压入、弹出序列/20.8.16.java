import java.util.ArrayList;
import java.util.LinkedList;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        LinkedList<Integer> stack = new LinkedList();
        int i = 0;
        int cur = 0;
         while(i<pushA.length){
             stack.push(pushA[i]);
             i++;
             while(!stack.isEmpty() && stack.peek() == popA[cur]){
                 cur++;
                 stack.pop();
             }

         }
        return stack.isEmpty();
    }
}
