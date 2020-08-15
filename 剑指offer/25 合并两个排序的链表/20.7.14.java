/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){ return l2;}
        if(l2 == null){ return l1;}
        ListNode left = l1;
        ListNode right = l2;
        ListNode cur = new ListNode(0);
        ListNode ans = cur;
        while(left!=null && right!=null){
            if(left.val <= right.val){
                cur.next = left;
                left = left.next;
                cur = cur.next;         //别忘了
            }else{
                cur.next = right;
                right = right.next;
                cur = cur.next;
            }
        }
        cur.next = left==null?right:left;
        return ans.next;
    }
} 
