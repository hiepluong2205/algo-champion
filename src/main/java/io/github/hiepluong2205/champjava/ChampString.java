/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.champjava;

import java.util.Map;

public class ChampString {
    public String removeVowels(String s) {
        return "";
    }

    // https://leetcode.com/problems/single-row-keyboard/
    public int calculateTime(String keyboard, String word) {
        int iNext = 0, iPrevious = 0, result = 0;
//        keyboard.toMap();
        result += Math.abs(iNext - iPrevious);
        iPrevious = iNext;
        iNext = 1;
        return result;
    }

    public String addBinary(String a, String b) {
        return "";
    }
}
