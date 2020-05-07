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
    int[] inorder;
    int[] postorder;
    int pre_idx;
    Map<Integer,Integer> order_map = new HashMap();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0){ return null;}
        this.inorder = inorder;
        this.postorder = postorder;
        this.pre_idx = postorder.length-1;
        int idx = 0;
        for(Integer i:inorder){
            order_map.put(i,idx++);
        }
        return helper(0,inorder.length);
    }
    private TreeNode helper(int m,int n){
        if(m == n) {return null;}
        TreeNode root = new TreeNode(postorder[pre_idx]);
        pre_idx--;
        root.right = helper(order_map.get(root.val)+1,n);
        root.left = helper(m,order_map.get(root.val));
        return root;
    }
}
//跟前序和中序确定树一样 都以中序遍历来缩小范围，用前序或者后序来辅助 前序是从前往后 后序是从后往前 注意left 和right的插值顺序
