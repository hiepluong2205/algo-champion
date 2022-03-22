package io.github.hiepluong2205.coderpad;

import java.io.*;
import java.util.*;

import org.junit.Test;

public class Hulu {

    /*
     * Instructions:
     *
     * 1) Use the Java programming language.
     * 2) Please use this CoderPad editor to code your solution. Code written
     *    outside CoderPad’s editor and copy/pasted into CoderPad will not be
     *    accepted.
     * 3) Please write "production quality" code. Imagine that after you have
     *    written this code it will be submitted to one of your peers for code
     *    review. Your code should compile/execute without warnings/errors.
     * 4) Once you have completed the below Acceptance Criteria, simply close
     *    this tab and inform your point-of-contact that you are done.
     *
     * Acceptance Criteria:
     *
     * 1) Write a function that accepts an array/list of strings, counts the
     *    occurrence of each string, and then returns a data structure with
     *    each unique string and the number of times it occurred. For example,
     *    given an input that contains:
     *
     *        ["apple", "bat", "apple", "car"]
     *
     *    the function should return a data structure that has a count of 2 for
     *    "apple", 1 for "bat", and 1 for "car".
     *
     *    Notes:
     *
     *      a) Your solution should ignore differences in upper/lowercase:
     *         "Apple" should be treated as "apple"
     *      b) Your solution should trim/strip/remove all
     *         leading/trailing/inner whitespace: " app le " should be treated
     *         as "apple"
     *      c) Your solution should trim/strip/remove any non-alphanumeric
     *         characters (a-z, A-Z, 0-9): "apple!" should be treated as
     *         "apple"
     *
     * 2) Write the unit test coverage for your solution. Cover the
     *    permutations that ensure positive/negative functionality is correct.
     *    As well, cover meaningful edge cases to ensure both correct
     *    functionality and to ensure no errors with code execution.
     *    Note: For test coverage, feel free to just use assertion statements.
     *    However, if you're more comfortable using a testing library, that is
     *    acceptable too.
     * 3) At the top of your function/solution, document as a comment the big O
     *    run time of your solution.
     */


    static HashMap<String, Integer> mapFrequencies;

    public static void main(String[] args) {

    }

//    public static HashMap<String, Integer> countElementFrequencies(ArrayList<String> arr) {
//        for (int i = 0; i <= arr.size(); i++) {
//
//        }
//        mapFrequencies.put(element, elementCount);
//        return mapFrequencies;
//
//    }

    private static void deformat(String text) {
        // ignore upper/lower case
        // trim/strip leading/trailing/inner whitespace
        // trim non-alphanumeric
    }

//    @Test
//    public static void testUpperCase() {
//        String[] arr = {"apple", "bat", "apple", "car"};
//        System.out.println(Arrays.asList(occurrenceCount));
//    }

    @Test
    public static void testWhitespaceLeading() {

    }

    @Test
    public static void testWhitespaceTrailing() {
    }

    @Test
    public static void testWhitespaceInner() {
    }

    @Test
    public static void testNonAlphanumericChars() {
    }

//    @Test
//    public static void testList() {
//        //Converting Array to List
//        List<String> list = new ArrayList<String>();
//        for (String lang : array) {
//            list.add(lang);
//        }
//        System.out.println("Printing List: " + list);
//    }
}

