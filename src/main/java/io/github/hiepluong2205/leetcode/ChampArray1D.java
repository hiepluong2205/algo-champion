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

    public ChampArray1D(int length) {
        intArr = new int[length];
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

    public void duplicateZeros(int[] intArr) {
// 1. count zeros
        int countZero = countElements(intArr, 0);
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 0) {
                countZero++;
            }
        }
// 2. create new int[]
        int[] arrResult = new int[intArr.length + countZero];
        print(arrResult);
// 3. duplicate zeros
        for (int i = 0; i < arrResult.length; i++) {
            if (arrResult[i] == 0) {
                addElement(arrResult, i + 1, 0);
                i++;
            } else {
                //do nothing
            }
        }
    }

    private int countElements(int[] arr, int targetElement) {
        int countElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countElement++;
            } else {
                // do nothing
            }
        }
        return countElement;
    }

    public int[] addElement(int[] intArr, int index, int value) {
        int[] intArrExpanded = new int[intArr.length + 1];

        // 1. Shift each element one position to the right.
        for (int i = intArr.length - 1; i >= index; i--) {
            intArrExpanded[i + 1] = intArrExpanded[i];
        }
        // 2. Set value to the desired index
        intArrExpanded[index] = value;
        return intArrExpanded;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }


    public void print(int[] nums) {
        System.out.println("nums.length = " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + " contains " + nums[i]);
        }
    }

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
}
