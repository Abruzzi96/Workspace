public class BinaryTree {
    Node root;

    BinaryTree(){
        root = null;
    }

    public void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.key + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.key + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }
}
