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
        if(root == null){ return new ArrayList<>();}
        Queue<TreeNode> queue = new LinkedList<>(){{add(root);}};
        List<List<Integer>> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i = queue.size();i>0;i--){      //key
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if(cur.left!=null){ queue.add(cur.left);}
                if(cur.right!=null){ queue.add(cur.right);}
            }
            ans.add(temp);
        }
        return ans;
    }
}
