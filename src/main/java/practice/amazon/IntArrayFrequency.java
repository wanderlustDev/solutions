package practice.amazon;

import org.apache.commons.lang3.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class IntArrayFrequency {

    public int getMostFrequentNumber(int[] array) {
        Map<Integer, Integer> arrayMap = new HashMap<>();
        for (int i : array) {
            if (!arrayMap.containsKey(i)) {
                arrayMap.put(i, 1);
            } else {
                arrayMap.put(i, arrayMap.get(i) + 1);
            }
        }

        Map<Integer, Integer> maxMap = new HashMap<>();
        Integer max = null;
        for (int j : arrayMap.keySet()) {
            if (max == null || arrayMap.get(j).compareTo(maxMap.get(0)) > 0) {
                maxMap.put(0, arrayMap.get(j));
                max = j;
            }
        }
        return max;
    }

    public int[] removeDuplicates(int[] array) {

        Map<Integer, Integer> arrayMap = new HashMap<>();
        int j = 0;
        for (int i : array) {
            if (!arrayMap.containsValue(i)) {
                arrayMap.put(j, i);
                j++;
            }
        }
        Integer[] nonDups = arrayMap.values().toArray(new Integer[arrayMap.size()]);
        return ArrayUtils.toPrimitive(nonDups);
    }
}
