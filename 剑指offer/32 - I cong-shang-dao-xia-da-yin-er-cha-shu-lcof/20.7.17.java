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
        Queue<TreeNode> queue = new LinkedList<>(){{ add(root);}};    //用个queue
        List<Integer> cur = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            cur.add(temp.val);
            if(temp.left!=null){ queue.add(temp.left);}
            if(temp.right!=null){ queue.add(temp.right);}
        }
        int[] res = new int[cur.size()];
        for(int i = 0;i<cur.size();i++){
            res[i] = cur.get(i);
        }
        return res;
    }
}
