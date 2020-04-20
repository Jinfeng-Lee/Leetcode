class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        Arrays.sort(nums);                                        //注意这里需要排序，排序使相同值的元素放在一起
        boolean[] visited  = new boolean[nums.length];
        dfs(new ArrayList<Integer>(),0,nums,visited,ans);
        return ans;
    }
    private void dfs(List<Integer> cur,int depth,int[] nums,boolean[] visited,List<List<Integer>> ans){
        if(cur.size() == nums.length){
            ans.add(new ArrayList<Integer>(cur));       //新建list保存当前状态
        }
        for(int i = 0;i<nums.length;i++){
            if(visited[i] || i>0 && nums[i] == nums[i-1] && !visited[i-1]) { continue;}     //如果与前一个元素相等且前一个元素没有遍历过，便存在在这次遍历中与之间遍历重复的情况
            visited[i] = true;
            cur.add(nums[i]);
            dfs(cur,depth+1,nums,visited,ans);
            cur.remove(cur.size()-1);       //注意每次清除的是末尾元素
            visited[i] = false;
        }
    }
}
