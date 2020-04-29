class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int front;
    /** Initialize your data structure here. */
    public MyQueue() {
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();
        int front = 0;                              //初始化
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.isEmpty()){
            front = x;
        }
        stack1.push(x);                             //无论如何都压入stack1中
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
        }
        return stack2.pop();                        //从stack2中pop
    }
    
    
    /** Get the front element. */
    public int peek() {
        if(!stack2.isEmpty()){
            stack2.peek();
        }
        return front;                               //从stack2中pop
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }                         
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
