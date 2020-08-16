import java.util.HashMap;
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        HashMap<RandomListNode,RandomListNode> cur = new HashMap();
        RandomListNode temp = pHead;
        while(temp!=null){
            cur.put(temp,new RandomListNode(temp.label));
            temp = temp.next;
        }
        temp = pHead;
        while(temp!=null){
            cur.get(temp).next = cur.get(temp.next);
            cur.get(temp).random = cur.get(temp.random);
            temp = temp.next;
        }
        return cur.get(pHead);
    }
}
