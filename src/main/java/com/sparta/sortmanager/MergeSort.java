package com.sparta.sortmanager;

import java.util.Arrays;

public class MergeSort implements Sort {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int a1index = 0, a2index = 0;

        // this while is equivalent to "for(int i = 0; i < merged.length; i++)" with i = a1index + a2index
        while (a1index + a2index < merged.length) {
            // if at the end of first array, merge from second array no matter what
            if (a1index == arr1.length) {
                merged[a1index + a2index] = arr2[a2index++];
                continue;
            }
            // if at the end of first array, merge from first array no matter what
            if (a2index == arr2.length) {
                merged[a1index + a2index] = arr1[a1index++];
                continue;
            }

            // else
            merged[a1index + a2index] = (arr1[a1index] < arr2[a2index]) ? arr1[a1index++] : arr2[a2index++];
        }
        return merged;
    }

    private static int[] mergeSort(int[] arr) {
        // if condition is met array is already sorted
        if (arr.length < 2) return arr;

        int arrMid = arr.length / 2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, arrMid);
        int[] secondHalf = Arrays.copyOfRange(arr, arrMid, arr.length);

        //sort(...) will return ... split into halves until they are length 1
        // then return itself and go back up the chain merging halves
        return merge(mergeSort(firstHalf), mergeSort(secondHalf));
    }

    @Override
    public int[] sortAndReturn(int[] arr) {
        return mergeSort(arr);
    }

    @Override
    public void sortAndPrint(int[] arr) {
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
