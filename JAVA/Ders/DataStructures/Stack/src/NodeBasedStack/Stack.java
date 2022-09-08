package NodeBasedStack;

public class Stack {
    Node top;

    boolean isEmpty() {
        return top == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        }
        else{
            Node oldTop = top;
            top = newNode;
            newNode.next = oldTop;
        }
    }

    int pop() throws StackUnderFlowException {
        if (isEmpty()) {
            throw new StackUnderFlowException("List is empty!");
        }
        int data = top.data;
        top = top.next;
        return data;

    }

    int peek() throws StackUnderFlowException {
        if (isEmpty()) {
            throw new StackUnderFlowException("List is empty!");
        }
        return top.data;
    }

    void clear() {
        top = null;
    }
}
