class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] new_heights = new int[heights.length+2];    //创造一个第一个元素和最后一个元素为0的扩充数组
        for(int i = 0;i<heights.length;i++){
            new_heights[i+1] = heights[i];
        }
        Stack<Integer> stack = new Stack();
        int res = 0;
        for(int i = 0;i<new_heights.length;i++){
            while(!stack.isEmpty() && new_heights[stack.peek()] > new_heights[i]){    //当stack中的元素小于当前时 反复pop计算该点位置的最大面积
                int cur = stack.pop();
                res = Math.max(res,new_heights[cur] * (i - stack.peek()-1));
            }
            stack.push(i);    //每个点都得push 保证取到最大值
        }
        return res;
    }
}
//stack里面是个递增序列 可以相等 当前i比里面的值小 则pop出来计算
