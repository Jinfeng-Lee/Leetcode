class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k == 0){ return new int[0];}
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int j = 0,i = 1-k;j<nums.length;i++,j++){
            if(i>0 && deque.peek() == nums[i-1]){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && deque.peekLast()<nums[j]){
                deque.removeLast();
            }
            deque.add(nums[j]);
            if(i>=0){
                res[i] = deque.peek();
            }
        }
        return res;
    }
}
