package binarytree;

public class BinaryTreeOther {

    static Node root = null;
    static Node random = null;

    public static void main(String[] args) {
        root = addRecursive(root, 6);
        root = addRecursive(root, 4);
        root = addRecursive(root, 8);
        root = addRecursive(root, 3);
        root = addRecursive(root, 5);
        root = addRecursive(root, 9);
        root = addRecursive(root, 7);
        root = addRecursive(root, 8);

        System.out.println("In order");
        traverseInOrder(root);
        System.out.println("Pre order");
        traversePreOrder(root);
        System.out.println("Post order");
        traversePostOrder(root);

        boolean findNode = searchRecursive(root, 8);
        System.out.println(findNode);

        //System.out.println("Min value:" + findMinimumValue(root).toString());

        Node node = deleteRecursive(root, 9);
        System.out.println(node.toString());
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

    private static boolean searchRecursive(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (value == node.getValue()) {
            return true;
        }

        if (value > node.getValue()) {
            return searchRecursive(node.getRight(), value);
        } else {
            return searchRecursive(node.getLeft(), value);
        }
    }

    private static Node deleteRecursive(Node node, int nodeToDelete) {
        if (node == null) {
            throw new NullPointerException("Node does not exist!");
        }

        if (nodeToDelete == node.getValue()) {
           if (node.getLeft() == null && node.getRight() == null) {
               return null;
           } else if (node.getLeft() == null) {
               return node.getRight();
           } else if (node.getRight() == null) {
               return node.getLeft();
           } else {
               //Node minimumValue = findMinimumValue(node);
           }
            return null;
        }

        if (nodeToDelete > node.getValue()) {
            node.setRight(deleteRecursive(node.getRight(), nodeToDelete));
        } else {
            node.setLeft(deleteRecursive(node.getLeft(), nodeToDelete));
        }
        return node;
    }

    private static void traverseInOrder(Node node) {
        if (node.getLeft() != null) {
            traverseInOrder(node.getLeft());
        }
        System.out.println(node.getValue());
        if (node.getRight() != null) {
            traverseInOrder(node.getRight());
        }
    }

    private static void traversePreOrder(Node node) {
        System.out.println(node.getValue());
        if (node.getLeft() != null) {
            traversePreOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            traversePreOrder(node.getRight());
        }
    }

    private static void traversePostOrder(Node node) {
        if (node.getLeft() != null) {
            traversePostOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            traversePostOrder(node.getRight());
        }
        System.out.println(node.getValue());
    }

//    private static Node findMinimumValue(Node node) {
//        Node min = node;
//        if (min == null) {
//            //return
//        }
//        if (node.getLeft().getValue() < min.getValue()) {
//            min = findMinimumValue(node.getLeft());
//        } else {
//            min = findMinimumValue(node.getRight());
//        }
//
//        return min;
//    }
}
