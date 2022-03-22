package io.github.hiepluong2205.champjava;

import java.util.Arrays;
import java.util.List;

public class ChampArray extends ChampSet {
    public int length(int[] arr) {
        int length = arr.length;
        return length;
    }

    public int pivotIndex(int[] nums) {
        int result = 0;
        return result;
    }

    public int leftsum(int[] nums, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public int rightsum(int[] nums, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public int getMinimumMoves(List<Integer> arr) {
        int countStep = 0;
        arr.toArray();
        for (int i = 0; i < arr.size(); i++) {
        }

        //    if (countStep == null) {
        //   countStep ++;
        //    } else{
        //// do nothing
        //    }
        return countStep;
    }

    public void print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }

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
            if ((number >= 10 && number < 100) | (number >= 1000 && number < 10000) | (number >= 100000 && number < 1000000) | (number >= 10000000 && number < 100000000)) {
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
            if (arr[i] == 0) {
                countZero++;
                // move items from arr[i+1] to arr[arr.length-1] to arrResult[j] ->
                // ar rResult[arrResult.length-1] WHERE j = i +1
                for (int j = 0; j < arr.length; j--) {
                    System.out.println("j = " + j);
                    arr[j + 1] = arr[j];
                }
            }
        }
        int[] arrIntResult = new int[arr.length + countZero];
        for (int i : arr) {
        }
    }

    public void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " contains " + arr[i]);
        }
    }

    public void insertInt(int intLocation, int intValue) {
    }

    public void sortWave(int[] arr) {
    /*
    Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
    In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
    Input:
    n = 5
    arr[] = {1,2,3,4,5}
    Output: 2 1 4 3 5
    Explanation: Array elements after
    sorting it in wave form are
    2 1 4 3 5.
    */
        // scan arr using foreach
        if (arr.length % 2 == 0) {
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[i + 1] && arr[i + 1] <= arr[i + 2]) {
                // do nothing
            } else {
                // swap element values, might need addtional arr2
            }
            if (i % 2 == 0) {
            } else {
            }

            // if(i%2==1){} else{}

        }
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
    public int removeElement(int[] nums, int val) {
        int i = 0;
        return i;
    }

    public void sort(int[] nums, int i, int k) {
    }

    public boolean validMountainArray(int[] arr) {
        boolean result = false;
        return result;
    }

    public boolean checkIfExist(int[] arr) {
        boolean result = false;
        return result;
    }

    // https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        Boolean blnResult = false;
        while (blnResult = false) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        blnResult = true;
                    }
                }
            }
        }
        return blnResult;
    }

}
