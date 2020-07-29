class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(num!=count){
                return count;
            }
            count++;
        }
        return nums.length;
    }   
}
