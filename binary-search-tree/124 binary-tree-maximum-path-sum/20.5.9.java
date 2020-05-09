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
    int max = Integer.MIN_VALUE;//record
    public int maxPathSum(TreeNode root) {
        maxNode(root);
        return max;
     }
    
    private int maxNode(TreeNode root){
        if(root == null){//if null 
            return 0;
        }
        int left_max = Math.max(maxNode(root.left),0);//左分支最大值 如果小于0 则为0
        int right_max = Math.max(maxNode(root.right),0);//右分支最大值 如果小于0 则为0
        int cur_node = root.val + left_max + right_max; //包括该结点的最大值
        max = Math.max(cur_node,max);//与max比较
        return root.val  + Math.max(left_max,right_max);//返回结点和最大分支值
    }
}//递归
