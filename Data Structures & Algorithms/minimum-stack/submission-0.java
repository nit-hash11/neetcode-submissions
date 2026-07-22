class MinStack {
    Stack<Integer> dataStack, minStack;
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        dataStack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val)
            minStack.push(val);
    }
    
    public void pop() {
        int popped = dataStack.pop();
        if(minStack.isEmpty() || popped==minStack.peek())
            minStack.pop();
    }
    
    public int top() {
        if(!dataStack.isEmpty())
            return dataStack.peek();
        return -1;
    }
    
    public int getMin() {
        if(!minStack.isEmpty())
            return minStack.peek();
        return -1;
    }
}
