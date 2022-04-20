package io.github.hiepluong2205.champjava;

import java.util.Arrays;
import java.util.HashSet;

public class ChampSet {
    public void search(int[] arr, int k) {
    }

    public void insert(int[] arr, int s) {
    }

    public void delete(int[] arr, int x) {
    }

    public void successor(int[] arr, int x) {
    }

    public void predecessor(int[] arr, int x) {
    }

    public void minimum(int[] arr) {
    }

    public void maximum(int[] arr) {
    }

    // https://leetcode.com/problems/intersection-of-two-arrays/
    public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] resultArray = new int[set1.size()];
        int idx = 0;
        for (Integer s : set1) {
            if (set2.contains(s)) resultArray[idx++] = s;
        }
        return Arrays.copyOf(resultArray, idx);
    }
}
