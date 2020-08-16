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
    TreeNode pre,head;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {return null;}
        dfs(pRootOfTree);
        return head;
    }
    public void dfs(TreeNode root){
        if(root == null) {return;}
        dfs(root.left);
        if(pre == null){
            head = root;
        }else{
            pre.right = root;
        }
        root.left = pre;
        pre = root;
        dfs(root.right);
    }
}
//nowcoder检测有问题
