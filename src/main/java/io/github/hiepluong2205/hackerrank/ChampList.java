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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ChampList {
    // https://www.hackerrank.com/challenges/a-very-big-sum/problem
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

    /*
    // https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int result = 0;
        return result;
    }

    //https://www.hackerrank.com/challenges/three-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one
    public static void plusMinus(List<Integer> arr) {
        float countElementsNegative = 0, countElementsPositive = 0, countElementsZero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                countElementsZero++;
            } else if (arr.get(i) > 0) {
                countElementsPositive++;
            } else {
                countElementsNegative++;
            }
        }
        System.out.printf("%.6f\n", (float) (countElementsPositive / arr.size()));
        System.out.printf("%.6f\n", (float) (countElementsNegative / arr.size()));
        System.out.printf("%.6f", (float) (countElementsZero / arr.size()));
    }

    // https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one&h_r=next-challenge&h_v=zen
    public static void miniMaxSum(List<Integer> arr) {

    }

    // https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    public static int sockMerchant(int n, List<Integer> ar) {
        int countPairs = 0;
        return 0;
    }

    // https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
    // https://webdev99.com/arrays-ds/
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> listReversed = new ArrayList<>(a);
        Collections.reverse(listReversed);
        return listReversed;

    }

}
