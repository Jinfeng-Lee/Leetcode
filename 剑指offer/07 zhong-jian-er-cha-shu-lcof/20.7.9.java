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
    Map<Integer,Integer> search;
    int pre_idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length <1 || preorder.length < 1){
            return null;
        }
        this.preorder = preorder;
        this.inorder = inorder;
        int idx = 0;
        search = new HashMap<Integer,Integer>();
        for(int num:inorder){
            search.put(num,idx++);
        }
        return helper(0,inorder.length);
    }
    public TreeNode helper(int m,int n){
        if(m == n){ return null;}
        TreeNode root = new TreeNode(preorder[pre_idx]);
        pre_idx++;
        root.left = helper(m,search.get(root.val));
        root.right = helper(search.get(root.val)+1,n);  //注意这里 pre_idx先++ 再去递归
        return root;
    }
}
