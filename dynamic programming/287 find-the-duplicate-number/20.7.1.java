class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 1;
        int right = len-1;
        while(left<right){
            int mid = left+(right-left)/2;
            int count = 0;
            for(int n:nums){
                if(n<=mid){
                    count++;
                }
            }
            if(count>mid){                  //如果大于mid的值 则证明其中必然有重复 因为mid值代表了在数组中不重复的时候 最多有的值的数量
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return right;
    }
}
