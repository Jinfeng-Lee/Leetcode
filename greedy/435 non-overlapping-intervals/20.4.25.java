class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length < 2){
            return 0;
        }
        int ans = 0;
        Arrays.sort(intervals,(v1,v2)->v1[0]==v2[0]?v1[1]-v2[1]:v1[0]-v2[0]); //按照顺序排序
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]<intervals[i-1][1]){          //如果下一个区间的左端点小于上一个区间的右端点 有交集 那么得移除一个区间 
                intervals[i][1] = intervals[i][1] > intervals[i-1][1]?intervals[i-1][1]:intervals[i][1];  
                ans++;                                      //将右端点更新为两者较小值 减少对之后区间的影响 是贪心算法的本质 当前解为最终解部分
            }
        }
        return ans;
    }
}
