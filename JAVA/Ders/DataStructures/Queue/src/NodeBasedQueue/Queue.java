package NodeBasedQueue;

public class Queue {
    Node rear;
    Node front;
    int currentSize;

    public Queue() {
        this.rear = null;
        this.front = null;
        this.currentSize = 0;
    }

    public void enqueue(int data) throws QueueUnderflowException {
        Node newNode = new Node(data);
        if (isEmpty()) {
            this.front = newNode;
        }
        else{
            this.rear.next = newNode;
        }
        this.rear = newNode;
        currentSize++;
    }

    public int dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty!");
        }
        int temp = front.data;
        front = front.next;
        currentSize--;
        return temp;
    }

    public int peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty!");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }
}


