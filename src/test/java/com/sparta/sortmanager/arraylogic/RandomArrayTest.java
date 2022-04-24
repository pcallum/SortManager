package com.sparta.sortmanager.arraylogic;

import com.sparta.sortmanager.arraylogic.RandomArray;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomArrayTest {
        RandomArray rand = new RandomArray();

    @Test
    void randomArrayHasCorrectLength() {
        int[] rArr = rand.newRandomArray(100, -100, 100);
        assertEquals(100, rArr.length);
    }

    @Test
    void randomArrayThrowsLength() {
        assertThrows(IllegalArgumentException.class,
                () -> rand.newRandomArray(-10, -100, 100)
        );
    }

    @Test
    void randomArrayThrowsBounds() {
        assertThrows(IllegalArgumentException.class,
                () -> rand.newRandomArray(100, 100, -100)
        );
    }
}
