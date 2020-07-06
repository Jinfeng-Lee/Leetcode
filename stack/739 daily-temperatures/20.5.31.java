class Solution {
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] ans = new int[len];
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i = 0;i<len;i++){
            while(!deque.isEmpty() && T[i]>T[deque.peek()]){
                int temp = deque.pop();
                ans[temp] = i-temp;
            } 
            deque.push(i);
        }
        return ans;
    }
}
//单调栈
