class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        if(nums.length<4){
            return ans;
        }
        Arrays.sort(nums);
        for(int i =0;i<=nums.length-4;i++){
            for(int j=nums.length-1;j>=i+3;j--){
                int left = i+1;
                int right = j-1;
                while(left<j-1&& right>i+1 && left<right){
                    if(nums[i] + nums[j] + nums[left] + nums[right] == target){
                        List<Integer> temp2 = Arrays.asList(nums[i],nums[left],nums[right],nums[j]);   //这里注意不要用赋值数组形式 只能这种
                        if(!ans.contains(temp2)){
                            ans.add(temp2);
                        }
                        left++;
                        right--;
                    }else if(nums[i] + nums[j] + nums[left] + nums[right] > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}
//减少时间复杂度的方法：开始判断nums[i]+nums[j]+nums[j-1]+nums[j-2]是否大于小于最大值 nums[i]+nums[i+1]+nums[i+2]+nums[j]是否小于最小值 每次
//变化时候都可以检测一下  还有就是符合条件加入ans里时候 left++ right-- 要判断是否跟变化前的值是不一样的
