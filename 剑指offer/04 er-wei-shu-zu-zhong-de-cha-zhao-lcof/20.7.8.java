class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null) {return false;}
        int rows = matrix.length;
        if(rows<1){ return false;}
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        while(row < rows && column >=0){
            if(matrix[row][column] == target){
                return true;
            }else if(matrix[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}
