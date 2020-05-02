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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        TreeNode cur = root;
        TreeNode pre;
        while(cur!=null){
            if(cur.left == null){
                res.add(cur.val);
                cur = cur.right;        //无左结点则加到res中 cur移至右结点
            }else{
                pre = cur.left;
                while(pre.right!=null){
                    pre = pre.right;
                }
                pre.right = cur;
                TreeNode temp = cur;
                cur = cur.left;
                temp.left = null;       //如果存在的话 root作为左子树最右节点的右子树 记得结点的左子树需要做处理
            }
        }
        return res;
    }
}
//二叉线索树
