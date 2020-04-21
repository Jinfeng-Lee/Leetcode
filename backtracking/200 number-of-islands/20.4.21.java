class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        if(grid == null){ return ans;}
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1')           //当找到岛屿的部分时 开始搜寻这块岛屿的所有边界，把这些边界做标记
                { 
                    ans += 1;
                    dfs(i,j,grid);
                }
            }
        }
        return ans;
    }
    private void dfs(int i,int j,char[][] grid){
        if(i < 0||i > grid.length -1 || j<0 || j>grid[0].length-1 || grid[i][j]!='1' ){ return;}  //遇到数组的边界或者碰到不是岛屿的部分时 返回
        grid[i][j] = '2';                       //对已经遍历过的部分做标记
        dfs(i+1,j,grid);          
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);                        //对四个方向的可能存在的岛屿部分遍历
    }
}
