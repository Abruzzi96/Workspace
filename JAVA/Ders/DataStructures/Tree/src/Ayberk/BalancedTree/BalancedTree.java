package Ayberk.BalancedTree;

public class BalancedTree {
    Node root;


    boolean checkHeightBalance(Node root, Height height) {
        if (root == null) {
            height.height = 0;
            return true;
        }

        Height leftHeightHeight = new Height();
        Height rightHeightHeight = new Height();

        boolean l = checkHeightBalance(root.left, leftHeightHeight);
        boolean r = checkHeightBalance(root.right, rightHeightHeight);

        int leftHeight = leftHeightHeight.height;
        int rightHeight = rightHeightHeight.height;

        height.height = (Math.max(leftHeight, rightHeight)) + 1;

        if (Math.abs(leftHeight - rightHeight) >= 2) {
            return false;
        } else {
            return l && r;
        }
    }
}
