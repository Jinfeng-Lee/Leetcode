class Solution {
    public int row,column;
    public int[][] dirs= {{0,1},{0,-1},{1,0},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        row = matrix.length;
        column = matrix[0].length;
        int[][] memo = new int[row][column];
        int maxCount = 0;
        for(int i =0;i<row;i++){
            for(int j = 0;j<column;j++){
                maxCount = Math.max(maxCount,dfs(i,j,matrix,memo));
            }
        }        
        return maxCount;
    }
    public int dfs(int row,int column,int[][] matrix,int[][] memo){
        if(memo[row][column] != 0){
             return memo[row][column];
        }
        memo[row][column]++;
        for(int[] dir: dirs){
            int newRow = row+dir[0];
            int newColumn = column+dir[1];
            if(newRow<matrix.length && newRow >= 0 && newColumn < matrix[0].length && newColumn >=0 && matrix[newRow][newColumn] > matrix[row][column]){
                memo[row][column] = Math.max(dfs(newRow,newColumn,matrix,memo) + 1,memo[row][column]);
            }        
        }
        return memo[row][column];
    }
}
