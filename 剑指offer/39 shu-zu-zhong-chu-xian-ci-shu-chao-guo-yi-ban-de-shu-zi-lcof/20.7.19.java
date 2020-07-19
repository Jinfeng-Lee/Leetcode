class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cur = 0;
        for(int num:nums){
            if(count == 0){
                cur = num;
                count = 1;
            }else if(count > 0 && num!=cur){
                count--;
            }else{
                count++;
            }
        }
        return cur;
    }
}
//摩尔投票法
