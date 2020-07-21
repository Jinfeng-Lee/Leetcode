import com.sun.scenario.effect.Merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Leo
 */
public class Solution {
    public void Sort(int[] nums){
        int[] temp = new int[nums.length];
        Sort(nums,0,nums.length-1,temp);
    }
    public void Sort(int[] nums,int l,int r,int[] temp){
        if(l<r) {
            int mid = (l + r) >>> 1;
            Sort(nums, l, mid, temp);
            Sort(nums, mid + 1, r, temp);
            Merge(nums, l, r, mid,temp);
        }
    }
    public void Merge(int[] nums,int l,int r,int mid,int[] temp){
        int i = l;
        int j = mid+1;
        int t = 0;
        while(i<=mid && j<=r){
            if(nums[i] < nums[j]){
                temp[t++] = nums[i++];
            }else{
                temp[t++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[t++] = nums[i++];
        }
        while(j<=r){
            temp[t++] = nums[j++];
        }
        t = 0;
        while(l<=r){
            nums[l++] = temp[t++];
        }
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,5,0,2,5,4,7,8,-1,-2};
        Solution sol = new Solution();
        sol.Sort(nums);
        for(int i = 0;i<nums.length;i++){
                System.out.print(nums[i] + " ");
        }
    }

}
