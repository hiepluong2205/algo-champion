package io.github.hiepluong2205.champjava;

import java.util.List;

public class ChampArray extends ChampSet {
  public int length(int[] arr) {
    int length = arr.length;
    return length;
  }

  public int pivotIndex(int[] nums) {
    int result = 0;
    return result;
  }

  public int leftsum(int[] nums, int index) {
    int sum = 0;
    for (int i = 0; i < index; i++) {
      sum = sum + nums[i];
    }
    return sum;
  }

  public int rightsum(int[] nums, int index) {
    int sum = 0;
    for (int i = 0; i < index; i++) {
      sum = sum + nums[i];
    }
    return sum;
  }

  public int getMinimumMoves(List<Integer> arr) {
    int countStep = 0;
    arr.toArray();
    for (int i = 0; i < arr.size(); i++) {}

    //    if (countStep == null) {
    //   countStep ++;
    //    } else{
    //// do nothing
    //    }
    return countStep;
  }
  public void print(int[] intArray){
    for (int i = 0; i < intArray.length; i++) {
      System.out.println("Index " + i + " contains " + intArray[i]);
    }
  }
}
