package com.sparta.sortmanager;

import java.util.Random;

public class RandomArray {
    public int[] newRandomArray(int length, int lowerBound, int upperBound) {
        Random rand = new Random();

        int[] randomArr = rand.ints(length, lowerBound, upperBound).toArray();

        return randomArr;
    }
}
