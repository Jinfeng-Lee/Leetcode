/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){ return null;}
        ListNode cur = head;
        ListNode front = null;
        ListNode Nodenext = head.next;
        while(Nodenext!=null){
            ListNode temp = Nodenext.next;
            cur.next = front;
            front = cur;
            Nodenext.next = cur;
            cur = Nodenext;
            Nodenext = temp;
        }
        return cur;
    }
}
