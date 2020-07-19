import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {

    public String getMostFrequentNum(int[] array) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (numbers.containsKey(array[i])) {
                numbers.put(array[i], numbers.get(array[i]) + 1);
            } else {
                numbers.put(array[i], 1);
            }
        }
        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (max == null || entry.getValue() > max.getValue()) {
                max = entry;
            }
        }

        return max.getKey() + " : " + max.getValue();
    }
}
