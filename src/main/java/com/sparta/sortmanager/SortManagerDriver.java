package com.sparta.sortmanager;

import java.util.Arrays;
import java.util.Scanner;

public class SortManagerDriver {
    public static void main(String[] args) {
        RandomArray rand = new RandomArray();

        Scanner scan = new Scanner(System.in);


        // put this in a display class and add checks
        System.out.println("Type the length of array you want to make: ");
        int lengthResponse = scan.nextInt();

        System.out.println("Type the lower bound of integers in the array: ");
        int lowerBoundResponse = scan.nextInt();

        System.out.println("Type the upper bound of integers in the array: ");
        int upperBoundResponse = scan.nextInt();

        int[] rArr = rand.newRandomArray(lengthResponse,lowerBoundResponse, upperBoundResponse);
        System.out.println(Arrays.toString(rArr));

        System.out.println("Which sorting algorithm do you want to use?");
        System.out.println("Type 'bubble' or 'merge': ");
        String strResponse = scan.next();
        //String strResponse = "merge";

        SortFactory.getSortType(strResponse).sortAndPrint(rArr, "ms");
    }


}
