class Solution {
    int[] queen;
    int[] rows;
    int[] mains;
    int[] secondaries;    
    int n;
    List<List<String>> solutions = new ArrayList();
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        rows = new int[n];
        mains = new int[2*n-1];
        secondaries = new int[2*n-1];
        queen = new int[n];
        backtracking(0);
        return solutions;
    }
    private void backtracking(int row){
        if(row >= n) return;
       for(int i = 0;i<n;i++){
           if(isNotUnderAttack(row,i)){
               addQueen(row,i);
               backtracking(row+1);
               if(row == n-1){ addSolution();}
               removeQueen(row,i);
           }
       }  
    }
    private boolean isNotUnderAttack(int row,int col){
        int res = rows[col] + mains[row-col+n-1] + secondaries[row+col];
        return res == 0;
    }
    private void addQueen(int row,int col){
        queen[row] = col;
        rows[col] = 1;
        mains[row-col+n-1] = 1;
        secondaries[row+col] = 1;
    }
    private void removeQueen(int row,int col){
        queen[row] = 0;
        rows[col] = 0;
        mains[row-col+n-1] = 0;
        secondaries[row+col] = 0;
    }
    private void addSolution(){
        List<String> ans = new ArrayList();
        for(int i = 0;i<n;i++){
            StringBuilder temp = new StringBuilder();
            int col = queen[i];
            for(int j=0;j<col;j++){ temp.append(".");}
            temp.append("Q");
            for(int k=col+1;k<n;k++){ temp.append(".");}
            ans.add(temp.toString());
        }
        solutions.add(ans);
    }
}
