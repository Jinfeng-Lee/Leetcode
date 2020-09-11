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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null){ return ans;}
        LinkedList<TreeNode> cur = new LinkedList();
        cur.add(root);
        while(!cur.isEmpty()){
            List<Integer> temp = new ArrayList();
            int len = cur.size();
            for(int i = 0;i<len;i++){
                TreeNode head = cur.getFirst();
                temp.add(head.val);
                if(head.left!=null){ cur.add(head.left);}
                if(head.right!=null){ cur.add(head.right);}
                cur.removeFirst();
            }
            ans.add(temp);
        }
        return ans;
    }
}
