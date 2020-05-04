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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> cur = new ArrayList();
        inorder(root,cur);      //先做一个线性表
        int left = 0;
        int right = cur.size()-1;
        while(left<right){
            int sum = cur.get(left) + cur.get(right);       //判断sum 如果大于 右指针左移 反之 左指针右移
            if(sum == k){
                return true;
            }else if(sum < k){
                left++;
            }else{
                right--;
            }
        }
        return false;       //当做线性表来遍历
    }
    private void inorder(TreeNode root, List<Integer> cur){
        if(root == null){
            return;
        }
        inorder(root.left,cur);
        cur.add(root.val);
        inorder(root.right,cur);          //先中序遍历成一个线性表
    }
}
