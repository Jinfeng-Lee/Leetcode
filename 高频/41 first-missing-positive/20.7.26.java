class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0){ return 1;}
        int len = nums.length;
        for(int i = 0;i<len;i++){
            while(nums[i]>=1 && nums[i]<=len && nums[nums[i]-1]!= nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i = 0;i<len;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;
    }
    
    public void swap(int[] nums,int index,int index2){
        int temp = nums[index];
        nums[index] = nums[index2];
        nums[index2] = temp;
    }
}
