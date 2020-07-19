package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static int height = 0;
    static int maxHeight = 0;

    public static void main(String[] args) {
        Node node = new Node();
        Node result = insert(node, 6);
        result = insert(result, 4);
        result = insert(result, 3);
        result = insert(result, 5);
        result = insert(result, 8);
        result = insert(result, 7);
        result = insert(result, 9);
        traverseLevelOrder(result);
        System.out.println(result);

        System.out.println(delete(result, 8));
    }

//    public static int getHeight(Node node) {
//        if (node == null) {
//            height = 0;
//        }
//        if (node.getLeft() == null && node.getRight() == null) {
//            height++;
//            if (height > maxHeight) {
//                maxHeight = height;
//            }
//            height = 0;
//        }
//        if (node.getLeft() == null) {
//            height++;
//            return getHeight(node.getRight());
//        }
//
//        if (node.getRight() == null) {
//            return getHeight(node.getLeft());
//        }
//
//        getHeight(node.getLeft());
//        getHeight(node.getRight());
//    }

    public static Node insert(Node node, Integer value) {
        if (node == null || node.getValue() == null) {
            node = new Node(value, null, null);
            return node;
        }
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        } else {
            return node;
        }
        return node;
    }

    public static boolean search(Node tree, Integer value) {
        if (tree == null) {
            return false;
        }
        if (tree.getValue() == value) {
            return true;
        }
        if (value < tree.getValue()) {
            return search(tree.getLeft(), value);
        } else {
            return search(tree.getRight(), value);
        }
    }

    public static Node delete(Node tree, Integer value) {
        if (tree == null) {
            return null;
        }
        if (tree.getValue() == value) {
            if (tree.getLeft() == null && tree.getRight() == null) {
                return null;
            }
            if (tree.getRight() == null) {
                return tree.getLeft();
            }
            if (tree.getLeft() == null) {
                return tree.getRight();
            }
            Integer smallestValue = findSmallestValue(tree);
            tree.setValue(smallestValue);
            tree.setRight(delete(tree.getRight(), smallestValue));
            return tree;
        }
        if (value < tree.getValue()) {
            tree.setLeft(delete(tree.getLeft(), value));
            return tree;
        }
        tree.setRight(delete(tree.getRight(), value));
        return tree;
    }

    private static Integer findSmallestValue(Node tree) {
        if (tree.getLeft() == null) {
            return tree.getValue();
        } else {
            return findSmallestValue(tree.getLeft());
        }
    }

    public static void traverseLevelOrder(Node tree) {
        if (tree == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(tree);

        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.print(" " + node.value);
            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.left != null) {
                nodes.add(node.right);
            }
        }
    }
}
