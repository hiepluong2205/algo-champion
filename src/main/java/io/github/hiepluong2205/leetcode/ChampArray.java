/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */
package io.github.hiepluong2205.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChampArray {
    int[] intArr;
    String[] strArr;
    final Logger logger = LoggerFactory.getLogger(ChampArray.class);


    public ChampArray() {
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

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " contains " + arr[i]);
        }
    }

    public boolean containsDuplicate(int[] nums) {
/*
- int indicator
- Loop through the array from 0 to nums.length
  - indicator found? return false && break loop
  - Indicator NOT found? return true
  i=i+1? i = i+2? i = i+3?
  i+1 = i+2? i+1 = i+3?
 */
        int temp = 0;
        boolean result = false;
        for (int i = 0; i < nums.length - 1; i++) {
            temp = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == temp) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
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

    public int searchBinary(int target) {
        int indexTarget = -1;
        if (indexTarget < 0) {
            return 0;
        } else {
            return -1;
        }
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


}
