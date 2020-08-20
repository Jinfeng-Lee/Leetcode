class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length<1 || board[0].length<1){
            return false;
        }
        int rows = board.length;
        int columns = board[0].length;
        if(word.length() > rows * columns){
            return false;
        }
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int m,int n,int index){
        if(m>=board.length || m<0 || n>=board[0].length || n<0){ return false;} //事先判断可以减少代码量
        if(board[m][n]!=word.charAt(index)){ return false;}
        if(index == word.length()-1){ return true;}
        
        char temp = board[m][n];    //这里关键是对遍历过的char进行替代标记
        board[m][n] = '/';     
        boolean ans = dfs(board,word,m-1,n,index+1) || dfs(board,word,m+1,n,index+1) || dfs(board,word,m,n+1,index+1) || dfs(board,word,m,n-1,index+1);
        board[m][n] = temp;
        return ans;
        
    }
}
