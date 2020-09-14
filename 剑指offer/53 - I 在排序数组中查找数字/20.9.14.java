class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        if(nums == null){ return count;}
        for(int num:nums){
            if(num == target){ count++;}
        }
        return count;
    }
}
