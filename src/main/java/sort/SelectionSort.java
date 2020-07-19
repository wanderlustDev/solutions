package sort;

public class SelectionSort {
    static int count = 0;

    public int[] sort(int[] array, int n) {
        boolean changed = false;
        for (int i = 0; i < n; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++) {
                count++;
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                    changed = true;
                }
            }
            if (changed) {
                swap(smallestIndex, i, array);
            }
        }
        System.out.println("Search Complexity: " + count);
        return array;
    }

    private void swap(int smallestIndex, int i, int[] array) {
        int temp = array[smallestIndex];
        array[smallestIndex] = array[i];
        array[i] = temp;
    }
}
