import java.util.HashMap;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        int cur = 0;
        HashMap<Integer,Integer> exist = new HashMap();
        int countMax = 0;
        for(int i = 0;i<array.length;i++){
            exist.put(array[i],exist.getOrDefault(array[i],0)+1);
            countMax = Math.max(countMax,exist.get(array[i]));
        }
        if(countMax<=array.length/2){ return 0;}
        for(int i = 0;i<array.length;i++){
            if(count == 0){
                cur = array[i];
            }
            if(cur == array[i]){
                count++;
            }else{
                count--;
            }
        }
        return cur;
    }
}
