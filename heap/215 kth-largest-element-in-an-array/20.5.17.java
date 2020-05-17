class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<Integer>((n1,n2)->n1-n2);
        for(int m: nums){
            ans.add(m);
            if(ans.size()>k){
                ans.poll();
            }
        }
        return  ans.poll();
    }
}
//构建大顶堆 应用优先队列来实现
