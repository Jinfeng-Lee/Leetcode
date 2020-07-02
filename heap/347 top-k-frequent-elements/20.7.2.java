class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> exist = new HashMap<>();
        for(int num:nums){
            exist.put(num,exist.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((o1,o2)->exist.get(o1)-exist.get(o2));
        for(int num:exist.keySet()){
             heap.add(num);
            if(heap.size()>k){
                heap.poll();
            }
        }
        LinkedList<Integer> ans = new LinkedList<Integer>();
        while(!heap.isEmpty()){
            ans.add(heap.poll());
        }
        Collections.reverse(ans);
        int[] real = new int[ans.size()];
        int count = 0;
        while(ans.size()>0){
            real[count++] = ans.poll();
        }
        return real;
    }
}
