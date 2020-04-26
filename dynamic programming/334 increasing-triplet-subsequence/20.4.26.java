class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int m1 = nums[0];
        int m2 = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>m2 && flag){      //存在长度为2的递增区间 且大于那个较大值
                return true;
            }
            if(nums[i]>m1){              //存在长度为2的递增区间 
                flag = true;
            }
            m1 = Math.min(nums[i],m1);     //找到目前较小值 目的之后更新较小值
            if(nums[i]>m1 && nums[i]<m2){  //更新较大值
                m2 = nums[i];
            }
        }
        return false;
    }
}
