class Solution {
    public int[] countBits(int num) {
        if(num == 0){ return new int[1];}
        int count = 0;
        int[] ans = new int[num+1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i =2;i<=num;i++){
            if(i==Math.pow(2,count+1)){
                count++;
                ans[i] = 1 + ans[i-(int)Math.pow(2,count)];
            }else{
                ans[i] = 1 + ans[i-(int)Math.pow(2,count)];
            }
            
        }
        return ans;
    }
}   
