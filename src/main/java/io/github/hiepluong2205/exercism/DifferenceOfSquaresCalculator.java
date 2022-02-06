/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.exercism;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int result = 0;
        for (int i = 1; i <= input; i++) {
            result = result + i;
        }
        return result*result;
    }

    int computeSumOfSquaresTo(int input) {
        int result = 0;
        for (int i = 1; i <= input; i++) {
            result = result + i*i;
        }
        return result;
    }

    int computeDifferenceOfSquares(int input) {
        return Math.abs(computeSquareOfSumTo(input) - computeSumOfSquaresTo(input));
    }
}

