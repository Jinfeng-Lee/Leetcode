class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1 || matrix == null || matrix[0].length<1){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int curRow = 0;
        int curColumn = columns-1;
        while(matrix[curRow][curColumn]!=target){
            if(target > matrix[curRow][curColumn]){
                if(curRow+1<rows){                  //判断边界
                    curRow++;
                }else{
                    return false;
                }
            }else{
                if(curColumn-1>=0){
                    curColumn--;                    //判断边界
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
//以右上角为基准 大于左边的值 小于下面的值
