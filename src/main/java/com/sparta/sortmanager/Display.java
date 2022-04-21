package com.sparta.sortmanager;

public class Display {
    int arrayLength, lowerBound, upperBound;
    String sortType, timeUnit;
    boolean print;

    public void displayMenu() {
        System.out.println("Current settings");
        System.out.println("1. Array Settings: " +
                "Length = " + getArrayLength() +
                ", lower bound = " + getLowerBound() +
                ", upper bound = " + getUpperBound());
        System.out.println("2. Sort Type: " + sortType);
        System.out.println("3. Time: " + timeUnit);
        System.out.println("4. Print result: " + print);
    }


    public boolean isPrint() {
        return print;
    }

    public void setPrint(boolean print) {
        this.print = print;
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

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public String isTimed() {
        return timeUnit;
    }

    public void setTimed(String timeUnit) {
        this.timeUnit = timeUnit;
    }

}
