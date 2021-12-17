package io.github.hiepluong2205;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.Scanner;

public class ChampArray1DTest {
  private ChampArray1D champ1;

  @BeforeTest
  public void setUp(){
    champ1 = new ChampArray1D();
  }
  @AfterTest
  public void tearDown(){
//    champ1.quit();
  }

  @Ignore
  @Test
  public void test1() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] a = new int[n];
    for (int i = 0; i <= n - 1; i++) {
      a[i] = scan.nextInt();
    }
    scan.close();

    // Prints each sequential element in array a
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  @Ignore
  @Test
  public void testMaxConsecutiveOnes() {
    int[] nums = {0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
    //    int start, end = 0;
    int count = 0, maxCount = 0;
    //    int[] arrResult = {};
    //    int resultNext = 0;
    /*
    if found 0, reset arrResult starting point,set the previous
    if found 1, set arrCount to ++
    if found longer 1's string, set result to arrNew's length.
    */
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
        System.out.println(count);
        if (count > maxCount) {
          maxCount = count;
          System.out.println(maxCount);
        } // else, do nothing

      } else {
        count = 0;
      }
    }
    System.out.println(maxCount);
  }

  @Ignore
  @Test
  public void testFindNumbers() {
    //    int[] nums = {12, 345, 2, 6, 7896};
    ChampArray1D arr = new ChampArray1D();
    int[] nums = {555, 901, 482, 1771};
    arr.findNumbers(nums);
  }

  @Ignore
  @Test
  public void sortedSquares() {
    // int[] nums = {555, 901, 482, 1771};
    int[] nums = {-4, -1, 0, 3, 10};
    champ1.sortedSquares(nums);
    //    for (int i = 0; i < nums.length; i++) {
    //      System.out.println("i = " + i);
    //      nums[i] = nums[i] * nums[i];
    //      System.out.println(nums[i]);
    //    }
    //    Arrays.sort(nums);
  }

  @Test
  public void testDuplicateZeros() {
    int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
    champ1.duplicateZeros(arr);
  }
  @Test
  public void test1mergeSortedArray(){

  }
//  @Ignore
  @Test
  public void testRemoveElement(){
    int[] nums = {3,2,2,3}; // Input array
    int val = 3; // Value to remove
    int[] expectedNums = {}; // The expected answer with correct length.
    // It is sorted with no values equaling val.

    int k = champ1.removeElement(nums, val); // Calls your implementation

    assert k == expectedNums.length;
    champ1.sort(nums, 0, k); // Sort the first k elements of nums
    int actualLength=0; //TODO
    for (int i = 0; i < actualLength; i++) {
      assert nums[i] == expectedNums[i];
    }
  }
}
