package com.sparta.sortmanager.arraylogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinarySortTest {
    Sorters binary = new BinarySort();

    @Test
    void returnSortedSorts() {
        int[] expected = {-3, 4, 7, 7, 10, 11, 12};
        int[] result = binary.returnSorted(new int[]{10, 7, 11, -3, 4, 12, 7});
        assertArrayEquals(expected, result);
    }
}
