package interviewquestions;

import java.util.*;

public class NonRepeatingCharacter {

    private static char findNonrepeatingCharacter(String input) {
        Character nonRepeatingChar = null;
        char[] charArray = input.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap();
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i])) {
                map.computeIfPresent(charArray[i], (k, v) -> v + 1);
            } else {
                map.computeIfAbsent(charArray[i], k -> 1);
            }
        }
        for (Map.Entry val : map.entrySet()) {
            if (val.getValue().equals(1)) {
                nonRepeatingChar = (Character) val.getKey();
                break;
            }
        }
        return nonRepeatingChar;
    }

    private static char findNonrepeatingCharacter2(String input) {
        Character nonRepeatingChar = null;
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length; i++) {
            int low = 0;
            boolean nal = true;
            if (nonRepeatingChar == null) {
                while (low < charArray.length - 1) {
                    if (charArray[i] == charArray[low]) {
                        nal = false;
                    }
                    low++;
                }
                if (nal) {
                    nonRepeatingChar = charArray[i];
                    break;
                }
            } else {
                return nonRepeatingChar;
            }
        }
        return nonRepeatingChar;
    }

    public static void main(String[] args) {
        String value = "asdfadfdf";
        System.out.println(findNonrepeatingCharacter2(value));
    }
}

