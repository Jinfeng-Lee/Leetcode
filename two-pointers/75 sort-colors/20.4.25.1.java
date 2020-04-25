class Solution {
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length-1;
        int cur = 0;
        while(cur<=p2){
            if(nums[cur] == 0){
                int temp = nums[p1];
                nums[p1++] = nums[cur];
                nums[cur++] = temp;
            }else if(nums[cur] == 2){
                int temp = nums[p2];
                nums[p2--] = nums[cur];
                nums[cur] = temp;
            }else{
                cur++;
            }
        }
    }
}
//双指针，前一个指针之前的元素都是0，后一个指针后面元素都是2，中间的都是1，碰到1跳过，两个指针都不变
//唯一需要注意的是遇到0的时候 换过来的肯定是1 不用判断 遇到2时候 换过来不知道是什么数字 需要再进行判断
