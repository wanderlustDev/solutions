package search;

public class LinearSearch {

    public int search(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == x) {
                System.out.println("Search Complexity: " + count);
                return i;
            }
        }
        System.out.println("Search Complexity: " + count);
        return -1;
    }
}
