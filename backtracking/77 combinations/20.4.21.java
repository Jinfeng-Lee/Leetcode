class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
     
        int[] nums = new int[n];                        //跟之前的题类似 只不过这里的数组是自己建的 也省略了排序
        for(int i = 0;i<n;i++){
            nums[i] = i+1;
        }
        dfs(new ArrayList(),nums,0,ans,k);              
        return ans;
    }
    private void dfs(List<Integer> cur,int[] nums,int start,List<List<Integer>> ans,int k){
        if(cur.size()==k){                              //这里也有一点变化 是判断是否等于k 所以参数中加了个k
            ans.add(new ArrayList(cur));    
        }
        for(int i = start;i<nums.length;i++){           //其他的就没有什么变化 这里依然是用start和k+1的配合
            cur.add(nums[i]);
            dfs(cur,nums,i+1,ans,k);
            cur.remove(cur.size()-1);
        }
    }
}
