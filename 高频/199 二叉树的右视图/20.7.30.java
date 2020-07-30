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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if(root == null){ return ans;}
        Queue<TreeNode> cur = new LinkedList();
        cur.offer(root);
        while(!cur.isEmpty()){
            int size = cur.size();
            for(int i =0;i<size;i++){
                TreeNode temp = cur.poll();
                if(temp.left!=null){ cur.offer(temp.left);}
                if(temp.right!=null){ cur.offer(temp.right);}
                if(i == size-1){ ans.add(temp.val);}
            }
        }
        return ans;
    }
}
