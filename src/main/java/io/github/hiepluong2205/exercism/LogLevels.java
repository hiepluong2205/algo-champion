package io.github.hiepluong2205.exercism;

public class LogLevels {
  public static String message(String logLine) {
    logLine.substring(0, logLine.length() - 1);
    if (logLine.contains("[ERROR]: ")) {

    } else if (logLine.contains("[WARNING]: ")) {

    } else if (logLine.contains("[INFO]: ")) {

    }

    throw new UnsupportedOperationException(
        "Please implement the (static) LogLine.message() method");
  }

  public static String logLevel(String logLine) {
    throw new UnsupportedOperationException(
        "Please implement the (static) LogLine.logLevel() method");
  }

  public static String reformat(String logLine) {
    throw new UnsupportedOperationException(
        "Please implement the (static) LogLine.reformat() method");
  }
}
