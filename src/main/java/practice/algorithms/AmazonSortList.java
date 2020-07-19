package practice.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AmazonSortList {

    public static List<String> reorderLines(int logFileSize, List<String> logLines)
    {
        List<String> array = new ArrayList<>();
        for (String lines : logLines) {
            String[] stringArray = lines.split(" ");
            String val = stringArray[1];
            array.add(val);
        }
        Collections.sort(array, new SortingOrder());
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("t2 13 121 98");
        array.add("r1, box, ape, bit");
        array.add("b4 xi me nu");
        array.add("br8 eat nim did");
        array.add("w1 has uni gry");
        array.add("f3 52 54 31");

        reorderLines(6, array);
    }
}

class SortingOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String regex = "[0-9]+";
        if (o1.matches(regex) && o2.matches(regex)) {
            return 0;
        }
        if (!o1.matches(regex) && !o2.matches(regex)){
            return -1;
        }
        return o2.compareTo(o1);
    }
}
