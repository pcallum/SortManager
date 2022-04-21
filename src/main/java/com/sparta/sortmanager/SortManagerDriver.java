package com.sparta.sortmanager;

import java.util.Scanner;

public class SortManagerDriver {
    public static void main(String[] args) {
        RandomArray rand = new RandomArray();
        Display display = new Display();
        Scanner scan = new Scanner(System.in);
        int option = 0;
        boolean exit = false;
        display.mainMenu();

        while (option != 5) {
            if(option == 0 || option == 1) {
                display.setArraySettings();
                int[] rArr = rand.newRandomArray(display.getArrayLength(),display.getLowerBound(), display.getUpperBound());
            }
            if(option == 0 || option == 1) {
                display.setTimeUnit();
            }
            if(option == 0 || option == 1) {
                display.setPrint();
            }
            System.out.println("Enter 1-3 to change settings, 4 to sort array, 5 to exit: ");
            option = scan.nextInt();

        }

        //SortFactory.getSortType(strResponse).sortAndPrint(rArr, "ms");
    }


}
