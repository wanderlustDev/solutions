package sort;

public class BubbleSort {
    static int count = 0;

    public int[] sort(int[] array, int n) {
        if (n <= 1) {
            return array;
        }
        for (int i = 0; i < n - 1; i++) {
            boolean sorted = false;
            for (int j = 0; j < (n - i) - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    sorted = true;
                }
            }
            if (!sorted) {
                System.out.println("Search Complexity: " + count);
                return array;
            }
        }
        System.out.println("Search Complexity: " + count);
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
