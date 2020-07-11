class Solution {
    public int[] exchange(int[] nums) {
        int right  = nums.length-1;
        int i = 0;
        while(i<right){
            if(nums[i] % 2 == 1){
                i++;
            }else{
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
            }
        }
        return nums;
    }
}
