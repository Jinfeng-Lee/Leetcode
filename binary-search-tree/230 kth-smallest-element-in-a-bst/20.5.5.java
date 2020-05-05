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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){ return 0;}
        List<Integer> cur = new ArrayList();
        inorder(root,cur);
        return cur.get(k-1);
    }
    private void inorder(TreeNode root, List<Integer> cur){
        if(root == null){ return;}
        inorder(root.left,cur);
        cur.add(root.val);
        inorder(root.right,cur);
    }
}
//中序遍历
