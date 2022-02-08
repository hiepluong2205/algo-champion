/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number: 0
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a0p2;

import java.util.Scanner;

// https://deanza.instructure.com/courses/23660/assignments/678799
public class TempConverter {
    public static int tempF, tempC;

    public static void main() {
        System.out.println("Enter a temperature reading in Celsius: ");
        tempC = scanNextIntFromConsole();
        System.out.println("It's " + convertCtoF(tempC) + " in Fahrenheit.");

        System.out.println("Enter a temperature reading in Fahrenheit: ");
        tempF = scanNextIntFromConsole();
        System.out.println("It's " + convertFtoC(tempF) + " in Celsius.");
    }

    private static int scanNextIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    protected static int convertFtoC(int temp) {
        tempF = temp;
        tempC = (tempF - 32) * 100 / 180;
        return tempC;
    }

    protected static int convertCtoF(int temp) {
        tempC = temp;
        tempF = 32 + tempC * (180 / 100);
        return tempF;
    }
}
