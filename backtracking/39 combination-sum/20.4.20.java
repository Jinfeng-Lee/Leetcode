class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(candidates.length == 0){
            return ans;
        }
        Arrays.sort(candidates);
        dfs(candidates,0,new ArrayList<Integer>(),ans,target);
        return ans;
    }
    private void dfs(int[] nums, int start, List<Integer> cur, List<List<Integer>> ans, int target){
        for(int i = start;i<nums.length;i++){             //这里用start来避免重复的list
            if(target == nums[i]){                        //判断target == nums[i]
                List<Integer> temp = new ArrayList<>(cur);//注意需要新建一个list 保存当前的状态
                temp.add(nums[i]);
                ans.add(temp);
            }else if(target > nums[i]){                   //判断target > nums[i]
                List<Integer> temp = new ArrayList<>(cur);
                temp.add(nums[i]);
                dfs(nums,i,temp,ans,target-nums[i]);
            }
        }
    }
}
