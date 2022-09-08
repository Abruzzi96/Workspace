package MaxStack;

public class MaxStack {
    private final Stack maxStack;
    private final Stack mainStack;

    public MaxStack() {
        maxStack = new Stack(10);
        mainStack = new Stack(10);
    }

    void push(int data) throws StackOverflowException, StackUnderflowException {
        mainStack.push(data);
        if (maxStack.isEmpty() ||  mainStack.peek() > maxStack.peek())
            maxStack.push(data);
    }
    void pop() throws StackOverflowException, StackUnderflowException {
        if (mainStack.pop() == maxStack.peek()) {
            maxStack.pop();
        }
    }
    void getMax() throws StackUnderflowException {
        System.out.println(maxStack.peek());
    }
}
