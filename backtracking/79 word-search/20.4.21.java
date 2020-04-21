class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int row2 = board[0].length;                         //这里的row2是column  这里可以不创建引用 简化代码
        boolean[][] visited = new boolean[row][row2];       //做完之后 想到可以不用辅助数组 直接将遍历过的字母设置为肯定不会出现在数组中的值如.
        for(int i = 0;i<row;i++){
            for(int j = 0;j<row2;j++){
                if(word.charAt(0)==board[i][j]){            
                    visited[i][j] =true;
                    if(dfs(i,j,board,word,1,visited)){return true;}
                    visited[i][j] =false;
                }
            }
        }
        return false;
    }
    private boolean dfs(int row,int row2,char[][] board,String word,int location,boolean[][] visited){
        if(location == word.length()){                //这里可以设置个flag 用于全局标记是否已找到word 这样其他的树枝就不必搜寻
            return true;
        }                                             //因为这题剪掉的树枝比采用的树枝多 可以用return false的情况来简化代码
        if(row>0 && board[row-1][row2] == word.charAt(location)&&!visited[row-1][row2]){
            visited[row-1][row2] = true;
            if(dfs(row-1,row2,board,word,location+1,visited)){
                return true;
            }
            visited[row-1][row2] = false;
        }
         if(row<board.length-1 && board[row+1][row2] == word.charAt(location)&&!visited[row+1][row2]){
             visited[row+1][row2] = true;
            if(dfs(row+1,row2,board,word,location+1,visited)){
                return true;
            }
             visited[row+1][row2] = false;
        }
         if(row2>0 && board[row][row2-1] == word.charAt(location)&&!visited[row][row2-1]){
             visited[row][row2-1] = true;
            if(dfs(row,row2-1,board,word,location+1,visited)){
                return true;
            }
             visited[row][row2-1] = false;
        }
         if(row2<board[0].length-1 && board[row][row2+1] == word.charAt(location)&&!visited[row][row2+1]){
             visited[row][row2+1] = true;
            if(dfs(row,row2+1,board,word,location+1,visited)){
                return true;
            }
             visited[row][row2+1] = false;
        }
        return false;
    }
}
//虽然能AC 但是需要简化 在采取的路线通过置换为.来少用一个boolean数组 return四种情况的|| 来返回boolean
//当剪掉的树枝比剩下的多时，可以通过判断剪掉的情况 返回false来简化代码
