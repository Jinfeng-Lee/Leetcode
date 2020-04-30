class MyStack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for(int i =1;i<queue.size();i++){
            queue.add(queue.remove());
        }                                       //reverse
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();                    //retrieve and remove
        
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
 //因为队列是基于链表构成的 LinkedList可以两头操作 一个队列就能模拟栈 而用栈模拟队列，则必须用两个栈才可以。
