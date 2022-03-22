
/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date:
 * Date Submitted:
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */

package io.github.hiepluong2205.exercism;

public class Twofer {
  public String twofer(String name) {
    if (name == null) {
      name = "you";
      System.out.println("name = " + name);
    }
    String message = "One for " + name + ", one for me.";
    return message;
  }
}
