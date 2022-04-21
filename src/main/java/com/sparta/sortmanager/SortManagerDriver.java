package com.sparta.sortmanager;

import java.util.Arrays;
import java.util.Scanner;

public class SortManagerDriver {
    public static void main(String[] args) {
        RandomArray rand = new RandomArray();
        Display disp = new Display();

        Scanner scan = new Scanner(System.in);



        disp.displayMenu();



        int[] rArr = rand.newRandomArray(disp.getArrayLength(),disp.getLowerBound(), disp.getUpperBound());
        System.out.println(Arrays.toString(rArr));

        System.out.println("Which sorting algorithm do you want to use?");
        System.out.println("Type 'bubble' or 'merge': ");
        String strResponse = scan.next();
        //String strResponse = "merge";

        SortFactory.getSortType(strResponse).sortAndPrint(rArr, "ms");
    }


}
