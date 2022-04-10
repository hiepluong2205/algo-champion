
/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.champjava;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChampArrayTest {
    ChampArray champArray1 = new ChampArray();

    @Test
    public void testMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        champArray1.merge(nums1, 3, nums2, nums2.length);
        System.out.printf(String.valueOf(nums1));
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
}