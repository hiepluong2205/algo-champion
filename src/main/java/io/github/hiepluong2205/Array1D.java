package io.github.hiepluong2205;

import java.util.Arrays;

public class Array1D {
    public int findMaxConsecutiveOnes(int[] nums) {
        int numCount = 0;
        return numCount;
    }

    public int findNumbers(int[] nums) {
        int numCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = Math.abs(nums[i]);
            //      if ((number >= 0 && number < 10)
            //          | (number >= 100 && number < 1000)
            //          | (number >= 10000 && number < 100000)
            //          | (number >= 1000000 && number < 10000000)) {
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

    }
}
