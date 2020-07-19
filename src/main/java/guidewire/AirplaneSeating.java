package guidewire;

import java.util.Arrays;
import java.util.List;

public class AirplaneSeating {

    public static void main(String[] args) {
        int rows = 15;
        String s = "1B 2B 3C 4G 4K 5A 6F 7J 8G 9B 10E 12G 14C";
        List<String> occupiedSeats = Arrays.asList(s.split(" "));
        int availableSeats = 0;
        List<String> seatGroup1 = Arrays.asList("A", "B", "C");
        List<String> seatGroup2 = Arrays.asList("D", "E", "F", "G");
        List<String> seatGroup3 = Arrays.asList("H", "J", "K");
        List<List<String>> seatGroups = Arrays.asList(seatGroup1, seatGroup2, seatGroup3);

        for (int i = 1; i <= rows; i++) {
            for (List<String> seatGroup : seatGroups) {
                if (!containsGroup(occupiedSeats, seatGroup, i)) {
                    availableSeats++;
                } else if (seatGroup.equals(seatGroup2)) {
                    if (!(occupiedSeats.contains(i + "E") || occupiedSeats.contains(i + "F"))) {
                        availableSeats++;
                    }
                }
            }
        }
        System.out.println(availableSeats);
    }

    private static boolean containsGroup(List<String> occupiedSeats, List<String> group, int num) {
        for (String grp : group) {
            if (occupiedSeats.contains(num + grp)) {
                return true;
            }
        }
        return false;
    }
}
