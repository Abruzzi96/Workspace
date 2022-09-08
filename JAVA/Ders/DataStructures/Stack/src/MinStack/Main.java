package MinStack;

public class Main {
    public static void main(String[] args) throws StackUnderflowException, StackOverflowException {
        MinStack stack = new MinStack();
        stack.push(10);
        System.out.println(stack.getMin());

        stack.push(20);
        System.out.println(stack.getMin());

        stack.push(-5);
        System.out.println(stack.getMin());

        stack.push(14);
        System.out.println(stack.getMin());

        stack.pop();
        System.out.println(stack.getMin());

        stack.pop();
        System.out.println(stack.getMin());

        stack.pop();
        System.out.println(stack.getMin());

        stack.push(-3);
        System.out.println(stack.getMin());

        stack.push(-1);
        System.out.println(stack.getMin());

        stack.pop();
        System.out.println(stack.getMin());

        stack.pop();
        System.out.println(stack.getMin());

    }
}
