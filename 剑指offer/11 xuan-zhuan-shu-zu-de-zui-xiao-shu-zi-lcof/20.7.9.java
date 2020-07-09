class Solution {
    public int minArray(int[] numbers) {
        int ans = Integer.MAX_VALUE;
        for(int number:numbers){
            ans = ans > number?number:ans;
        }
        return ans;
    }
}
