/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.leetcode;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChampArrayTest {
    ChampArray champArray = new ChampArray();

    @Test
    public void testFindMaxConsecutiveOnes() {
        int[] arrTest1 = {1, 1, 0, 1, 1, 1};
        assertEquals(champArray.findMaxConsecutiveOnes(arrTest1), 3);
    }

    @Test
    public void testGetArrayCapacity() {
    }

    @Test
    public void testPrint() {
    }

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testContainsDuplicate() {
        assertEquals(champArray.containsDuplicate(new int[]{1, 2, 3, 1}), true);

    }
}