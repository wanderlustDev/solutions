package binarytree;

public class BinaryTreeIdentical {

    static Node root = null;
    static Node root2 = null;
    static boolean identical = false;

    public static void main(String[] args) {
        root = addRecursive(root, 6);
        root = addRecursive(root, 4);
        root = addRecursive(root, 8);
        root = addRecursive(root, 3);
        root = addRecursive(root, 5);
        root = addRecursive(root, 8);
        root = addRecursive(root, 7);

        root2 = addRecursive(root2, 6);
        root2 = addRecursive(root2, 4);
        root2 = addRecursive(root2, 8);
        root2 = addRecursive(root2, 3);
        root2 = addRecursive(root2, 5);
        root2 = addRecursive(root2, 8);
        root2 = addRecursive(root2, 7);

        System.out.println("Are they identical? " + identicalRecursive(root, root2));
    }

    private static boolean identicalRecursive(Node tree1, Node tree2) {
        // using preorder, check root first
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if ((tree1 != null && tree2 != null) && (tree1.getValue() == tree2.getValue()) &&
                identicalRecursive(tree1.getLeft(), tree2.getLeft()) &&
                identicalRecursive(tree1.getRight(), tree2.getRight())) {
            return true;
        }
        return false;
    }

    private static Node addRecursive(Node node, int value) {
        if (node == null || node.getValue() == null) {
            return new Node(value, null, null);
        }

        if (value < node.getValue()) {
            node.setLeft(addRecursive(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(addRecursive(node.getRight(), value));
        } else {
            return node;
        }
        return node;
    }

}
