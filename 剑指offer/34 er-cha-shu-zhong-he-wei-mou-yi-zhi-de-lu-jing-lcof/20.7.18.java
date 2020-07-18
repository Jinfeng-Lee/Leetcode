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
    LinkedList<List<Integer>> ans = new LinkedList<>();
    LinkedList<Integer> cur = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){ return new LinkedList<List<Integer>>();}
        recur(root,sum);
        return ans;
    }
    public void recur(TreeNode root,int tar){
        if(root == null){ return;}
        cur.add(root.val);
        tar -= root.val;
        if(tar == 0 && root.left == null && root.right == null){
            ans.add(new LinkedList<Integer>(cur));
        }
        recur(root.left,tar);
        recur(root.right,tar);
        cur.removeLast();
    }
}
