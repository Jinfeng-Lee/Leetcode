  class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length < 2 ){
            return true;
        }                                       //判断边界
        int max_length = nums[0];               //初始化
        for(int i = 0;i<nums.length;i++){
            if(i>max_length){
                return false;                   //如果当前下标 之前的都到不了 就返回false
            }else{ max_length = Math.max(max_length,nums[i]+i);} //如果当前下标可以到达 更新最大可达距离
            if(max_length >= nums.length-1) {return true;}      //如果可以到达最远点 返回true
        }
        return false;
 }
}
