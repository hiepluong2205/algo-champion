package io.github.hiepluong2205.exercism;

// https://exercism.org/tracks/java/exercises/log-levels
public class LogLevels {
    static String logLine, level, message;
    String[] arrLogLevel = {"INFO", "WARNING", "ERROR"};

    public static String message(String logLine) {
        message = logLine.split("]: ")[1];
        message.trim();
        return message;
    }

    public static String logLevel(String logLine) {
        logLine.substring(1);
        logLine.
        return level;
    }

    public static String reformat(String logLine) {

        return logLine;
    }
}
