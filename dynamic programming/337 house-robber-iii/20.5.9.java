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
    public int rob(TreeNode root) {
        int[] result = result(root);
        return Math.max(result[0],result[1]);
    }
    private int[] result(TreeNode root){
        if(root == null){
            return new int[2];
        }
        int[] result = new int[2];
        int[] left = result(root.left);//左子树
        int[] right = result(root.right);//右子树
        result[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);//0为当前root不偷
        result[1] = root.val + left[0] + right[0];//1为当前root偷
        return result;
    }
}
