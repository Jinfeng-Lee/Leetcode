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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new LinkedList<TreeNode>();
        }
        return generate_Trees(1,n);
    }
    private LinkedList<TreeNode> generate_Trees(int start,int end){
        LinkedList<TreeNode> ans = new LinkedList<>();
        if(start > end){
            ans.add(null);
            return ans;
        }                                
        for(int i = start;i<=end;i++){
            LinkedList<TreeNode> left_List = generate_Trees(start,i-1);
            LinkedList<TreeNode> right_List = generate_Trees(i+1,end);
            for(TreeNode l:left_List){
                for(TreeNode r:right_List){
                    TreeNode temp = new TreeNode(i);
                    temp.left = l;
                    temp.right = r;
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
//dfs
