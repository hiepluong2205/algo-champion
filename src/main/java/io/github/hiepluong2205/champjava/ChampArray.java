/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.champjava;

import java.util.Arrays;
import java.util.List;

public class ChampArray extends ChampSet {
    public int length(int[] arr) {
        int length = arr.length;
        return length;
    }

    // https://leetcode.com/problems/find-the-middle-index-in-array/
    // https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
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

    // https://leetcode.com/problems/intersection-of-two-arrays/
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = {};
        return result;
    }

    // https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = {};
        return result;
    }

    // https://leetcode.com/problems/squares-of-a-sorted-array/
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int pLeft = 0;
        int pRight = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[pLeft]) < Math.abs(nums[pRight])) {
                square = nums[pRight];
                pRight--;
            } else {
                square = nums[pLeft];
                pLeft++;
            }
            result[i] = square * square;
        }
        return result;
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

    public void print(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            System.out.printf("%-10s", i);
//        }
//        System.out.printf("%n");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%-10d", nums[i]);
        }
        System.out.printf("%n");
    }

    // https://leetcode.com/problems/merge-sorted-array/
    // https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pRead1 = m - 1;
        int pRead2 = n - 1;

        for (int pWrite = (m + n) - 1; pWrite >= 0; pWrite--) {
            print(nums1);

            if (pRead2 < 0) {
                break;
            }
            if (pRead1 >= 0 && nums1[pRead1] > nums2[pRead2]) {
                nums1[pWrite] = nums1[pRead1--];
            } else {
                nums1[pWrite] = nums2[pRead2--];
            }
            print(nums1);
            System.out.printf("%n");
        }
    }

    public void sort(int[] nums, int i, int k) {
    }


    // https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        System.out.printf("%-10s %-10s %-10s %-10s %-20s %-20s %n", "i", "j", "nums[i]", "nums[j]", "resultArray[0]", "resultArray[1]");
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                    System.out.printf("%-10d %-10d %-10d %-10d %-20d %-20d %n", i, j, nums[i], nums[j], resultArray[0], resultArray[1]);
                }
            }
        }
        return null;
    }

    // https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
    public int countOdds(int low, int high) {
        int countOddNums = (high - low) / 2;
        if (low % 2 == 1 | high % 2 == 1) {
            countOddNums = (high - low) / 2 + 1;
        }
        return countOddNums;
    }

    // https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
    public double average(int[] salary) {
        int sum = 0;
        double avg = 0.00000d;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        avg = sum / (salary.length - 2);
        return avg;
    }

    // https://leetcode.com/problems/number-of-1-bits/
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return 0;
    }

    // https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    public int subtractProductAndSum(int n) {
        return 0;
    }

    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        if (true) return true;
        return false;
    }

    // https://leetcode.com/problems/next-greater-element-i/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] numsResult = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
