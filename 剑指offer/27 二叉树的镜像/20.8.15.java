/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public void Mirror(TreeNode root) {
           recur(root);
    }
    public TreeNode recur(TreeNode root){
        if(root == null){ return null;}
        TreeNode temp = root.left;
        root.left = recur(root.right);
        root.right = recur(temp);
        return root;
    }
}
