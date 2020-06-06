class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if(row < 1){ return 0;}
        int column = matrix[0].length;
        int[][] dp = new int[row][column];
        int maxEdge = 0;
        for(int i =0;i<row;i++){
            dp[i][0] = matrix[i][0] == '0'? 0:1;
            if(dp[i][0] == 1){ maxEdge = 1;}
        }
        for(int i = 0;i<column;i++){
            dp[0][i] = matrix[0][i] == '0'? 0:1;
            if(dp[0][i] == 1){ maxEdge = 1;}        //可以省略
        }
        for(int i = 1;i<row;i++){
            for(int j = 1;j<column;j++){
                if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    maxEdge = Math.max(dp[i][j],maxEdge);
                }
            }
        }
        return (int)Math.pow(maxEdge,2);
    }
}