//            if (1 != null) {
//
//            }
            numsResult[i] = -1;
        }
        return numsResult;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
    public int findMaxConsecutiveOnes(int[] nums) {
        int countConsecutiveOnes = 0, maxConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countConsecutiveOnes++;
            } else {
                if (countConsecutiveOnes >= maxConsecutiveOnes) {
                    maxConsecutiveOnes = countConsecutiveOnes;
                }
                countConsecutiveOnes = 0;
            }
        }
        return maxConsecutiveOnes;
    }

    public int getArrayCapacity(int[] arr) {
        int capacity = arr.length;
        return capacity;
    }

    // https://leetcode.com/problems/maximum-subarray/
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], windowSum = nums[0], windowStart, windowEnd;
        System.out.printf("%-10s %-10s %-10s %-10s %n", "i", "nums[i]", "windowSum", "maxSum");
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            System.out.printf("%-10d %-10d %-10d %-10d %n", i, nums[i], windowSum, maxSum);
            windowSum = Math.max(num, windowSum + num);
            maxSum = Math.max(maxSum, windowSum);
            System.out.printf("%-10d %-10d %-10d %-10d %n", i, nums[i], windowSum, maxSum);
        }
        return maxSum;
    }

    // https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = Math.abs(nums[0]), windowSum = nums[0], windowStart, windowEnd;
        System.out.printf("%-10s %-10s %-10s %-10s %n", "i", "nums[i]", "windowSum", "maxSum");
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            System.out.printf("%-10d %-10d %-10d %-10d %n", i, nums[i], windowSum, maxSum);
            windowSum = Math.max(num, windowSum + num);
            maxSum = Math.max(maxSum, Math.abs(windowSum));
            System.out.printf("%-10d %-10d %-10d %-10d %n", i, nums[i], windowSum, maxSum);
        }
        return maxSum;
    }

    /*
    Given an array A of N integers,
    returns the smallest positive integer (greater than 0) that does not occur in A.
    For example:
    - Given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    - Given A = [1, 2, 3], the function should return 4.
    - Given A = [−1, −3], the function should return 1.
    Write an efficient algorithm for the following assumptions:
    - N is an integer within the range [1..100,000];
    - Each element of array A is an integer within the range [−1,000,000..1,000,000].
     Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
    */
    public int checkSmallestPositiveInt(int[] A) {
        int temp = 1, result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j] == temp) {
                    temp++;
                } else {
                    result = temp;
                }
            }
        }
        return result;
    }

    // https://leetcode.com/problems/binary-search/
    public int searchBinary(int[] nums, int target) {
        int iLeft = 0, iRight = nums.length - 1, iPivot;
        while (iLeft <= iRight) {
            iPivot = iLeft + (iRight - iLeft) / 2;
            if (target == nums[iPivot]) return iPivot;
            else if (target < nums[iPivot]) iRight = iPivot - 1;
            else iLeft = iPivot + 1;
        }
        return -1;
    }

    // https://leetcode.com/problems/first-bad-version/
    public int firstBadVersion(int n) {
        int iLeft = 0, iRight = n - 1, iPivot;
        while (iLeft <= iRight) {
            iPivot = iLeft + (iRight - iLeft) / 2;
            if (isBadVersion(iPivot)) iRight = iPivot - 1;
            else iLeft = iPivot + 1;
        }
        return iLeft;
    }

    // https://leetcode.com/problems/first-bad-version/
    private boolean isBadVersion(int version) {
        return true;
    }

    // https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int iLeft = 0, iRight = nums.length - 1, iPivot;
        if (target > nums[iRight]) return nums.length;
        if (target < nums[iLeft]) return 0;
        System.out.printf("%-10S %-10S %-10S %n", "iLeft", "iPivot", "iRight");
        while (iLeft <= iRight) {
            iPivot = iLeft + (iRight - iLeft) / 2;
            if (target == nums[iPivot]) return iPivot;
            else if (target < nums[iPivot]) iRight = iPivot - 1;
            else iLeft = iPivot + 1;
            System.out.printf("%-10d %-10d %-10d %n", iLeft, iPivot, iRight);
        }
        return iLeft;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
    public boolean checkIfExist(int[] arr) {
        boolean result = false;
        return result;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
    public boolean validMountainArray(int[] arr) {
        boolean result = false;
        return result;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
    public int[] replaceElements(int[] arr) {
        int[] arrInt = {};
        return arrInt;
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
            System.out.printf("Index %d: %d%n", i, arrExpanded[i]);
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


    // https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
    public int removeElement(int[] nums, int val) {
        // Say we want to delete the element at index 1
        for (int i = 2; i < nums.length; i++) {
            // Shift each element one position to the left
            nums[i - 1] = nums[i];
        }
        // Again, the length needs to be consistent with the current
        // state of the array.
//        nums.length--;
        return nums.length;
    }

    // https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
    public int removeDuplicates(int[] nums) {
        int num = 0;
        return num;
    }

}
