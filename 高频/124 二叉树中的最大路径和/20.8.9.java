/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){ return 0;}
        recur(root);
        return ans;
    }
    public int recur(TreeNode root){
        if(root == null){ return 0;}
        int left = Math.max(recur(root.left),0);
        int right = Math.max(recur(root.right),0);
        ans = Math.max(ans,root.val+left+right);
        return Math.max(left,right) + root.val;
        
    }
}
