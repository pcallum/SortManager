package com.sparta.sortmanager;

import java.util.Arrays;
import java.util.Scanner;

public class SortManagerDriver {
    public static void main(String[] args) {
        SortFactory sortFactory = new SortFactory();
        RandomArray rand = new RandomArray();

        int[] arr1 = {1,3, 2, 3, 5, 6, 4, 1};
        int[] rArr = rand.newRandomArray(10, -100, 100);
        System.out.println(Arrays.toString(rArr));
        int[] arr3 = {};

        Scanner scan = new Scanner(System.in);
        System.out.println("Which sorting algorithm do you want to use?");
        System.out.println("Type 'bubble' or 'merge': ");
        //String response = scan.next();
        String response = "merge";

        SortFactory.getSortType(response).sortAndPrint(rArr);
    }


}
