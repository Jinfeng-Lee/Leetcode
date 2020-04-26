class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]== 0){
                ans = Math.max(ans,0);
                continue;            //零得跳过
            }
            int temp = 1;             
            for(int j = i;j<nums.length;j++){   
                if(nums[j]!=0){
                    temp *= nums[j];
                    ans = Math.max(ans,temp);     //找出最大值
                }else{
                    break;                        //如果碰到0 之后的遍历会包括后面的情况 避免重复查找 break
                }
           }
        }
        return ans;
    }
}
//应该选择另一种动态规划的方法
