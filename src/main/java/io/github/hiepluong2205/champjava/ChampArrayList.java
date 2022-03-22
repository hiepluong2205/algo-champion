package io.github.hiepluong2205.champjava;

import io.github.hiepluong2205.hackerrank.ChampList;

import java.util.ArrayList;
import java.util.Collections;

public class ChampArrayList extends ChampList {
    ArrayList<Integer> numbers;

    public ArrayList<Integer> sort() {
        Collections.sort(numbers);
        return numbers;
    }
    public ArrayList<Integer> shuffle() {
        Collections.shuffle(numbers);
        return numbers;
    }
}

