package AVLTree;

import Dev.Student;

public class Node {
    int item, height;
    Node left,right;

    Student student;

    public Node(int item, Student student) {
        this.item = item;
        this.height = 1;
        this.student = student;
    }
}
