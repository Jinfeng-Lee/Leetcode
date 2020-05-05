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
    public int minDiffInBST(TreeNode root) {
        List<Integer> cur = new ArrayList();
        int ans = Integer.MAX_VALUE;          //initiate
        inorder(root,cur);
        for(int i = 1;i<cur.size();i++){
             ans = Math.min(ans,cur.get(i)-cur.get(i-1));
        }
        return ans;
    }
    private void inorder(TreeNode root,List<Integer> cur){
        if(root == null){
            return;
        }
        inorder(root.left,cur);
        cur.add(root.val);
        inorder(root.right,cur);
    }
}
//转化为线性表 然后遍历
