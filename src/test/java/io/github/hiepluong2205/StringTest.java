package io.github.hiepluong2205;


import org.testng.annotations.Test;

public class StringTest {
  @Test
  public void testAnagram() {
    //    Hackerrank hackerrank01 = new Hackerrank();
    //    hackerrank01.checkStringAnagram(a, b);
  }

  @Test
  public void testPalindrome() {
    //    Scanner sc = new Scanner(System.in);
    //    String strIn = sc.next();
    //    A.toCharArray();

    String A = "12321";
    String A_reversed = "";

    for (int i = 0; i <= A.length() - 1; i++) {
      System.out.println("i = " + i);
      A_reversed = A.charAt(i) + A_reversed;
      System.out.println("A_reversed = " + A_reversed);
    }
    if (A.equals(A_reversed)) {
      System.out.println("Yes");

    } else {
      System.out.println("No");
    }
  }
}
