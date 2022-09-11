package Ayberk.AVLTree;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.root = tree.insertNode(tree.root,33);
        tree.root = tree.insertNode(tree.root,13);
        tree.root = tree.insertNode(tree.root,53);
        tree.root = tree.insertNode(tree.root,11);
        tree.root = tree.insertNode(tree.root,21);
        tree.root = tree.insertNode(tree.root,61);
        tree.root = tree.insertNode(tree.root,8);
        tree.root = tree.insertNode(tree.root,9);

    }
}
