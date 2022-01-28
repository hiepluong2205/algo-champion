package io.github.hiepluong2205.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/three-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one
public class PlusMinus {
    public static void main() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();

    }

    public static void plusMinus(List<Integer> arr) {
        int countElementsNegative = 0, countElementsPositive = 0, countElementsZero = 0;
        Iterator<Integer> it = arr.iterator();
        for (int i = 0; i < arr.size(); i++) {
            if (it.next() == 0) {
                countElementsZero++;
            } else if (it.next() > 0) {
                countElementsPositive++;
            } else {
                countElementsNegative++;
            }
        }

        float rateElementsNegative = 0.000000f, rateElementsPositive = 0.000000f, rateElementsZero = 0.000000f;
        rateElementsNegative = countElementsNegative / arr.size();
        rateElementsPositive = countElementsPositive / arr.size();
        rateElementsZero = countElementsZero / arr.size();
        System.out.println(rateElementsPositive);
        System.out.println(rateElementsNegative);
        System.out.println(rateElementsZero);
    }

    private static int countElementsZero(List<Integer> arr) {
        int intCountElementsNegative = 0, intCountElementsPositive = 0, countElementsZero = 0;
        Iterator<Integer> it = arr.iterator();
        for (int i = 0; i < arr.size(); i++) {
            if (it.next() == 0) {
                countElementsZero++;
            } else if (it.next() > 0) {
                intCountElementsPositive++;
            } else {
                intCountElementsNegative++;
            }
        }
        return countElementsZero;
    }

    private static int countElementsPositive(List<Integer> arr) {
        return 0;
    }

    private static int countElementsNegative(List<Integer> arr) {
        return 0;
    }
}
