/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Node leftMost = root;
        while(leftMost.left!=null){//注意先判断下面一层有没有结点
            Node head = leftMost;
            while(head!=null){//如果这层没有结点了就退出
                head.left.next = head.right;//connection1
                if(head.next!=null){
                    head.right.next = head.next.left;//connection2
                }
                head = head.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}


      
