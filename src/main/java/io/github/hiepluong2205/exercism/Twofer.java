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
