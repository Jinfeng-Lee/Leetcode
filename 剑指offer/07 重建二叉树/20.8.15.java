/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.HashMap;
public class Solution {
    int[] pre;
    int[] in;
    HashMap<Integer,Integer> search;
    int pre_idx = 0;
    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        if(pre == null || in == null){ return null;}
        this.pre = pre;
        this.in = in;
        search = new HashMap<Integer,Integer>();
        int index  = 0;
        for(int num:in){
            search.put(num,index++);
        }
        return helper(0,pre.length);
    }
    public TreeNode helper(int m,int n){
        if(m == n){ return null;}
        TreeNode ans = new TreeNode(pre[pre_idx]);
        pre_idx++;
        ans.left = helper(m,search.get(ans.val));
        ans.right = helper(search.get(ans.val)+1,n);
        return ans;
    }
}
