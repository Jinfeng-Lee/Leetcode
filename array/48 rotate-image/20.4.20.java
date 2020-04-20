class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i= 0 ;i<(n+1)/2;i++){
            for(int j =0;j<n/2;j++){
                int temp = matrix[n-1-i][j];
                matrix[n-1-i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = matrix[i][n-1-j];
                matrix[i][n-1-j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
    }
}
//将正方形分成四个部分来旋转，注意每个坐标在旋转时的变化，以图例为参考来旋转。
