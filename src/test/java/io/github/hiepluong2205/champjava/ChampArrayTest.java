
/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.champjava;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChampArrayTest {
    ChampArray champArray1 = new ChampArray();

    @Test
    public void testIntersect() {
    }

    @Test
    public void testIntersection() {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2}, numsExpected = {2};
        Assert.assertEquals(champArray1.intersection(nums1, nums2), numsExpected);
    }

    @Test
    public void testMerge() {

/*
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        int[] nums1 = {};
        int[] nums2 = {1};
        int m = 0, n = 1;

*/
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        champArray1.merge(nums1, m, nums2, n);
    }

    @Test
    public void testTwoSum() {
//        int[] nums = {2, 7, 11, 15}, resultExpected = {0, 1};
//        int target = 9;
//        int[] nums = {3, 3}, resultExpected = {0, 1};
//        int target = 6;
        int[] nums = {3, 2, 4}, resultExpected = {1, 2};
        int target = 6;
        Assert.assertEquals(champArray1.twoSum(nums, target), resultExpected);
    }

    @Test
    public void testPrintIntArray() {
        int[] nums = {2, 7, 11, 15};
        champArray1.print(nums);
    }

    @Test
    public void testPivotIndex() {
    /*
    int[] nums = {1,2,3};
    int expected = -1;
    int[] nums = {2,1,-1};
    int expected = 0;
     */
        int[] nums = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        Assert.assertEquals(champArray1.pivotIndex(nums), expected);
    }

    @Test
    public void testFindMaxConsecutiveOnes() {
        int[] arrTest1 = {1, 1, 0, 1, 1, 1};
        assertEquals(champArray1.findMaxConsecutiveOnes(arrTest1), 3);
    }

    @Test
    public void testSearchInsert() {
        int[] nums = {1, 3, 4, 6, 7, 8, 9, 9, 9, 9, 9};
        System.out.println("Should be: " + champArray1.searchInsert(nums, 5));
    }

    @Test
    public void testCoutOdds() {
        System.out.println(champArray1.countOdds(0, 4));

    }

    @Test
    public void testMaxSubArray() {
//        int[] nums = {5, 4, -1, 7, 8};
//        int maxSumExpected = 23;
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSumExpected = 6;
//        int[] nums = {1};
//        int maxSumExpected = 1;
        Assert.assertEquals(maxSumExpected, champArray1.maxSubArray(nums));
    }

    @Test
    public void testMaxAbsoluteSum() {
        int[] nums = {1, -3, 2, 3, -4};
        int maxSumExpected = 5;
//        int[] nums = {2, -5, 1, -4, 3, -2};
//        int maxSumExpected = 8;
//        int[] nums = {1};
//        int maxSumExpected = 1;
        Assert.assertEquals(maxSumExpected, champArray1.maxAbsoluteSum(nums));
    }

    @Test
    public void testAverage() {
        int[] arrSalary = {4000, 3000, 1000, 2000};
        System.out.println(champArray1.average(arrSalary));
    }

    @Test
    public void testHammingWeight() {
        int n = 00000000000000000000000000001011;
        champArray1.hammingWeight(n);
    }

}