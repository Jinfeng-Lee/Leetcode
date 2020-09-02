class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null){ return 0;}
        int minValue = Integer.MAX_VALUE;
        int ans = 0;
        for(int price:prices){
            if(price < minValue){
                minValue = price;
            }else{
                ans = Math.max(ans,price-minValue);
            }
        }
        return ans;
    }
}
