import java.util.ArrayList;

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
    ArrayList<ArrayList<Integer>> ans;
    ArrayList<Integer> cur;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ans = new ArrayList();
        cur = new ArrayList(); 
        recur(root,target);
        return ans;
    }
    public void recur(TreeNode root,int tar){
        if(root == null){return;}
        cur.add(root.val);
        tar-=root.val;
        if(tar == 0 && root.left == null && root.right == null){
            ans.add(new ArrayList(cur));
        }
        recur(root.left,tar);
        recur(root.right,tar);
        cur.remove(cur.size()-1);
    }
}
