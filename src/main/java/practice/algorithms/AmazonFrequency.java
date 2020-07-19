package practice.algorithms;
    // IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
    // CLASS BEGINS, THIS CLASS IS REQUIRED
    public class AmazonFrequency
    {
        // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
        public static List<String> retrieveMostFrequentlyUsedWords(String literatureText,
                                                     List<String> wordsToExclude)
        {
            // WRITE YOUR CODE HERE

            String text = literatureText.toLowerCase();
            String[] stringArray = text.split("[ ']");
            List<String> arrayList = new ArrayList<>();

            Map<String, Integer> arrayMap = new HashMap<>();
            for (String str : stringArray) {
                if (arrayMap.containsKey(str.toLowerCase())) {
                    arrayMap.put(str, arrayMap.get(str) + 1);
                } else {
                    arrayMap.put(str, 1);
                }
            }

            Integer max = null;
            for (Integer val : arrayMap.values()) {
                if (max == null || val > max) {
                    max = val;
                }
            }

            for (String value : arrayMap.keySet()) {
                if (arrayMap.get(value) >= max) {
                    arrayList.add(value);
                }
            }
            for (String d : stringArray) {
                System.out.println(d + ", ");
            }
            for (String gh : wordsToExclude) {
                if (arrayList.contains(gh)) {
                    arrayList.remove(gh);
                }
            }

            System.out.println(arrayMap);
            return arrayList;
        }
        // METHOD SIGNATURE ENDS
        public static void main(String[] args) {
            String value = "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food";
            String[] stringArray = value.split("[ ']");
            String[] exclude = {"and", "he" , "the", "to" , "is"};
            List<String> excludes = new ArrayList<>();
            for (String s : stringArray) {
                excludes.add(s);
            }

            retrieveMostFrequentlyUsedWords(value, excludes);

        }
    }


