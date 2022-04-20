package com.sparta.sortmanager;

public class SortFactory {
    public static Sort getSortType(String arg) {
         switch (arg){
             case "bubble": return new BubbleSort();
             case "merge": return new MergeSort();
             default: throw new IllegalArgumentException(arg + " is not 'bubble' or 'merge'");
         }
    }
}
