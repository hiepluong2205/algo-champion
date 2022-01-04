package io.github.hiepluong2205;

import java.util.Arrays;

public class Array1D {
    int length = 0;

    public int findMaxConsecutiveOnes(int[] nums) {
        int numCount = 0;
        return numCount;
    }

    public int findNumbers(int[] nums) {
        int numCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = Math.abs(nums[i]);
            if ((number >= 10 && number < 100)
                    | (number >= 1000 && number < 10000)
                    | (number >= 100000 && number < 1000000)
                    | (number >= 10000000 && number < 100000000)) {
                numCount++;
            } else {
                // do nothing
            }
        }
        return numCount;
    }

    public int[] sortedSquares(int[] nums) {
        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public void duplicateZeros(int[] arr) {
//    int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
        }
    }

    public void add(int num) {
        int[] intNewArr = new int[6];

    }

    public void print() {
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println("Index " + i + " contains " + intArray[i]);
//        }
    }
}
