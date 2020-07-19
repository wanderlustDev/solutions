package interviewquestions;

import java.util.*;

public class DataSets {

    private static List<String> employees = Arrays.asList("346546564", "23454353", "43523536", "24535636");
    private static List<String> employeeFriends = Arrays.asList("346546564, 43523536", "24535636, 346546564");

    private static Map<String, List<String>> convertToMap(List<String> employeeFriends) {
        Map<String, List<String>> result = new HashMap<>();
        for (String friend : employeeFriends) {
            List<String> friends = Arrays.asList(friend.split(", "));
            String emp1 = friends.get(0);
            String emp2 = friends.get(1);
            result.computeIfAbsent(emp1, k -> new ArrayList<>()).add(emp2);
            result.computeIfAbsent(emp2, k -> new ArrayList<>()).add(emp1);
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, List<String>> friends = convertToMap(employeeFriends);
        for (String employee : employees) {
            System.out.println(employee + "'s friends are " + friends.get(employee) + ".");
        }
    }
}
