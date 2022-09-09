package ArrayBasedQueue;

public class Queue {
    protected int[] queue;
    protected int front;
    protected int rear;
    protected int currentSize;
    protected final int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.rear = -1;
        this.front = -1;
        this.queue = new int[this.capacity];
    }

    public void enqueue(int data) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("ArrayBasedQueue.Queue is full!");
        }
        if (currentSize == 0) {
            front++;
        }
        rear++;
        queue[rear] = data;
        currentSize++;
    }

    public int dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("ArrayBasedQueue.Queue is empty!");
        }
        int element = queue[front];

        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        currentSize--;
        return element;
    }

    public int peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("ArrayBasedQueue.Queue is empty!");
        }
        return queue[front];
    }

    public boolean isFull() {
        return capacity == currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }

//    private void increaseCapacity(){
//
//    }

}
