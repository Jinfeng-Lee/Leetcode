class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(v1,v2)-> v1[0] == v2[0]?v1[1]-v2[1]:v1[0]-v2[0]);  //先对二维数组 按升序顺序排序
        if(envelopes.length == 0){
            return 0;
        }                                                                         //判断边界
        int ans = 1;
        int[] cur = new int[envelopes.length];                                    //构造数组 记录到当前位置时的子集最优解
        cur[0] = 1;
        for(int i = 1;i<envelopes.length;i++){  
            cur[i] = 1;                                                           //初始化
            for(int j = 0;j<i;j++){
                if(envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]){       //如果能装下之前的信封，取可以装下的最大值+1
                    cur[i] = Math.max(cur[j]+1,cur[i]);
                }
            }
            ans = Math.max(ans,cur[i]);                                           //子集最优解的最大值则为该问题的最优解
    }
        return ans;
    }
}
