/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    Stack<TreeNode> s;
    public BSTIterator(TreeNode root) {
        s = new Stack<TreeNode>();
        this.findMostLeft(root);
    }
    private void findMostLeft(TreeNode root){
        while(root!=null){
            this.s.push(root);
            root = root.left;
        }
    }
    /** @return the next smallest number */
    public int next() {
        TreeNode temp = this.s.pop();
        if(temp.right!=null){
            this.findMostLeft(temp.right);
        }
        return temp.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
 //注意next 时间复杂度是O(1) 用了摊还分析
