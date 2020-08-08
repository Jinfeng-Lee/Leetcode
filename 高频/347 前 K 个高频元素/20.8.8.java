class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> cur = new HashMap();
        for(int num:nums){
            cur.put(num,cur.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> order = new PriorityQueue<Integer>((o1,o2) -> (cur.get(o2)-cur.get(o1)));
        for(int e:cur.keySet()){
            order.add(e);
        }
        int[] ans = new int[k];
        for(int i = 0;i<k;i++){
            ans[i] = order.poll();
        }
        return ans;
    }
}
