class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
         stack.push(val);
        minStack.push(minStack.isEmpty() ? val : Math.min(val, minStack.peek()));
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