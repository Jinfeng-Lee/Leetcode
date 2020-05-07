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
        return helper(root,"");
    }
    private String helper(TreeNode root, String data){
        if(root == null){ return data += "null,";}
        data += String.valueOf(root.val) + ",";
        data = helper(root.left,data);
        data = helper(root.right,data);
        return data;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList(Arrays.asList(data_array));
        return helper_deserialize(data_list);
    }
    private TreeNode helper_deserialize(List<String> data_list){
        if(data_list.size() == 0){ return null;}
        if(data_list.get(0).equals("null")){ //pay attention to
            data_list.remove(0);
            return null;
        }
        TreeNode ans = new TreeNode(Integer.parseInt(data_list.get(0)));//valueOf
        data_list.remove(0);
        ans.left = helper_deserialize(data_list);
        ans.right = helper_deserialize(data_list);
        return ans;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
