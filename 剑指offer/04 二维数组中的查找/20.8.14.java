public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || array[0].length == 0){
             return false;
        }
        int rows = array.length;
        int columns = array[0].length;
        int row = 0;
        int column = array[0].length-1;
        while(row < rows && column >= 0){
            if(array[row][column] == target){
                return true;
            }else if(array[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}
