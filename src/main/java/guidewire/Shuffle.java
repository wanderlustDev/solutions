package guidewire;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Shuffle {

    public static void main(String[] args) {
        int value = 1036567787;
        if (value < 0 || value > 100000000) {
            System.out.println("0");
        }
        StringBuilder shuffled = new StringBuilder();
        String strVal = String.valueOf(value);
        for (int i = 0; i < strVal.length(); i++) {
            if (i % 2 == 0) {
                shuffled.append(strVal.charAt(Math.abs(i/2)));
            } else {
                shuffled.append(strVal.charAt(strVal.length() - Math.abs(i/2 + 1)));
            }
        }
        System.out.println(Integer.parseInt(shuffled.toString()));
    }
}
