package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> singlyLinkedList = new LinkedList<>();
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(7);
        singlyLinkedList.add(8);
        singlyLinkedList.add(9);
        singlyLinkedList.add(10);

        singlyLinkedList.add(10, 11);

        singlyLinkedList.addLast(12);
    }
}
