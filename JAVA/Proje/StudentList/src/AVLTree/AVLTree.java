package AVLTree;

import Dev.Student;

public class AVLTree {
    Node root;

    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    int max(int a, int b) {
        return Math.max(a, b);
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node B = y.left;
        y.left = x;
        x.right = B;
        x.height = max(height(x.left),height(x.right))+1;
        y.height = max(height(y.left),height(y.right))+1;
        return y;
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node B = x.right;
        x.right = y;
        y.left = B;
        y.height = max(height(y.left),height(y.right))+1;
        x.height = max(height(x.left),height(x.right))+1;
        return x;
    }

    private int getBalanceFactor(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    public void insert(int data, Student student){
        this.root = insertNode(root,data, student);
    }

    Node insertNode(Node node, int item, Student student) {
        if (node == null) {
            return new Node(item,student);
        } else if (item < node.item) {
            node.left = insertNode(node.left, item, student);
        } else if (item > node.item) {
            node.right = insertNode(node.right, item, student);
        } else {
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));
        int balanceFactor = getBalanceFactor(node);

        if (balanceFactor > 1) {
            if (item < node.left.item) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balanceFactor < -1) {
            if (item > node.right.item) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    Node deleteNode(Node root, int item) {
        if (root == null) {
            return null;
        } else if (root.item < item) {
            root.right = deleteNode(root.right, item);
        } else if (root.item > item) {
            root.left = deleteNode(root.left, item);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                root.item = minValue(root.right);
                root.right = deleteNode(root.right, root.item);
            }
        }

        root.height = max(height(root.left), height(root.right)) + 1;
        int balanceFactor = getBalanceFactor(root);

        if (balanceFactor > 1) {
            if (getBalanceFactor(root.left) >= 0) {
                return rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if (balanceFactor < -1) {
            if(getBalanceFactor(root.right) <= 0){
                return leftRotate(root);
            }
            else{
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }

    int minValue(Node node) {
        int min = node.item;
        while (node.left != null) {
            min = node.left.item;
            node = node.left;
        }
        return min;
    }

    public void getStudent(int ID){
        Node node = root;

        while(node != null){
            if(node.student.getId() > ID){
                node = node.left;
            }
            else if(node.student.getId() < ID){
                node = node.right;
            }
            else{
                System.out.println(node.student);
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
}
