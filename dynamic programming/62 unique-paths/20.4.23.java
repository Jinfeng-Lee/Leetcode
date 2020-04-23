class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] res = new int[n][m];
        for(int i = 0;i<m;i++){
            res[0][i] = 1;
        }
        for(int i = 0; i<n;i++){
            res[i][0] = 1;
        }                                       //对于上边界和左边界设为1
        for(int i = 1;i<n;i++){
            for(int j=1;j<m;j++){
                res[i][j] = res[i-1][j] + res[i][j-1];        //对于每一个点 到达这个点的方式只有两种 从上面下来 或者从左边过来 那么到达这个点的
            }                                                 //路径就是两种方式相加
        }
        return res[n-1][m-1];
    }
}
//典型的动态规划 只要想到动态规划就好做 路径一般可以先想动态规划
