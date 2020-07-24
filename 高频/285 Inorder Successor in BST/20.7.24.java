    import com.sun.scenario.effect.Merge;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    /**
     * @author Leo
     */
    public class Solution {
        public class TreeNode{
            TreeNode left;
            TreeNode right;
            int val;
            TreeNode(int num){
                val = num;
            }
        }
        public TreeNode inOrderSuccessor(TreeNode root,TreeNode p) {
            if (root == null) {
                return null;
            }
            if (root.val <= p.val) {
                return inOrderSuccessor(root.right, p);
            } else {
                TreeNode temp = inOrderSuccessor(root.left, p);
                if (temp == null) {
                    return root;
                }
                return temp;
            }
        }

        public static void main(String[] args){

        }

    }
