class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList());
        if(nums.length == 0){
            return ans;
        }
        Arrays.sort(nums);                                      //这里必须排序 来避免重复的情况
        dfs(new ArrayList(),nums,0,ans);
        return ans;
    }
    private void dfs(List<Integer> cur,int[] nums,int start,List<List<Integer>> ans){
        if(cur.size() == nums.length){
            return;
        }
        for(int i = start;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && i-1>=start){ continue;}       //当相同的元素在同一次遍历中时，除了第一次，之后的元素都跳过
            cur.add(nums[i]);
            ans.add(new ArrayList(cur));
            dfs(cur,nums,i+1,ans);                              //记得从下一个元素开始新的遍历 用i+1
            cur.remove(cur.size()-1);
        }
    }
    
}
