class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:nums){
            if(map.getOrDefault(num,0) == 1){
                return num;
            }else{
                map.put(num,1);
            }
        }
        return 0;
    }
}
