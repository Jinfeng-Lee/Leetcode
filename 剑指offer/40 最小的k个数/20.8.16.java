import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
         ArrayList<Integer> ans = new ArrayList();
        if(k > input.length){ return ans;}
         PriorityQueue<Integer> cur = new PriorityQueue();
         for(int i = 0;i<input.length;i++){
             cur.add(input[i]);
         }
        for(int i =0;i<k;i++){
            ans.add(cur.poll());
        }
        return ans;
    }
}
//nowcoder上 当k大于数组长度时，返回空的
