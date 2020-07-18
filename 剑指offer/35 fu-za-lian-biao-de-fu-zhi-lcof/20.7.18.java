/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){ return null;}
        HashMap<Node,Node> exist = new HashMap<>();
        Node cur = head;
        while(cur!=null){
            exist.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            exist.get(cur).next = exist.get(cur.next);
            exist.get(cur).random = exist.get(cur.random);
            cur = cur.next;
        }
        return exist.get(head);
    }
}
//用一个HashMap就可以解决 
