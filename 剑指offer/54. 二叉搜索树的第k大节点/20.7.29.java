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
    public int kthLargest(TreeNode root, int k) {
        List<Integer> exist = new ArrayList();
        backOrder(root,exist);
        return exist.get(k-1);
    }
    public void backOrder(TreeNode root,List<Integer> exist){
        if(root == null){ return;}
        backOrder(root.right,exist);
        exist.add(root.val);
        backOrder(root.left,exist);
    }
}
