package search;

public class BinarySearch {

    public static int count = 0;

    public int binarySearch(int[] array, int beg, int end, int search) {
        if (beg > end) {
            return 0;
        }
        int mid = (beg + end) / 2;
        int midValue = array[mid];
        if (midValue == search) {
            return mid;
        }
        if (search < midValue) {
            return binarySearch(array, beg, mid, search);
        } else {
            return binarySearch(array, mid, end, search);
        }
    }
}
