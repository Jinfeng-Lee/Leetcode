class Solution {
    int m,n,k;
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        if(k == 0 || m == 1 && n == 1){
            return 1;
        }
        boolean[][] visited = new boolean[m][n];
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = visited;
        return dfs(0,0,0,0);
    }
    public int dfs(int row,int column,int si,int sj){
        if(row>=m || column >= n || si+sj>k || visited[row][column]){ return 0;}
        visited[row][column] = true;
        return 1+dfs(row+1,column,(row+1)%10!=0?si+1:si-8,sj) + dfs(row,column+1,si,(column+1)%10!=0?sj+1:sj-8); //注意row和column
    }
}
