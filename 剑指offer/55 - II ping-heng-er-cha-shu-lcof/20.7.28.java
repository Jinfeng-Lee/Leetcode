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
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){ return true;}
        boolean flag = Math.abs(getLength(root.left)-getLength(root.right))>1?false:true;
        return flag && isBalanced(root.left) && isBalanced(root.right);
    }
    public int getLength(TreeNode root){
        if(root == null){return 0;}
        if(root.left == null && root.right == null){
            return 1; 
        }
        return Math.max(getLength(root.left),getLength(root.right))+1;
    }
}
