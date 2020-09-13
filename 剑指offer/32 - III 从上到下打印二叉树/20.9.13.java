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
        Queue<TreeNode> cur = new LinkedList(){{add(root);}};
        while(!cur.isEmpty()){
            LinkedList<Integer> temp = new LinkedList();
            for(int i = cur.size()-1;i>=0;i--){
                if(ans.size() % 2 == 0){
                    TreeNode head = cur.poll();
                    temp.addLast(head.val);
                    if(head.left != null){ cur.add(head.left);}
                    if(head.right!=null){ cur.add(head.right);}
                }else{
                    TreeNode head = cur.poll();
                    temp.addFirst(head.val);
                    if(head.left!=null){ cur.add(head.left);}
                    if(head.right!=null){ cur.add(head.right);}
                }
            }
                ans.add(temp);
            }
        return ans;
    }
}
