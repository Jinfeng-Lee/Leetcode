class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        if(candidates.length == 0){
            return ans;
        }
        Arrays.sort(candidates);
        boolean[] visited = new boolean[candidates.length];               //这个不必要
        dfs(new ArrayList(),candidates,target,visited,ans,0);
        return ans;
    }
    private void dfs(List<Integer> cur,int[] candidates, int target,boolean[] visited,List<List<Integer>> ans,int start){
        if(target == 0){
            ans.add(new ArrayList(cur));
        }
        for(int i = start;i<candidates.length;i++){
            if(candidates[i]<= target)
            {
                if(visited[i] || i>0 && candidates[i] == candidates[i-1] && !visited[i-1]){ continue;}
                visited[i] = true;                                        //这个不必要
                cur.add(candidates[i]);                   
                dfs(cur,candidates,target-candidates[i],visited,ans,i+1);
                cur.remove(cur.size()-1);
                visited[i] = false;                                       //这个不必要
        }else{
                return;
            }
        }
    }
}
//第一次写，考虑到使用boolean数组visited 其实可以不用使用 
//避免重复的情况 通过if(i>start && candidates[i] == candidates[i-1]) {continue;}来实现 这次循环的所有情况都是前一个相同数情况的子集 
已经考虑过 就不用想了
//当{1，1，2}和{1，2，1}作为list中两种可以同时存在的情况时，用visited数组，反之则不需要visited数组 通过start 和i+1即可实现
//对于int[] nums 为了避免重复的情况 建议先用sort排序
