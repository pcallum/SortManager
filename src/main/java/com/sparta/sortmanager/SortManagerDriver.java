package com.sparta.sortmanager;

import java.util.Arrays;
import java.util.Scanner;

public class SortManagerDriver {
    public static void main(String[] args) {
        SortFactory sortFactory = new SortFactory();
        int[] arr1 = {1,3, 2, 3, 5, 6, 4, 1};
        int[] arr2 = {2};
        int[] arr3 = {};

        Scanner scan = new Scanner(System.in);
        System.out.println("Which sorting algorithm do you want to use?");
        System.out.println("Type 'bubble' or 'merge': ");
        String response = scan.next();

        SortFactory.getSortType(response).sortAndPrint(arr1);
    }


}
