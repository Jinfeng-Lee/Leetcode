import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Leo
 */
public class Solution {
    public int[] Sort(int[] nums){
        if(nums == null){
            return null;
        }
        recur(nums,0,nums.length-1);
        return nums;
    }
    public void recur(int[] nums,int l, int r){
        if(l>=r){ return;}
        int i = l;
        int j = r;
        int temp = nums[l];
        while(i<j){
            while(nums[j] - nums[l] >= 0 && i<j) {
                j--;
            }//先减后加
            while(nums[i] - nums[l] <= 0 && i<j) {
                i++;
            }
            int temp2 = nums[i];
            nums[i] = nums[j];
            nums[j] = temp2;
        }
        nums[l] = nums[i];
        nums[i] = temp;
        recur(nums,l,i-1);
        recur(nums,i+1,r);
    }
    public static void main(String[] args){
        int[] nums = {1,3,4,5,0,2,5,4,7,8};
        Solution sol = new Solution();
        sol.Sort(nums);
        for(int i = 0;i<nums.length;i++){
                System.out.print(nums[i] + " ");
            }
    }

}
