class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int temp = 0;
        for(int a:nums){
            if(a == 1){ temp++;}
        }
        for(int i =0;i<nums.length;i++){
            if(nums.length < i + temp + k * (temp-1)){
                return false;
            }
            if(nums[i] == 1){temp--;}        
        }
        return true;
    }
}
//5.3周赛第二道题
