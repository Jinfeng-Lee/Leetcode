class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList());
        if(nums.length == 0){
            return ans;
        }
        Arrays.sort(nums);                                  //套的模板 不用排序也行
        dfs(new ArrayList(),nums,0,ans);
        
        return ans;
    }
    private void dfs(List<Integer> cur,int[] nums,int start,List<List<Integer>> ans){
        if(cur.size() == nums.length){
            return;
        }
        for(int i = start;i<nums.length;i++){
            cur.add(nums[i]);                               
            ans.add(new ArrayList(cur));                    //这里不是到cur.size == nums.length再add 而是每次都保存当前状态
            dfs(cur,nums,i+1,ans);                          //元素不可重复 从下一个元素继续开始遍历
            cur.remove(cur.size()-1);                       
        }
    }
}
