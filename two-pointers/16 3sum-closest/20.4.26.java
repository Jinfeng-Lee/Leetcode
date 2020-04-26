class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3){
            return nums[0] + nums[1] + nums[2];   //判断边界
        }
        int ans = Integer.MAX_VALUE;
        int real = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            int mid = i+1;
            int right = nums.length-1;
            while(mid<right){
                int sum = nums[i] + nums[mid] + nums[right];
                if(Math.abs(sum-target)<ans){
                    ans = Math.abs(sum-target);     //找到最近
                    real = sum;                     //储存当前状态
                }
                if(sum == target){
                    return target;                  //如果相等
                }else if(sum < target){
                    mid++;
                }else{
                    right--;
                }                                 
        }
        }
        return real;
    }
}
