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
    Map<Integer,TreeNode> parent = new HashMap<>();
    Set<TreeNode> exist = new HashSet();
    public void dfs(TreeNode root){
        if(root.left!=null){
            parent.put(root.left.val,root);
            dfs(root.left);
        }
        if(root.right!=null){
            parent.put(root.right.val,root);
            dfs(root.right);
        }
    }//存储父节点
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while(p!=null){
            exist.add(p);
            p = parent.get(p.val);
        }//添加所有父节点到exist
        while(q!=null){
            if(exist.contains(q)){
                return q;
            }//遍历 如果存在则返回
            q = parent.get(q.val);
        }
        return null;
    }
}
