package com.sparta.sortmanager;

import java.util.Arrays;

public class BubbleSort implements Sorters {
    // swaps values at index n1 and n2 in arr
    public int[] swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
        return arr;
    }

    public int[] bubbleSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        boolean anySwaps = true;
        int sorted = 0;

        // if no swaps were made in this pass array is sorted
        while (anySwaps) {
            anySwaps = false;
            for(int i = 0; i < (arr.length - sorted - 1); i++) {
                if (arr[i] > arr[i+1]) {
                    arr = swap(arr, i, i+1);
                    anySwaps = true;
                }
            }
            // right-most element is sorted every pass
            sorted++;
        }
        return arr;
    }

    @Override
    public int[] returnSorted(int[] arr) {
        return bubbleSort(arr);
    }

    @Override
    public void sortAndPrint(int[] arr) {
        System.out.println(Arrays.toString(returnSorted(arr)));
    }

    @Override
    public void sortAndPrint(int[] arr, String timeUnit) {
        switch(timeUnit) {
            case "ns" -> {
                long start = System.nanoTime();
                System.out.println(Arrays.toString(returnSorted(arr)));
                long end = System.nanoTime();
                System.out.println("Done in " + (end - start) + " nanoseconds.");
            }
            case "ms" -> {
                long start = System.currentTimeMillis();
                System.out.println(Arrays.toString(returnSorted(arr)));
                long end = System.currentTimeMillis();
                System.out.println("Done in " + (end - start) + " milliseconds.");
            }
            case "s" -> {
                long start = System.currentTimeMillis();
                System.out.println(Arrays.toString(returnSorted(arr)));
                long end = System.currentTimeMillis();
                System.out.println("Done in " + (end - start) / 1000.0 + " seconds.");
            }
            default -> throw new IllegalStateException("timeUnit must be 'ns', 'ms' or 's': " + timeUnit);
        }

/*    @Override
    public long sortAndTime(int[] arr) {
        long startTime = System.nanoTime();
        arr = bubbleSort(arr);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime + " ns");
        return endTime - startTime;*/
    }
}
