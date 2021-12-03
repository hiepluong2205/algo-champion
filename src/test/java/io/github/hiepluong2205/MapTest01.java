package io.github.hiepluong2205;

import org.testng.annotations.Test;

import java.util.Scanner;

public class MapTest01 {
  @Test
  public void testPhoneBook() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.nextLine();
    for (int i = 0; i < n; i++) {
      String name = in.nextLine();
      int phone = in.nextInt();
      in.nextLine();
    }
    while (in.hasNext()) {
      String s = in.nextLine();
    }
  }
}
