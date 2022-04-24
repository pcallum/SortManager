package com.sparta.sortmanager.arraylogic;

import java.util.Random;

public class RandomArray {
    public int[] newRandomArray(int length, int lowerBound, int upperBound) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }
        if (upperBound < lowerBound) {
            throw new IllegalArgumentException("Upper Bound must be greater than Lower Bound.");
        }

        Random rand = new Random();

        int[] randomArr = rand.ints(length, lowerBound, upperBound).toArray();

        return randomArr;
    }
}
