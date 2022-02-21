/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.leetcode;

import java.util.Arrays;

public class ChampArray1D {
    int[] intArr;
    String[] strArr;
    int length = 0;

    public ChampArray1D() {
    }

    public int findNumbers(int[] nums) {
        int numCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = Math.abs(nums[i]);
            if ((number >= 10 && number < 100) | (number >= 1000 && number < 10000) | (number >= 100000 && number < 1000000) | (number >= 10000000 && number < 100000000)) {
                numCount++;
            } else {
                // do nothing
            }
        }
        return numCount;
    }

    public int[] sortedSquares(int[] nums) {
        int[] squaredNums = new int[nums.length];
        for (int i = 0; i < squaredNums.length; i++) {
            squaredNums[i] = nums[i] * nums[i];
        }
        Arrays.sort(squaredNums);
        return squaredNums;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
    public static void duplicateZeros(int[] arrTarget) {
        int countZero = 0;
        countZero = countElement(arrTarget, 0);

        // 2. create new int[]
        int[] arrExpanded = new int[arrTarget.length + countZero];

        // 3. duplicate zeros
        for (int i = 0; i < arrExpanded.length; i++) {
            if (arrExpanded[i] == 0) {
                arrExpanded = new int[arrExpanded.length + 1];
            } else {
                //do nothing
            }
        }
        // 4. print arrExpanded
    }

    public static int[] addLeft(int[] arrTarget, int index, int value) {
        // create new blank arr, as a container
        int[] arrExpanded = new int[arrTarget.length + 1];

        // 1. Shift each element one position to the right
        for (int i = arrExpanded.length - 1; i >= index; i--) {
            System.out.println(i);
            arrExpanded[i] = arrTarget[i - 1];
            print(arrExpanded);
        }

        // 2. Set value to the desired index
        arrExpanded[index] = value;
        return arrExpanded;
    }

    protected static int countElement(int[] arrTarget, int elementTarget) {
        int countElement = 0;
        for (int i = 0; i < arrTarget.length; i++) {
            if (arrTarget[i] == 0) {
                countElement++;
            } else {
                // do nothing
            }
        }
        return countElement;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < m; i++) {
            if (nums1[i] >= nums2[i]) {
                addLeft(nums1, i, nums2[i]);
            } else {
                // do nothing
                print(nums1);
            }
        }
        print(nums1);
    }


    public static void print(int[] nums) {
        System.out.println("nums.length = " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + " contains " + nums[i]);
        }
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
    public int removeElement(int[] nums, int val) {
        // Say we want to delete the element at index 1
        for (int i = 2; i < length; i++) {
            // Shift each element one position to the left
            intArr[i - 1] = intArr[i];
        }
        // Again, the length needs to be consistent with the current
        // state of the array.
        length--;
        return length;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
    public int removeDuplicates(int[] nums) {
        int num = 0;
        return num;
    }
}
