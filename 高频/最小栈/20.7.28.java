class MinStack {
    int min;
    LinkedList<Integer> cur;
    /** initialize your data structure here. */
    public MinStack() {
        min = Integer.MAX_VALUE;
        cur = new LinkedList();
    }
    
    public void push(int x) {
        if(x<=min){
            cur.push(min);
            min = x;
        }
        cur.push(x);
    }
    
    public void pop() {
        if(cur.pop() == min){
            min = cur.pop();
        }
    }
    
    public int top() {
        return cur.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
