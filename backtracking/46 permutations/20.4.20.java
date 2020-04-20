class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        boolean[] visited = new boolean[nums.length];   //建立boolean数组来标记遍历过的元素
        dfs(new ArrayList<Integer>(),0,visited,nums,ans);
        return ans;
    }
    private void dfs(List<Integer> cur, int depth,boolean[] visited,int[] nums,List<List<Integer>> ans){
        if(depth == nums.length){
            ans.add(new ArrayList<Integer>(cur));
        }
        for(int i = 0;i<nums.length;i++){               //如果遍历过，便跳过。否则遍历，再回溯继续下一个元素的遍历。
            if(visited[i]){ continue;}
            visited[i] = true;
            cur.add(nums[i]);
            dfs(cur,depth+1,visited,nums,ans);
            cur.remove(cur.size()-1);
            visited[i] = false;
        }
    }
}
