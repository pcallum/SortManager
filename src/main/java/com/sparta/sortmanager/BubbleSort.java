package com.sparta.sortmanager;

import java.util.Arrays;

public class BubbleSort implements Sort {
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

        boolean anySwaps = false;
        int maxUnsorted = arr.length - 1;

        //
        while (!anySwaps && maxUnsorted > 0) {
            anySwaps = false;
            for(int i = 0; i < maxUnsorted; i++) {
                if (arr[i] > arr[i+1]) {
                    arr = swap(arr, i, i+1);
                    anySwaps = true;
                }
            }
            maxUnsorted--;
        }
        return arr;
    }

    @Override
    public int[] sortAndReturn(int[] arr) {
        return bubbleSort(arr);
    }

    @Override
    public void sortAndPrint(int[] arr) {
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
