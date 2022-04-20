/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.champjava;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChampHashTableTest {
    ChampHashTable champHashTable1 = new ChampHashTable();

    @Test
    public void testContainDuplicate() {
        int[] nums = {1, 2, 3, 1};
        // int[] nums = {1, 2, 3, 4};
        // int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertEquals(champHashTable1.containsDuplicate(nums), true);
    }

    @Test
    public void testTwoSum() {
        int[] nums = {3, 2, 4}, indicesArrayExpected = {1, 2};
        int target = 6;
        /*
        int[] nums = {2, 7, 11, 15}, indicesArrayExpected = {0, 1};
        int target = 9;
        int[] nums = {3, 3}, indicesArrayExpected = {0, 1};
        int target = 6;
         */
        Assert.assertEquals(champHashTable1.twoSum(nums, target), indicesArrayExpected);
    }
}