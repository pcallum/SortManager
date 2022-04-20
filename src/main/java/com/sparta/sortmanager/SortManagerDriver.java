package com.sparta.sortmanager;

import java.util.Arrays;

public class SortManagerDriver {
    public static void main(String[] args) {
        int[] arr = {2,3};
        SortManager sort = new SortManager();
        System.out.println(Arrays.toString(arr));
        System.out.println("sorted: " + Arrays.toString(sort.sort("bubble", arr)));
    }


}
