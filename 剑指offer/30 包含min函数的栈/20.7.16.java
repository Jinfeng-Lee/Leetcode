class MinStack {
    LinkedList<Integer> stack;
    int curMin;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<Integer>();
        curMin = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
       
        if(x<curMin){ 
            stack.push(x);
            curMin = x;
        }else{
            stack.push(curMin);
        }
        stack.push(x);
        
    }
    
    public void pop() {
        stack.pop();
        stack.pop();
        if(!stack.isEmpty()){
            curMin = stack.get(1);
        }else{
            curMin = Integer.MAX_VALUE;
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return stack.get(1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
