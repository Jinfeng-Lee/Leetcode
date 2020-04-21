class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> cur = new ArrayList();
        int temp = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                temp++;                 //偶数累加
            }else{
                cur.add(temp);          //若为奇数 先加上之前的偶数个数 开头也一样
                cur.add(-1);            //再加上代表奇数的-1
                temp = 0;   
            }
        }
        cur.add(temp);
        for(int i = 0;i<cur.size()-2*k;i+=2){
            ans+= (cur.get(i)+1) * (cur.get(i+2*k)+1);     //通过累加每个奇数两边的(偶数个数+1)相乘 得出结果
        }
        return ans;
    }
}
//这道题第一次做 做了两个多小时 因为想了好几种办法去实现 最后想到用奇数之间相隔的偶数个数来做 选择用list保存 容易可以判断边界条件
//开始用数组去保存 实在是不好去判断边界
