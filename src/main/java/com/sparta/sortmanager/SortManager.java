package com.sparta.sortmanager;

public class SortManager {
    public int[] sort(String arg, int[] arr) {
        switch (arg) {
            case "bubble":
                BubbleSort bubble = new BubbleSort();
                return bubble.bubbleSort(arr);
            case "merge":
                MergeSort merge = new MergeSort();
                return merge.mergeSort(arr);
            default:
                throw new IllegalArgumentException(arg + " is not bubble or merge");
        }
    }
}
