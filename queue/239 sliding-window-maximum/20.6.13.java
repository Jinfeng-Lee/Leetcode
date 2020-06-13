class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < 2){
            return nums;                                            //boundary
        }
        LinkedList<Integer> queue =  new LinkedList<Integer>();    
        int[] result = new int[nums.length-k+1];
        for(int i = 0;i<nums.length;i++){
            while(!queue.isEmpty() && nums[queue.peekLast()]<=nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if(queue.peek()<=i-k){
                queue.poll();
            }      
            if(i+1>=k){
                result[i+1-k] = nums[queue.peek()]; 
            }
        }
        return result;
    }
}
