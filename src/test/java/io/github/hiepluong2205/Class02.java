package io.github.hiepluong2205;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result2 {

  /*
   * Complete the 'countingValleys' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER steps
   *  2. STRING path
   */

  public static int countingValleys(int steps, String path) {
    // Write your code here
    int intValleyCount = 0;
    return intValleyCount;
  }
}

class Solution02 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter =
        new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int steps = Integer.parseInt(bufferedReader.readLine().trim());

    String path = bufferedReader.readLine();

    int result = Result2.countingValleys(steps, path);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
