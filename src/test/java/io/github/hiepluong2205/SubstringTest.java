package io.github.hiepluong2205;


import org.testng.annotations.Test;

class SubStringTest {
  @Test
  public void testSubString01(String S, int start, int end) {
    //    int subLength = end - start - 1;
    //    for (int i = start; i <= end - 1; i++) {}
    System.out.println(S.substring(start, end - 1));
  }
}
