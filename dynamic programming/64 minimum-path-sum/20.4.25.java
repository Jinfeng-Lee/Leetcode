class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        int[][] minarray = new int[grid.length][grid[0].length];    //创建辅助数组
        minarray[0][0] = grid[0][0];
        for(int i=1;i<grid[0].length;i++){
            minarray[0][i] = minarray[0][i-1] + grid[0][i];
        }
        for(int i=1;i<grid.length;i++){
            minarray[i][0] = minarray[i-1][0] + grid[i][0];
        }                                                           //定义数组边界情况
        for(int i = 1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                minarray[i][j] = Math.min(minarray[i-1][j],minarray[i][j-1]) + grid[i][j];
            }                                                       //逐个解决子问题
        }
        return minarray[grid.length-1][grid[0].length-1];
    }
}
//子问题不一定是最终解 为动态规划问题
