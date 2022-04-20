/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.champjava;

import java.util.*;

public class ChampHashTable {
    // https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> setInt = new HashSet<>(nums.length);
        for (int x : nums) {
            if (setInt.contains(x)) result = true;
            System.out.printf("%-10d%-10b%n", x, setInt.contains(x));
            setInt.add(x);
        }
        return result;
    }

    // https://leetcode.com/problems/contains-duplicate-ii/
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] & Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return true;
    }


    // https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        int num1 = 0, num2 = 0;
        Map<Integer, Integer> numsMap = new HashMap<>();
        System.out.printf("%-10s %-10s %-10s %n", "i", "num1", "num2");
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            num2 = target - num1;
            if (numsMap.containsKey(num2)) {
                System.out.printf("%-10d %-10d %-10d %n", i, num1, num2);
                return new int[]{i, numsMap.get(num2)};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }
}
