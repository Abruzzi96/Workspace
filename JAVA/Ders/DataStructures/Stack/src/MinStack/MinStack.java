package MinStack;

public class MinStack {
    Stack mainStack;
    Stack minStack;

    public MinStack() {
        mainStack = new Stack(10);
        minStack = new Stack(10);
    }

    void push(int data) throws StackOverflowException, StackUnderflowException {
        mainStack.push(data);
        if(minStack.isEmpty() || data < minStack.peek())
            minStack.push(data);
    }

    void pop() throws StackUnderflowException {
        if(minStack.peek() == mainStack.pop())
            minStack.pop();
    }

    int getMin() throws StackUnderflowException {
        return minStack.peek();
    }
}
