class Solution {
    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 1;
        int sum = 1;
        List<int[]> ans  = new ArrayList();
        while(left<=target/2){
            if(sum > target){
                sum -= left;
                left++;
            }else if(sum < target){
                right++;
                sum += right;
            }else{
                int[] res = new int[right-left+1];
                for(int i = 0;i<right-left+1;i++){
                    res[i] = left + i;
                }
                ans.add(res);
                sum -= left;
                left++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
