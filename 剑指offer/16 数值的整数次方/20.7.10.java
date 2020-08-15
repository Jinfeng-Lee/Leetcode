class Solution {
    public double myPow(double x, int n) {
        if( n == 0){return 1.0f;}
        long m = n;
        boolean flag = n>0?true:false;
        m = Math.abs(m);    //最关键的是这里 如果输入的n为-2147483648 去绝对值之后就会超出范围 所以解决方法是用个long 
        double ans = 1.0f;
        for(long a = m;a>0;a/=2){
            if(a % 2 == 1){ ans = ans * x;}
            x = x * x;
        }
        return ans = flag?ans:1.0f/ans;
    }
}
