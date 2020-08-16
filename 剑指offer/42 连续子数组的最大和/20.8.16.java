public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int cur = array[0];
        int ans = array[0];
        for(int i = 1;i<array.length;i++){
            if(cur<=0){ 
                cur = array[i];
            }else{
                cur += array[i];
            }
            ans = Math.max(ans,cur);
        }
        return ans;
    }
}
