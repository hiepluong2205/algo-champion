/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date:
 * Date Submitted:
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */

package io.github.hiepluong2205.hackerrank;

import org.slf4j.ILoggerFactory;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
public class ChampArray {

    /*
You are given an integer array nums and you have to return a new counts array.
The counts array has the property where counts[i] is the number of smaller elements
to the right of nums[i].
Given nums = [5, 2, 6, 1]- Return the array [2, 1, 1, 0].
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Return the array [2, 1, 1, 0].
     */
    public void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        ArrayList<Integer> arrResult = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            // TODO count result to ArrayList
            arrResult.add(countSmallerElementsRight(nums, i));

        }
        print(arrResult);
    }

    private int countSmallerElementsRight(int[] nums, int pivot) {
        int result = 0;
        for (int i = pivot + 1; i < nums.length; i++) {
            if (nums[pivot] < nums[i]) {
                result++;
            }
        }
        return result;
    }

    private void print(ArrayList<Integer> arr) {
        // [2, 1, 1, 0]
    }

    // https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
    public void subArray() {
        Scanner scanner = new Scanner(System.in);

        // Console: Scan arr length
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];

        // Console: Scan arr elements
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        int countSubArrNegative = 0, windowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                windowSum = arr[i] + arr[j];
                if (windowSum < 0) {
                    countSubArrNegative++;
                }
            }
        }
        System.out.println(countSubArrNegative);
    }

    private int sumArrElements(int[] arrInt) {
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum += arrInt[i];
        }
        return sum;
    }
}


