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
        StringBuilder ans = new StringBuilder("[");
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.addLast(root);
        ans.append(root.val + ",");
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!=null){
                ans.append(temp.left.val + ",");
                queue.addLast(temp.left);
            }else{
                ans.append("null,");
            }
            if(temp.right!=null){
                ans.append(temp.right.val + ",");
                queue.addLast(temp.right);
            }else{
                ans.append("null,");
            }        
        }
        ans.deleteCharAt(ans.length()-1);
        ans.append("]");
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")){ return null;}
        String[] cur = data.substring(1,data.length()-1).split(",");
        TreeNode ans = new TreeNode(Integer.parseInt(cur[0]));
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(ans);
        int count = 1;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(!cur[count].equals("null")){
                temp.left = new TreeNode(Integer.parseInt(cur[count]));
                queue.add(temp.left);
            }
            count++;
            if(!cur[count].equals("null")){ 
                temp.right = new TreeNode(Integer.parseInt(cur[count]));
                queue.add(temp.right);
            }
            count++;
        }
        return ans;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
