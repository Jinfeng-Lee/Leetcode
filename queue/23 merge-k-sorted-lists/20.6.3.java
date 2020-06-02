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
    
        Queue<ListNode> cur = new PriorityQueue<ListNode>((v1,v2)->v1.val-v2.val);//小根堆 优先队列
        for(ListNode list:lists){
            if(list!=null){
                cur.offer(list);
            }
        }                             //初始化
        
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(!cur.isEmpty()){
            tail.next = cur.poll();
            tail = tail.next;
            if(tail.next!=null){
                cur.offer(tail.next);     //如果下一个结点不为空 添加进去
            }
        }
        return head.next;
    }
}
