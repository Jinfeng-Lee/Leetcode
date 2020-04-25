class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        for(int i = 0;i<nums.length;i++){
            switch(nums[i]){
                case 0:
                    red++;
                    continue;     //注意continue 不然会继续判断
                case 1:
                    white++;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(red!=0){
                nums[i] = 0;
                red--;
            }else if(white!=0){
                nums[i] = 1;
                white--;
            }else{
                nums[i] = 2;
            }
        }
    }
}
//这里是两遍遍历 先计数 后标记
