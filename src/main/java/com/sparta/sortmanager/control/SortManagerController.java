package com.sparta.sortmanager.control;

import com.sparta.sortmanager.arraylogic.RandomArray;
import com.sparta.sortmanager.arraylogic.SortFactory;
import com.sparta.sortmanager.display.Display;


public class SortManagerController {
    public static void performSort(Display display) {
        RandomArray rand = new RandomArray();
        long startTime, endTime;
        System.out.println("Random array: ");
        int[] rArr = rand.newRandomArray(display.getArrayLength(), display.getLowerBound(), display.getUpperBound());
        if (display.getArrayLength() < 100) {
            display.printArray(rArr);
        }

        startTime = System.nanoTime();

        int[] sortedArray = SortFactory.getSortType(display.getSortType()).returnSorted(rArr);

        endTime = System.nanoTime();

        if (display.getArrayLength() < 100) {
            System.out.println("Sorted array: ");
            display.printArray(sortedArray);
        }

        System.out.println("Done in " + (endTime - startTime) / 1000000000.0 + " seconds");
    }
}
