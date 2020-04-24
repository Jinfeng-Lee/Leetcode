class Solution {
    public int jump(int[] nums) {
        if(nums.length < 2){
            return 0;
        }   
        int ans = 0;
        int cur = nums.length-1;            //初始化
        while(cur!=0){                      //如果当前下标不为0 没到起点
            for(int i =0;i<cur;i++){        //每次从头开始遍历
                if(nums[i]+i>=cur){         //如果能到达当前目标
                    cur = i;                //修改当前目标
                    ans++;
                    break;                  //跳出循环
                }
            }
        }
    return ans;               
    }
        
}
//这题我写的时候是用的是同样方法的迭代写的 但是会超时 通过了90/92个例子 我感觉是没问题的 是测试用例太毒
//然后需要注意的是 if条件改变的是下标 记得break 出while是判断是否下标到了0
