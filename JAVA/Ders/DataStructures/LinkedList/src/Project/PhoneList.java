package Project;

import Dev.EmptyListException;
import Dev.InvalidDataException;

public class PhoneList {
    public Node head;

    public PhoneList() {
        this.head = null;
    }

    public void append(String name, String phoneNumber) {
        if (head == null) {
            head = new Node(name, phoneNumber);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(name, phoneNumber);
    }

    public void delete(String name) throws InvalidDataException {
        if (!contains(name)) {
            throw new InvalidDataException("List does not contains " + name);
        }
        if (head.name.equals(name)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String getPhoneNum(String name) throws EmptyListException, InvalidDataException {
        if(isEmpty()){
            throw new EmptyListException("List is empty!");
        }
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current.phoneNumber;
            }
            current = current.next;
        }
        throw new InvalidDataException("Invalid Data!");
    }

    public void clear() {
        head = null;
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
}
