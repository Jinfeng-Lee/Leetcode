import java.util.Arrays;
public class Solution {
    public void reOrderArray(int [] array) {
        if(array == null){ return;}
        int[] ans = new int[array.length];
        int idx = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]%2 == 1){
                ans[idx++] = array[i];
            }
        }
        for(int i = 0;i<array.length;i++){
            if(array[i]%2 == 0){
                ans[idx++] = array[i];
            }
        }
        for(int i = 0;i<array.length;i++){
           array[i] = ans[i];
        }
        //System.arraycopy(ans,0,array,0,ans.length);
    }
}
保持奇数偶数相对位置不变
