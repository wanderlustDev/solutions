package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int diff = 0 - nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (visited.contains(nums[i]) && visited.contains(nums[j]) && visited.contains(nums[k])) {
                        continue;
                    }
                    List<Integer> eachResult = new ArrayList<>();
                    if (nums[j] + nums[k] == diff) {
                        eachResult.add(nums[i]);
                        eachResult.add(nums[j]);
                        eachResult.add(nums[k]);
                        result.add(eachResult);
                        visited.addAll(eachResult);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ThreeSum.threeSum(new int[]{3,0,-2,-1,1,2}));
        System.out.println(ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(ThreeSum.threeSum(new int[]{0, 0, 0}));
        System.out.println(ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4, -3, -1, -2, 3, 1}));
    }
}
