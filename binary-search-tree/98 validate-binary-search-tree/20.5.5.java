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
    public boolean isValidBST(TreeNode root) {
        List<Integer> cur = new ArrayList();
        inorder(root,cur);
        for(int i = 1;i<cur.size();i++){
            if(cur.get(i) <= cur.get(i-1)){
                return false;
            }
        }
        return true;
    }
    private void inorder(TreeNode root,List<Integer> cur){
        if(root == null){return;}
        inorder(root.left,cur);
        cur.add(root.val);
        inorder(root.right,cur);
    }
}
//化作线性表
