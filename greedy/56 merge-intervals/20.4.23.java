class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(v1,v2)->v1[0]-v2[0]);                //这里将二维数组按照第一个元素排序 如果v1[0]>v2[0]则v1在v2后面 升序
        int[][] res = new int[intervals.length][2];                 //创建临时二维数组
        int rds = -1;
        for(int[] interval:intervals){                              //对于每一行进行遍历
            if(rds== -1 || interval[0] > res[rds][1]){            
                res[++rds] = interval;                              //如果是第一个或者两个区间无交集 则是与前面的区间独立
            }else{
                res[rds][1] = Math.max(res[rds][1],interval[1]);    //如果有交集 区间的最右端取最大值
            }
        }
        return Arrays.copyOf(res,rds+1);                            //返回临时数组的局部二维数组 如果输入二维数组为空 则返回空
    }
}
//这里应用的是贪心算法 贪心前先排序 是经验 这里将排序好的区间 前部分先合并 做出当前的最好的选择 做出局部解 就是最优解   
