public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0){ return 1.0F;}
        if(base == 0){ return 0.0;}
        boolean flag = exponent>0?true:false;
        long m = Math.abs(exponent);
        double ans = 1.0F;
        double x = base;
        for(long a = m;a>0;a/=2){
            if(a %2 == 1){ ans *= x;}
            x = x * x;
        }
        return flag == true?ans:1.0F/ans;
  }
}
