class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length < 1){
             return  0;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int maxarea = 0;
        int[] left = new int[columns];
        int[] right = new int[columns];
        int[] height = new int[columns];
        Arrays.fill(left,-1);
        Arrays.fill(right,columns);
        for(int row = 0;row<rows;row++){
            for(int i = 0;i<columns;i++){
                if(matrix[row][i] == '1'){
                    height[i] +=1;
                }else{
                    height[i] = 0;
                }
            }
            int boundary = -1;
            for(int column =0;column<columns;column++){
                if(matrix[row][column] == '1'){
                    left[column] = Math.max(boundary,left[column]);    //比较上一层的边界和这一层的断点
                }else{
                    left[column] = -1;
                    boundary = column;                                 //更新断点 重置上一层
                }
            }
            boundary = columns;
             for(int column = columns-1;column>=0;column--){
                if(matrix[row][column] == '1'){
                    right[column] = Math.min(boundary,right[column]);   //比较上一层的边界和这一层的断点
                }else{
                    right[column] = columns;
                    boundary = column;                                  //更新断点 重置上一层
                }
            }    
            for(int i = 0;i<columns;i++){
                int area = height[i] * (right[i] - left[i] -1);       //计算矩形面积
                maxarea = Math.max(area,maxarea);
            }
        }
        return maxarea;
    }
}
