/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) {return null;}
        if(head.val == val){ return head.next;}
        ListNode pre = new ListNode(0);
        ListNode header = head;
        while(head!=null){
            if(head.val == val){
                pre.next = head.next;
                break;
            }
            pre = head;
            head = head.next;
        }
        return header;
    }
}
