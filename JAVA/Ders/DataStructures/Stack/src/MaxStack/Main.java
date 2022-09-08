package MaxStack;

public class Main {
    public static void main(String[] args) throws StackUnderflowException, StackOverflowException {
        MaxStack stack = new MaxStack();
        stack.push(15);
        stack.getMax();
        stack.push(25);
        stack.getMax();
        stack.push(35);
        stack.getMax();
        stack.pop();
        stack.getMax();
        stack.pop();
        stack.getMax(); // O(1)
    }
}
