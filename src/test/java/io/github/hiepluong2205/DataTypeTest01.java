package io.github.hiepluong2205;

import org.junit.Test;

import java.util.Scanner;

public class DataTypeTest01 {
  @Test
  public void test01() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      try {
        long x = sc.nextLong();
        System.out.println(x + " can be fitted in:");
        if (x >= -128 && x <= 127) System.out.println("* byte");
        // Complete the code
      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.");
      }
    }
  }
}
