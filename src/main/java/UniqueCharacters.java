import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    public char[] getUnique(String sentence) {
        sentence = sentence.replace(" ", "").toLowerCase();
        Map<Character, Integer> sentenceMap = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            Character c = sentence.charAt(i);
            if (sentenceMap.containsKey(c)) {
                sentenceMap.put(c, sentenceMap.get(c) + 1);
            } else {
                sentenceMap.put(c, 1);
            }
        }
        char[] uniqueList = new char[sentence.length()];
        int count = 0;
        for (Character c : sentenceMap.keySet()) {
            System.out.println(c + ": " + sentenceMap.get(c) + " times");
        }
        System.out.println("Unique characters: " + sentenceMap.keySet());
        return uniqueList;
    }
}
