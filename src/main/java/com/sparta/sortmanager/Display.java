package com.sparta.sortmanager;

public class Display {
    int arrayLength, lowerBound, Upperbound;
    String sortType;
    boolean timed;


    public void displayMenu(int[] arraySettings, String sortType, boolean timed) {
        System.out.println("Current settings");
        System.out.println("1. Array Settings: ");
        System.out.println("2. Sort Type: ");
        System.out.println("3. Time?: ");
    }


    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperbound() {
        return Upperbound;
    }

    public void setUpperbound(int upperbound) {
        Upperbound = upperbound;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public boolean isTimed() {
        return timed;
    }

    public void setTimed(boolean timed) {
        this.timed = timed;
    }

}
