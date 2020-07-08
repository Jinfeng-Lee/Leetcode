/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        if(head == null){ return new int[0];}
        LinkedList<Integer> temp = new LinkedList<Integer>();
        while(head!=null){
            temp.addFirst(head.val);
            head = head.next;
        }
        int[] ans = new int[temp.size()];
        int i = 0;
        while(!temp.isEmpty()){
            ans[i] = temp.poll();
            i++;
        }
        return ans;
    }
}
