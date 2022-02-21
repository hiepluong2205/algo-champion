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

package io.github.hiepluong2205.leetcode;

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");

                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void typeCounter(String sentence) {
        int countString = 0, countDouble = 0, countInt = 0;
        String[] arrWords = sentence.split("\\s+");

        System.out.println(arrWords.toString());
        for (String i : arrWords) {
            if (isInt(i)) {
                countInt++;
            } else if (isDouble(i)) {
                countDouble++;
            } else {
                countString++;
            }
        }
        System.out.println("string " + countString);
        System.out.println("integer " + countInt);
        System.out.println("double " + countDouble);
    }


    public static boolean isDouble(String word) {
        try {
            Double.parseDouble(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String decryptMessage(String encryptedMessage) {
        String[] arrWords = encryptedMessage.split("\\s+");
        for (String word:arrWords) {
            decompressWord(word);
        }
        return "";
    }

    public static String[] reverseArr(String[] arrWords) {
        String[] arrReversed = {};
        return arrReversed;
    }

    public static void decompressWord(String compressedWord) {
        char[] arrChars = compressedWord.toCharArray();
        for (char i : arrChars) {
            if (isInt(i)) {

            }
        }

        for (int i = 0; i < arrChars.length; i++) {

        }
    }

    public static boolean isInt(char character) {
        try {
            Integer.parseInt(String.valueOf(character));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInt(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
