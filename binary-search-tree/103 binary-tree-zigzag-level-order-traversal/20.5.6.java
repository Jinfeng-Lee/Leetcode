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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null){ return ans;}
        dfs(root,0,ans);
        return ans;
    }
    private void dfs(TreeNode root,int level,List<List<Integer>> ans){
        if(level == ans.size()){
            ans.add(new LinkedList());
        }
        if(level % 2 == 0){
            ans.get(level).add(root.val);
        }else{
            ans.get(level).add(0,root.val);       //逐层分析
        }
        if(root.left!=null){ dfs(root.left,level+1,ans);}
        if(root.right!=null){ dfs(root.right,level+1,ans);}
    }
}//多了逐层分析 其他都跟以前一样
