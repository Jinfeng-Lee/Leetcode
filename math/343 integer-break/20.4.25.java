class Solution {
    public int integerBreak(int n) {
        if(n<=2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int temp = n /3;
        switch(n % 3){
            case 0:
                return (int)Math.pow(3,temp);
            case 1:
                return (int)Math.pow(3,temp-1) * 2 * 2;
        }
        return (int)Math.pow(3,temp) * 2;
    }
}
//这题是找规律
//需要注意的是 Math.pow(a,b)参数 oracle文档都是double类型的 返回值也是double类型的 需要转化为int类型
