package com.sparta.sortmanager.arraylogic;

import com.sparta.sortmanager.arraylogic.BubbleSort;
import com.sparta.sortmanager.arraylogic.MergeSort;
import com.sparta.sortmanager.arraylogic.Sorters;

public class SortFactory {
    public static Sorters getSortType(String arg) {
         switch (arg){
             case "bubble": return new BubbleSort();
             case "merge": return new MergeSort();
             default: throw new IllegalArgumentException(arg + " is not 'bubble' or 'merge'");
         }
    }
}
