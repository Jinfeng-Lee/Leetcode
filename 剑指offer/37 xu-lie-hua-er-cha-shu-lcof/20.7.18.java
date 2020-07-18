/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){ return "[]";}
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        StringBuilder ans = new StringBuilder("[");
        ans.append(root.val + ",");
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left == null){ 
                ans.append("null,");
            }else{
                ans.append(temp.left.val + ",");
                queue.add(temp.left);
            }
            if(temp.right == null){
                ans.append("null,");
            }else{
                ans.append(temp.right.val + ","); 
                queue.add(temp.right);
            }
    }
        ans.deleteCharAt(ans.length()-1);
        ans.append("]");
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")){ return null;}
        String[] vals = data.substring(1,data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> cur = new LinkedList<TreeNode>();
        cur.add(root);
        int i = 1;
        while(!cur.isEmpty()){
            TreeNode temp = cur.poll();
            if(!vals[i].equals("null")){
                temp.left = new TreeNode(Integer.parseInt(vals[i]));
                cur.add(temp.left);
            }
            i++;
            if(!vals[i].equals("null")){
                temp.right = new TreeNode(Integer.parseInt(vals[i]));
                cur.add(temp.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
