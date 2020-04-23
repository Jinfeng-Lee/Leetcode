class Solution {
    public String intToRoman(int num) {
        
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder ans = new StringBuilder();
        while(num > 0){
            for(int i = 0;i<nums.length;i++){
                while(num >= nums[i]){
                    num -= nums[i];
                    ans.append(roman[i]);
                }
            }
        }
        return ans.toString();
    }
}
//这题就是leetcode凑数的 竟然还是中等题
//常识的贪心
