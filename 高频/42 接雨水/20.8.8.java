class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0 || height.length == 1){ return 0;}
        int len = height.length;
        int sum = 0;
        int left = 0;
        int cur = height[0];
        for(int i  =0;i<len;i++){
            if(height[i] >= cur){
                sum += cur * (i - left);
                for(int j = left;j<i;j++){
                    sum -= height[j];
                }
                cur = height[i];
                left = i+1;
            }
        }
        left = len-1;
        cur = height[left];
        for(int i = len - 1;i>=0;i--){
            if(height[i] > cur){
                sum += cur * (left - i);
                for(int j = left;j>i;j--){
                    sum -= height[j];
                }
                cur = height[i];
                left = i-1;
            }
        }
        return sum;
    }
}
