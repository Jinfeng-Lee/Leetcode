//顺序合并 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for(ListNode list:lists){
            ans = mergeTwoLists(ans,list);
        }
        return ans;
    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode header = new ListNode(0);
        ListNode ans = header;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ans.next = l1;
                ans = ans.next;
                l1 = l1.next;
            }else{
                ans.next = l2;
                ans = ans.next;
                l2 = l2.next;
            }
        }
        ans.next = l1==null?l2:l1;
        return header.next;
    }
}
//归并分治
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null){ return null;}
        if(lists.length == 0){ return null;}
        if(lists.length == 1){ return lists[0];}
        return merge(lists,0,lists.length-1);
    }
    public ListNode merge(ListNode[] lists,int left,int right){
        if(left == right){ return lists[left];}
        int mid = left + (right - left)/2;
        return mergeTwoLists(merge(lists,left,mid),merge(lists,mid+1,right));
    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode header = new ListNode(0);
        ListNode ans = header;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ans.next = l1;
                ans = ans.next;
                l1 = l1.next;
            }else{
                ans.next = l2;
                ans = ans.next;
                l2 = l2.next;
            }
        }
        ans.next = l1==null?l2:l1;
        return header.next;
    }
}
//优先队列
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null){ return null;}
        if(lists.length == 0){ return null;}
        if(lists.length == 1){ return lists[0];}
        PriorityQueue<ListNode> cur = new PriorityQueue<ListNode>((o1,o2)->(o1.val - o2.val));
        for(ListNode list:lists){
            if(list !=null){
                cur.offer(list);
            }
        }
        ListNode header = new ListNode(0);
        ListNode ans = header;
        while(!cur.isEmpty()){
            ListNode temp = cur.poll();
            ans.next = temp;
            ans = ans.next;
            if(temp.next!=null){
                cur.add(temp.next);
            }
        }
        return header.next;
    }
}
