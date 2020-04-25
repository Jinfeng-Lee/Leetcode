class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if(points.length == 0){return 0;}
        if(points.length == 1){return 1;}
        Arrays.sort(points,(v1,v2)->v1[0]==v2[0]?v1[1]-v2[1]:v1[0]-v2[0]);
        int cur = points[0][1];
        int ans = 1;
        for(int i = 1;i<points.length;i++){
            if(points[i][0]<=cur ){
                cur = Math.min(points[i][1],cur);
            }else{
                ans++;
                cur = points[i][1];
            }
        }
        return ans;
    }
}
//经典贪心算法
