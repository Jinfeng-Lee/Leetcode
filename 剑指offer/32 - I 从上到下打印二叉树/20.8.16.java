import java.util.ArrayList;
import java.util.LinkedList;
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList();
        if(root == null){ return ans;}
        LinkedList<TreeNode> cur = new LinkedList();
        cur.add(root);
        while(!cur.isEmpty()){
            for(int i = 0;i<cur.size();i++){
                if(cur.peekFirst().left!=null){ cur.addLast(cur.peekFirst().left);}
                if(cur.peekFirst().right!=null){ cur.addLast(cur.peekFirst().right);}
                ans.add(cur.pollFirst().val);
            }
        }
        return ans;
    }
}
