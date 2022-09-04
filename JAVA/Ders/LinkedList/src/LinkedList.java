public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    void append(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    void prepend(int data){
          Node current = new Node(data);
          current.next = head;
          head = current;
    }

    void delete(int data){
        if (head.data == data) {
              head = head.next;
        }else {
            Node current = head;
            while (current.next != null && current.next.data != data){
                current = current.next;
            }
            current.next = current.next.next;
        }
    }
}
