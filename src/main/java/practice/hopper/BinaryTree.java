package practice.hopper;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    static Node root = null;
    static Node parentNode = null;
    static Node currentNode = null;
    static Node parent = null;

    public static List<Node> build(List<Entry> entries) {
        List<Node> result = new ArrayList<>();
        for (Entry entry : entries) {
            Node tempNode = new Node(entry);

            if (root == null) {
                root = tempNode;
                parentNode = root;
                currentNode = parentNode;
                result.add(root);
            } else {
                boolean moreNodes = true;
                while (moreNodes) {
                    parentNode = currentNode;
                    if (tempNode.getEntry().getWeight() <= parentNode.getEntry().getWeight()) {
                        for (Node value : result) {
                            Node temp = value;
                            while (temp.getEntry().getWeight() < tempNode.getEntry().getWeight()) {
                                temp = temp.getNodes().get(0);
                                parent = value;
                            }
                            parentNode = parent;
                            parentNode.getNodes().add(tempNode);
                            moreNodes = false;
                            break;
                        }
                    } else {
                        if (parentNode.getNodes() == null || parentNode.getNodes().isEmpty()) {
                            parentNode.setNodes(new ArrayList<>());
                            parentNode.getNodes().add(tempNode);
                            moreNodes = false;
                            currentNode = tempNode;
                        } else {
                            for (Node node : parentNode.getNodes()) {
                                if (currentNode.getEntry().getWeight() > node.getEntry().getWeight()) {
                                    currentNode = node;
                                } else {
                                    currentNode = parentNode;
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1, "A"));
        entries.add(new Entry(2, "B"));
        entries.add(new Entry(3, "C"));
        entries.add(new Entry(2, "D"));
        entries.add(new Entry(3, "E"));

        List<Node> result = build(entries);
        for (Node node : result) {
            System.out.println(node.getEntry().getValue());
        }
    }
}
