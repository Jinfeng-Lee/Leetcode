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



public class Solution {
    public void reOrderArray(int [] array) {
        if(array == null){ return;}
        int count = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] %2 == 1){
                int j = i;
                while(j>count){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                count++;
            }
        }
        
    }
}
//原地 基于插入排序
