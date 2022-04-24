package com.sparta.sortmanager.display;

import org.apache.logging.log4j.Level;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import static com.sparta.sortmanager.control.LogDriver.logger;

public class Display {
    public Display(int arrayLength, int lowerBound, int upperBound, String sortType) {
        this.arrayLength = arrayLength;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.sortType = sortType;
    }

    int arrayLength, lowerBound, upperBound;
    String sortType;

    public void mainMenu() {
        System.out.println("\n Current settings: ");
        System.out.println("Array Settings - " +
                "Length = " + getArrayLength() +
                ", lower bound = " + getLowerBound() +
                ", upper bound = " + getUpperBound());
        System.out.println("Sort Type - " + getSortType());
    }

    public void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void getSettings() {
        this.setArraySettings();
        this.setSortType();
    }

    public void setArraySettings() {
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter the length of the array as an integer: ");
                this.arrayLength = scan.nextInt();

                System.out.println("Enter the lower bound of values in the array as an integer: ");
                this.lowerBound = scan.nextInt();

                System.out.println("Enter the upper bound of values in the array as an integer: ");
                this.upperBound = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please only enter integers.");
                logger.catching(Level.WARN, e);
            }
        } while(this.upperBound < this.lowerBound || this.arrayLength < 0);
    }


    public void setSortType() {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter the sorting algorithm to use (merge, bubble, binary): ");
            try {
                this.sortType = scan.next();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a string.");
                logger.catching(Level.WARN, e);
            }
        } while (!this.sortType.equals("merge") && !this.sortType.equals("bubble") && !this.sortType.equals("binary"));
    }

    public int getArrayLength() {
        return arrayLength;
    }


    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public String getSortType() {
        return sortType;
    }

}
