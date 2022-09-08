package Challange;

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newData = new Node(data);
        newData.next = head;
        head = newData;
    }

    public void delete(int data) throws InvalidDataException {
        if (!contains(data)) {
            throw new InvalidDataException("List does not contains " + data);
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int indexOf(int data) throws InvalidDataException {
        if (contains(data)) {
            Node current = head;
            int count = 0;
            while (current.data != data) {
                current = current.next;
                count++;
            }
            return count;
        }
        throw new InvalidDataException("List does not contains " + data);
    }

    public int get(int index) throws InvalidIndexException {
        if (index >= 0 && index < size()) {
            Node current = head;
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

    public int getFirst() throws EmptyListException {
        if (head != null) {
            return head.data;
        } else {
            throw new EmptyListException("List is empty!");
        }
    }

    public int getLast() throws EmptyListException {
        if (!isEmpty()) {
            Node current = head;
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
            Node current = head;
            while (current.next != null) {
                current = current.next;
                counter++;
            }
            return counter;
        }
        return 0;
    }

    public void printMidElement() throws EmptyListException {
        if (isEmpty()){
            throw new EmptyListException("List is Empty!");
        }
        Node front = head;
        Node back = head;
        while (front != null && front.next != null) {
            front = front.next.next;
            back = back.next;
        }
        System.out.println("Mid Element: " + back.data);
    }

    public void printList() throws EmptyListException {
        if(isEmpty()){
            throw new EmptyListException("List is empty!");
        }
        Node current = head;
        while (current != null ) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 1 -> 2 -> 2 -> 4 -> 1 -> 6 -> 4 -> 8
    // 1 -> 2 -> 4 -> 6 -> 8

    public void removeDuplicates() throws EmptyListException {
        if(isEmpty()){
            throw new EmptyListException("List is empty!");
        }
        Node start = head;

        while (start.next != null) {
            Node traveller = start;
            while (traveller.next != null) {
                if (start.data == traveller.next.data) {
                    traveller.next = traveller.next.next;
                }
                else{
                    traveller = traveller.next;
                }
            }
            start = start.next;
        }
    }
}
