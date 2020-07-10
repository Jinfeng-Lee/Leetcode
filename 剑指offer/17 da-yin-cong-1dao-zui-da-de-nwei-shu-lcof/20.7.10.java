class Solution {
    public int[] printNumbers(int n) {
        int size = 0;
        for(int i =0;i<n;i++){
            size += Math.pow(10,i) * 9;
        }
        int[] ans = new int[size];
        for(int i = 0;i<size;i++){
            ans[i] = i+1;
        }
        return ans;
    }
}
