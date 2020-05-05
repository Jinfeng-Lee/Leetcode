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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> temp = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        if(root == null){
            return ans;
        }
        dfs(root,0,temp);
        for(int i = temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
        return ans;
    }
    private void dfs(TreeNode root,int m,List<List<Integer>> temp){
        if(m == temp.size()){
            temp.add(new ArrayList());
        }
        temp.get(m).add(root.val);
        if(root.left!=null){
            dfs(root.left,m+1,temp);
        }
         if(root.right!=null){
            dfs(root.right,m+1,temp);
        }
    }
}
//reverse()可以试试LinkedList的addFirst
