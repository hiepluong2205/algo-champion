/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.leetcode;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ChampArray1DTest {
    ChampArray1D champArr1;

    @Ignore
    @Test
    public void testRemoveElement() {
        ChampArray1D champArray1D = new ChampArray1D();
        int[] nums = {1, 2, 3, 4, 5}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = {1, 2, 4, 5}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = champArray1D.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < actualLength; i++) {
//            assert nums[i] == expectedNums[i];
//        }
    }

    @Ignore
    @Test
    public void testDuplicateZeros() {
    }

    @Ignore
    @Test
    public void testAddElement() {
        int[] arr = {1, 2, 3, 4, 5};
        arr = ChampArray1D.addLeft(arr, 2, 5);
        ChampArray1D.print(arr);
    }

    @Test
    public void testMerge() {
        champArr1 = new ChampArray1D();
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 3, 4}, result = {1, 2, 2, 3, 3, 4};
        champArr1.merge(nums1, 6, nums2, 3);
//        Assert.assertEquals(nums1, result);
    }
}