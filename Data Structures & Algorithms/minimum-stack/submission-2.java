class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty() && minStack.isEmpty()){
            stack.push(val);
            minStack.push(val);
            return;
        }
        if(!minStack.isEmpty()){
            if(val < minStack.peek()){
                 minStack.push(val);
            }
            else 
                minStack.push(minStack.peek());
        }
        else{
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty())
            return stack.peek();
        return -1;
    }

    public int getMin() {
        if(!stack.isEmpty())
            return minStack.peek();
        return -1;
    }
}