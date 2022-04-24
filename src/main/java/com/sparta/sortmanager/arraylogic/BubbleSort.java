package com.sparta.sortmanager.arraylogic;

import static com.sparta.sortmanager.control.LogDriver.logger;

public class BubbleSort implements Sorters {
    // swaps values at index n1 and n2 in arr
    public int[] swap(int[] arr, int n1, int n2) {
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
            for (int i = 0; i < (arr.length - sorted - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    arr = swap(arr, i, i + 1);
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
}