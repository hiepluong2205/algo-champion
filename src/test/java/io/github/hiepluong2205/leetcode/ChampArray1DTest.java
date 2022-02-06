/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.leetcode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChampArray1DTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testRemoveElement() {
        ChampArray1D champArray1D = new ChampArray1D(6);
        int[] nums = {1,2,3,4,5}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = {1,2,4,5}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = champArray1D.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < actualLength; i++) {
//            assert nums[i] == expectedNums[i];
//        }
    }
}