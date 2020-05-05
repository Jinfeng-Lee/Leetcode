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
        Map<Integer,List<Integer>> cur = new HashMap();
        List<List<Integer>> ans = new ArrayList();
        order(root,1,cur);
        for(List<Integer> s :cur.values()){
            ans.add(s);
        }
        return ans;
    }
    private void order(TreeNode root,int m,Map<Integer,List<Integer>> cur){
        if(root == null){
            return;
        }
        if(cur.containsKey(m)){
            cur.get(m).add(root.val);
        }else{
            cur.put(m,new ArrayList());
            cur.get(m).add(root.val);
        }
        order(root.left,m+1,cur);
        order(root.right,m+1,cur);
    }
}
//用dfs来写 但是感觉多用了HashMap 
