package Ayberk.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertKey(root, data);
    }

    private Node insertKey(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertKey(root.left, data);
        else if (data > root.data)
            root.right = insertKey(root.right, data);
        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void deleteKey(int data) {
        root = delete(root, data);
    }

    int minValue(Node node) {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }
        return min;
    }

    private Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        }
        else {
            // single child
            if (root.left == null) {
                return root.right;
            }
            // single child
            else if (root.right == null)
                return root.left;
            // 2 child
            else{
                root.data = minValue(root.right);
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

}
