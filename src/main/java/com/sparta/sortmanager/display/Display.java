package com.sparta.sortmanager.display;

import java.util.Arrays;
import java.util.Scanner;

public class Display {
    int arrayLength, lowerBound, upperBound;
    String sortType, timeUnit;
    boolean print;

    public void mainMenu() {
        System.out.println("Current settings");
        System.out.println("1. Array Settings: " +
                "Length = " + getArrayLength() +
                ", lower bound = " + getLowerBound() +
                ", upper bound = " + getUpperBound());
        System.out.println("2. Sort Type: " + getSortType());
        System.out.println("3. Time: " + getTimeUnit());
        System.out.println("4. Print result: " + isPrint());
    }

    public void setArraySettings() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the array as an integer: ");
        this.arrayLength = scan.nextInt();

        System.out.println("Enter the lower bound of values in the array as an integer: ");
        this.lowerBound = scan.nextInt();

        System.out.println("Enter the upper bound of values in the array as an integer: ");
        this.upperBound = scan.nextInt();
    }

    public void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void setSortType() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sorting algorithm to use (merge or sort): ");
        this.sortType = scan.next();
    }

    public void setTimeUnit() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the unit of time (nanoseconds, milliseconds, seconds) or nothing to not time it: ");
        this.timeUnit = scan.next();
    }

    public void setPrint() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to print the array and result? (true/false): ");
        this.print = scan.nextBoolean();
    }

    public void setArraySettings(int arrayLength, int lowerBound, int upperBound) {
        this.arrayLength = arrayLength;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }



    public boolean isPrint() {
        return print;
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

    public String getTimeUnit() {
        return timeUnit;
    }


}
