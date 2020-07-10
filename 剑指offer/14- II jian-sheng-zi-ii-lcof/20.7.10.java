class Solution {
    public int cuttingRope(int n) {
        if(n<=3){return n-1;}
        int b = n % 3;
        int p = 1000000007;
        long res = 1,x = 3; //这里要设成long
        for(int a = n/3-1;a>0;a/=2){
            if(a % 2 == 1){ res = (res * x)%p;}
            x = (x * x) % p;
        }//快速幂求余
        if( b == 0){ return (int)((res * 3) % p);}
        if( b == 1){ return (int)((res * 4) % p);}
        return (int)((res * 6) % p);
    }
}
