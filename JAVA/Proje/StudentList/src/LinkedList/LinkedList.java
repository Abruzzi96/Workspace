package LinkedList;

import Dev.Student;

public class LinkedList<T> {
    public Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void append(T data) {
        if (head == null) {
            head = new Node<T>(data);
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<T>(data);
    }

    public void prepend(T data) {
        Node<T> newData = new Node<T>(data);
        newData.next = head;
        head = newData;
    }

    public void delete(T data) throws InvalidDataException {
        if (!contains(data)) {
            throw new InvalidDataException("List does not contains " + data);
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int indexOf(T data) throws InvalidDataException {
        if (contains(data)) {
            Node<T> current = head;
            int count = 0;
            while (current.data != data) {
                current = current.next;
                count++;
            }
            return count;
        }
        throw new InvalidDataException("List does not contains " + data);
    }

    public T get(int index) throws InvalidIndexException {
        if (index >= 0 && index < size()) {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        } else {
            throw new InvalidIndexException("Invalid Index!");
        }
    }

    public void clear() {
        head = null;
    }

    public T getFirst() throws EmptyListException {
        if (head != null) {
            return head.data;
        } else {
            throw new EmptyListException("List is empty!");
        }
    }

    public T getLast() throws EmptyListException {
        if (!isEmpty()) {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.data;
        }
        throw new EmptyListException("List is empty!");
    }

    public int size() {
        if (!isEmpty()) {
            int counter = 1;
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
                counter++;
            }
            return counter;
        }
        return 0;
    }
}
