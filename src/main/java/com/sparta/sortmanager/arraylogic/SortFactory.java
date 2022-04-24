package com.sparta.sortmanager.arraylogic;

import static com.sparta.sortmanager.control.LogDriver.logger;

public class SortFactory {
    public static Sorters getSortType(String arg) {
        return switch (arg) {
            case "bubble" -> new BubbleSort();
            case "merge" -> new MergeSort();
            case "binary" -> new BinarySort();
            default -> {
                logger.fatal("Illegal sort type in sort factory.");
                throw new IllegalArgumentException(arg + " is not 'bubble', 'merge', or 'binary'");
            }
        };
    }
}
