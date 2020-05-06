class Solution {
    public int numTrees(int n) {
        if(n == 0){ return 1;}
        double a = 1.0;
        for(int i = 1;i<n;i++){
            a = (double)(4*i+2)/(i+2) * a;
        }
        return (int)a;
    }
}
//卡特兰数
https://baike.baidu.com/item/%E5%8D%A1%E7%89%B9%E5%85%B0%E6%95%B0
