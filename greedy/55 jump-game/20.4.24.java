  class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length < 2 ){
            return true;
        }
        int max_length = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(i>max_length){
                return false;
            }else{ max_length = Math.max(max_length,nums[i]+i);}
            if(max_length >= nums.length-1) {return true;}
        }
        return false;
 }
}
