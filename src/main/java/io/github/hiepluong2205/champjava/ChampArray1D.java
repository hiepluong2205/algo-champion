package io.github.hiepluong2205.champjava;

import java.util.Arrays;

public class ChampArray1D {
    int[] array1D;
    int length = 0;

    public ChampArray1D(int length) {
        array1D = new int[length];
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to keep track of how many 1's you've seen in a row.
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
        }
        int numCount = 0;
        return numCount;
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

    public void duplicateZeros(int[] arr) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else {
                // do nothing
            }
        }
        int[] targetNums = new int[arr.length + countZero];
        for (int i = 0; i < targetNums.length; i++) {
            if (targetNums[i] == 0) {
                add(targetNums, i, 0);
            } else {
                //do nothing
            }

        }
    }

    public void add(int[] targetNums, int index, int value) {
        System.out.println("index = " + index);
        int[] expandedNums = new int[targetNums.length + 1];
        System.out.println("expandedNums.length = " + expandedNums.length);
        print(expandedNums);

        // Shift each element one position to the right.
        for (int i = expandedNums.length - 2; i >= index; i--) {
            System.out.println("i = " + i);
            expandedNums[i + 1] = expandedNums[i];
        }
        expandedNums[index] = value;
        expandedNums = targetNums;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }


    public void print(int[] nums) {
        System.out.println("nums.length = " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + " contains " + nums[i]);
        }
    }

    public void delete(int[] int_array, int index) {
        // Say we want to delete the element at index 1
        for (int i = 2; i < length; i++) {
            // Shift each element one position to the left
            int_array[i - 1] = int_array[i];
        }

// Again, the length needs to be consistent with the current
// state of the array.
        length--;
    }
}
