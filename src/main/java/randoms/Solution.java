package randoms;

import java.util.*;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]);
        }
        return i + 1;
    }

    public static int repeatedNTimes(int[] A) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        if (A.length == 0) {return 0;}
        if (A.length >= 4 && A.length <= 10000 && (A.length % 2 == 0)) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] >= 0 && A[i] < 10000) {
                    integerMap.compute(A[i], (k, v) -> (v == null) ? 1 : v + 1);
                }
            }
            integerMap.keySet().stream().map(key -> {
                if (integerMap.get(key) > 1) {
                    return key;
                }
                return null;
            });
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        //removeDuplicates(arr);

        int[] arr2 = {1, 2, 3, 3};
        //repeatedNTimes(arr2);

        int[] newList = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, newList, 0, arr.length);
        System.arraycopy(arr2, 0, newList, arr.length, arr2.length);
        for (int i = 0; i < newList.length; i++) {
            System.out.println(newList[i]);
        }
    }
}
