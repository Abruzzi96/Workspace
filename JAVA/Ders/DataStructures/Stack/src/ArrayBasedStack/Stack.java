package ArrayBasedStack;

public class Stack {
    private int[] stack;
    private final int capacity;
    private int currentSize;
    private int top;

    Stack(int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.currentSize = 0;
        this.top = -1;
    }

    void push(int data) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack.Stack is full!");
        }
        stack[++top] = data;
        currentSize++;
    }

    int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack.Stack is empty!");
        }
        currentSize--;
        return stack[top--];
    }

    int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack.Stack is empty!");
        }
        return stack[top];
    }

    int size() {
        return currentSize;
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean isFull() {
        return this.capacity == this.currentSize;
    }
}
