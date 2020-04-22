class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder ans = new StringBuilder();
        int[] fib = new int[n];
        fib[0] = 1;
        for(int i = 1;i<n;i++){
            fib[i] = i * fib[i-1];
        }
        List<Integer> cur = new ArrayList();
        for(int i = 1;i<n+1;i++){
            cur.add(i);
        }
        for(int i = n;i>0;i--){
            int temp = 0;
            if(k > fib[i-1]){
                temp = (k-1) / fib[i-1];
                k -= temp * fib[i-1];
            }  
            ans.append(cur.get(temp));
            cur.remove(temp);
     
        }
        return ans.toString();
    }
}
