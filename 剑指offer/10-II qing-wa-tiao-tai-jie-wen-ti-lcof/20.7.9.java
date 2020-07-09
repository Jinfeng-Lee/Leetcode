class Solution {
    public int numWays(int n) {
        if(n == 0){ return 1;}
        if(n == 1){ return 1;}
        int[] temp = new int[2];
        temp[0] = 1;
        temp[1] = 1;
        for(int i = 2;i<= n;i++){
           temp[i & 1] = (temp[0] + temp[1]) % 1000000007;
        }
        return temp[n & 1];
    } 
}
