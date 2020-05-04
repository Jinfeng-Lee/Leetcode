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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null){
            return root;
        }
        while(root.val > R || root.val < L){
            if(root.val > R){
                root = root.left;
            }else if(root.val < L){
                root = root.right;
            }
            if(root == null){
                return null;
            }
        }                                       //找到符合的点
        root.left = trimBST(root.left,L,R);     
        root.right = trimBST(root.right,L,R);   //拼接左子树和右子树
        return root;
    }
}
//dfs
