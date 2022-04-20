/*
 * https://leetcode.com/study-plan/data-structure/?progress=lrg99ys
 * https://leetcode.com/study-plan/algorithm/?progress=lnrhw27
 * https://leetcode.com/study-plan/programming-skills/?progress=le7rceh
 */

package io.github.hiepluong2205.champjava;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChampStringTest {
    ChampString champString = new ChampString();

    @Test
    public void testRemoveVowels() {
        /*
        String s = "aeiou";
        */
        String s = "leetcodeisacommunityforcoders";
        champString.removeVowels(s);
    }

    @Test
    public void testCalculateTime() {
        /*
        String keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode";
         */
        String keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba";
        champString.calculateTime(keyboard, word);
    }

    @Test
    public void testName() {
        /*
        String a = "1010", b = "1011", expected="10101";
         */
        String a = "11", b = "1", expected = "100";
        champString.addBinary(a, b);
    }
}