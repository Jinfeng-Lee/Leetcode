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
    int[] preorder;
    int[] inorder;
    int pre_idx = 0;
    Map<Integer,Integer> temp = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        this.preorder = preorder;
        this.inorder = inorder;
        int idx = 0;
        for(int s:inorder){
            temp.put(s,idx++);
        }
        return helper(0,preorder.length);
    }
    private TreeNode helper(int m,int n){
        if(m == n){ return null;}
        TreeNode root = new TreeNode(preorder[pre_idx]);
        pre_idx++;
        root.left = helper(m,temp.get(root.val));
        root.right = helper(temp.get(root.val)+1,n);
        return root;
    }
}
