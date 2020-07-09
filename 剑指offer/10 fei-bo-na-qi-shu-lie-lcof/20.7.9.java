class Solution {
    public int fib(int n) {
        if(n == 0){ return 0;}
        if(n == 1){ return 1;}
        int[] temp = new int[2];
        temp[0] = 0;
        temp[1] = 1;
        for(int i = 2;i<=n;i++){
            if((temp[0]/10 + temp[1]/10) > 100000000 || ((temp[0]/10 + temp[1]/10) == 100000000) && (temp[0]%10 + temp[1]%10 >= 7) 
               || ((temp[0]/10 + temp[1]/10) == 100000000-1) && (temp[0]%10 + temp[1]%10 >= 17)){
                temp[i & 1] = -1000000007 + temp[0] + temp[1];
            }else{
                temp[i & 1] = temp[0] + temp[1];
        }
        }
        return temp[n & 1];
    }
}
