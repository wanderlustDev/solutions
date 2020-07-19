package randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List arrayList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        list.add(10);
        list.add(9);

        arrayList.add(10);
        arrayList.add(9);

        list.removeFirst();
        System.out.println(list);
    }
}
