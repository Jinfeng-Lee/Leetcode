class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> cur = new PriorityQueue<>();
        for(int num:arr){
            cur.add(num);
        }
        int[] ans = new int[k];
        for(int i = 0;i<k;i++){
            ans[i] = cur.poll();
        }
        return ans;
    }
}
