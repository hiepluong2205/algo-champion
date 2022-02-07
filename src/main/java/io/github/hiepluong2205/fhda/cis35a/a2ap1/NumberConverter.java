/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number: 2
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a2ap1;

/*
Lab 2a -
You must use arrays, static methods, loops and decision making constructs
Please put each part in its own project.
Total points - 30.

Part 1
1. Convert 1001011 from binary to decimal.
2. Convert 1101110 from decimal to binary.
Using arrays write functions to convert values from binary to decimal and decimal to binary.
*/
public class NumberConverter {
    public static void convertDecimalToBinary(int targetNumber) {

    }

    public static void convertBinaryToDecimal(int targetNumber) {
    }

    private void convertIntToArrayOfInt(int targetNumber) {
        String stringOfInt = convertIntToString(targetNumber);
        String[] arrOfString = convertStringToArrayOfString(stringOfInt);
        int[] arrOfInt = convertArrayOfStringToArrayOfInt(arrOfString);
    }

    private int[] convertArrayOfStringToArrayOfInt(String[] arrOfString) {
        return new int[]{};
    }

    private String[] convertStringToArrayOfString(String stringOfInt) {
        return new String[]{};
    }

    private String convertIntToString(int targetNumber) {
        return "";
    }

}