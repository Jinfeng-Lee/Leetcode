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
    public int[] levelOrder(TreeNode root) {
        if(root == null){ return new int[0];}
        List<Integer> ans = new ArrayList();
        Queue<TreeNode> cur = new LinkedList();
        cur.add(root);
        while(!cur.isEmpty()){
            for(int i = cur.size()-1;i>=0;i--){
                TreeNode temp = cur.poll();
                ans.add(temp.val);
                if(temp.left!=null){ cur.add(temp.left);}
                if(temp.right!=null){ cur.add(temp.right);}
            }
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
