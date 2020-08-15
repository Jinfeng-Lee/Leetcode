/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null){ return null;}
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        count = count - k;
        while(count>0){
            head = head.next;
            count--;
        }
        return head;
    }
}
