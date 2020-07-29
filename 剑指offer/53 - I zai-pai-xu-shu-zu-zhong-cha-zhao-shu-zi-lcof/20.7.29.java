class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int ans = 0;
        for(int num:nums){
            if((target^num) == 0) ans++;
        }
        return ans;
    }
}
