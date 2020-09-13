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
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = queue.size();i>0;i--){        
                TreeNode cur = queue.poll();
                if(ans.size()%2 == 0){        //key
                    temp.addLast(cur.val);
                }else{
                    temp.addFirst(cur.val);
                }
                if(cur.left!=null){ queue.add(cur.left);}
                if(cur.right!=null){ queue.add(cur.right);}
            }
            ans.add(temp);
        }
        return ans;
    }
}
