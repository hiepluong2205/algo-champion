/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number: 2
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a1;
/*
Lab 2a -
You must use arrays, static methods, loops and decision making constructs. Please put each part in its own project.
Total points - 30.

Part 3
Write a program that lets the user enter four quarterly sales figures for six divisions of a company.
The figures should be stored in a two dimensional array.
Once the figures are entered the program should display the following for each quarter
a. A list of the sales figures by division.
b. Each division increases or decreases from the previous quarter(this will not be displayed for the first quarter).
c. The total sales for the quarter.
d. The company's increase or decrease from the previous quarter(this will not be displayed for the first quarter).
e. The average sales for all divisions that quarter.
f. The division with the highest sales for that quarter.
*/

public class SalesManager {
    //Input Validation: Do not accept negative numbers for sales figures.
    private static boolean isNegative(int salesFigure) {
        if (salesFigure < 0) {
            return true;
        } else {
            return false;
        }
    }
}
