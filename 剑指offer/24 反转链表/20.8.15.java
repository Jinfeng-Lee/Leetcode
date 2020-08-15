/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){ return head;}
        ListNode pre = null;
        ListNode nextOne = head.next;
        ListNode cur = head;
        while(nextOne!=null){
            ListNode temp = nextOne.next;
            cur.next = pre;
            pre = cur;
            nextOne.next = cur;
            cur = nextOne;
            nextOne = temp;   
        }
        return cur;
    }
}
