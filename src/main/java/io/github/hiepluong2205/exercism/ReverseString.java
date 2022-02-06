/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.exercism;

class ReverseString {

    String reverse(String inputString) {
        String targetString = "";
        char[] charArr = inputString.toCharArray();
        char[] charArrReversed = new char[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            charArrReversed[i] = charArr[charArr.length - 1 - i];
        }
        targetString = charArrReversed.toString();
        return targetString;
    }

}
