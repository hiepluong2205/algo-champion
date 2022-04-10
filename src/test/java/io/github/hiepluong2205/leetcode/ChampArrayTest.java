/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.leetcode;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChampArrayTest {
    ChampArray champArray = new ChampArray();

    @Ignore
    @Test
    public void testFindMaxConsecutiveOnes() {
        int[] arrTest1 = {1, 1, 0, 1, 1, 1};
        assertEquals(champArray.findMaxConsecutiveOnes(arrTest1), 3);
    }

    @Test
    public void testSearchInsert() {
        int[] nums = {1, 3, 4, 6, 7, 8, 9, 9, 9, 9, 9};
        System.out.println("Should be: " + champArray.searchInsert(nums, 5));
    }

    @Test
    public void testCoutOdds() {
        System.out.println(champArray.countOdds(0, 4));

    }

    @Test
    public void testMaxSubArray() {
//        int[] nums = {5, 4, -1, 7, 8};
//        int maxSumExpected = 23;
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSumExpected = 6;
//        int[] nums = {1};
//        int maxSumExpected = 1;
        Assert.assertEquals(maxSumExpected, champArray.maxSubArray(nums));
    }

    @Test
    public void testMaxAbsoluteSum() {
        int[] nums = {1, -3, 2, 3, -4};
        int maxSumExpected = 5;
//        int[] nums = {2, -5, 1, -4, 3, -2};
//        int maxSumExpected = 8;
//        int[] nums = {1};
//        int maxSumExpected = 1;
        Assert.assertEquals(maxSumExpected, champArray.maxAbsoluteSum(nums));
    }

    @Test
    public void testAverage() {
        int[] arrSalary = {4000, 3000, 1000, 2000};
        System.out.println(champArray.average(arrSalary));
    }

    @Test
    public void testHammingWeight() {
        int n = 00000000000000000000000000001011;
        champArray.hammingWeight(n);
    }
}