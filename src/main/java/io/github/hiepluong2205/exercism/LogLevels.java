package io.github.hiepluong2205.exercism;

// https://exercism.org/tracks/java/exercises/log-levels
public class LogLevels {
  public static String message(String logLine) {
    //    logLine.substring(0, logLine.length() - 1);
    String strLogMessage = "";
    if (logLine.contains("[ERROR]: ")
        | logLine.contains("[WARNING]: ")
        | logLine.contains("[INFO]: ")) {

      strLogMessage = logLine.split("]: ")[1];
    }
    return strLogMessage;
  }

  public static String logLevel(String logLine) {
    String strLogLevel = "";
    return strLogLevel;
  }

  public static String reformat(String logLine) {
    String strFormattedLog = "";
    return strFormattedLog;
  }
}
