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

package io.github.hiepluong2205.champjava;

import org.testng.annotations.Test;

import java.util.Scanner;

public class ScannerTest {
    // https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
    @Test
    public void testPrintF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15 % %n", s1, x);
        }
        System.out.println("================================");
    }

    // https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
    @Test
    public void testLoop2() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        in.close();
    }

    // https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
    @Test
    public void testDataTypes() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    // https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
    @Test
    public void testEOF() {

    }

    // https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
    @Test
    public void testLexicographicalOrder() {
        System.out.println(getSmallestAndLargest("welcometojava", 3));

    }

    private static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int windowStart = 0, windowEnd = windowStart + k;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }

}
