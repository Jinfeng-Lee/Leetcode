class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder ans = new StringBuilder();        //这里是字符串的拼接 要用StringBuilder 时间长了就忘
        int[] fib = new int[n];                         
        fib[0] = 1;
        for(int i = 1;i<n;i++){
            fib[i] = i * fib[i-1];
        }                                               //这里是构建斐波那契数列
        List<Integer> cur = new ArrayList();
        for(int i = 1;i<n+1;i++){
            cur.add(i);
        }                                               //这里是构建初始的n个数的list 方便之后get和remove
        for(int i = n;i>0;i--){                     
            int temp = 0;       
            if(k > fib[i-1]){                           //如果当前k小于此时的分组数那么就是temp = 0 第一组 否则要进行floor运算 算出组数
                temp = (k-1) / fib[i-1];                //这里注意减一 因为当k等于组数时 相除是等于1 而实际temp应为0 并且在之后组数+1的情况再减一
                k -= temp * fib[i-1];                   //并不会改变temp的值，所以要减一
            }                                           //如果不在第一组 则要减去之前的元素 等于每次的k都是相同意义上的找到第几组
            ans.append(cur.get(temp));                  //加上元素
            cur.remove(temp);                           //从list中除去相应的元素
     
        }
        return ans.toString();                          //最后注意返回string
    }
}
//其实这题第一次做耗费了点时间 判断当k > fib[i-1] 对于temp需要如何改变 以及k如何改变 难了一会儿  这里应该考虑的是怎么变为和之前一样相同的情况 而不是
//用余数来进行变化
