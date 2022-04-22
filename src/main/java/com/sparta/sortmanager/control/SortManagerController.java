package com.sparta.sortmanager.control;

import com.sparta.sortmanager.arraylogic.RandomArray;
import com.sparta.sortmanager.arraylogic.SortFactory;
import com.sparta.sortmanager.display.Display;

import java.util.Scanner;

public class SortManagerController {

    public static void main(String[] args) {
        RandomArray rand = new RandomArray();
        Display display = new Display();
        Scanner scan = new Scanner(System.in);
        int[] rArr = new int[0];
        int[] sortedArray;
        int option = 0;
        boolean exit = false;
        display.mainMenu();

        while (option != 6) {
            if(option == 0 || option == 1) {
                display.setArraySettings();
                rArr = rand.newRandomArray(display.getArrayLength(),display.getLowerBound(), display.getUpperBound());
            }

            if(option == 0 || option == 2) {
                display.setSortType();
            }

            if(option == 0 || option == 3) {
                display.setTimeUnit();
            }
            if(option == 0 || option == 4) {
                display.setPrint();
            }
            System.out.println("Enter 1-3 to change settings, 5 to sort array, 6 to exit: ");
            option = scan.nextInt();
            if (option == 5) {
                if (display.isPrint()) {
                    display.printArray(rArr);
                }

                if (display.getTimeUnit() != null) {
                    sortedArray = SortFactory.getSortType(display.getSortType()).returnSortedAndPrintTime(rArr, display.getTimeUnit());
                } else {
                    sortedArray = SortFactory.getSortType(display.getSortType()).returnSorted(rArr);
                }

                if (display.isPrint()) {
                    display.printArray(sortedArray);
                }

            }

        }

        //SortFactory.getSortType(strResponse).sortAndPrint(rArr, "ms");
    }


}
