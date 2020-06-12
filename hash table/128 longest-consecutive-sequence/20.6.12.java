class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> exist = new HashSet<Integer>();    //set来存储
        for(int num:nums){
            exist.add(num);
        }
        int ans = 0;
        int length = 1;
        for(int num:nums){
            if(!exist.contains(num-1)){                 //判断是不是连续的
                int current = num;
                length = 1;
                while(exist.contains(current+1)){
                    current++;
                    length++;
            }
            
            ans = Math.max(ans,length);                 //更新
        }
        }
        return ans;
    }
}
