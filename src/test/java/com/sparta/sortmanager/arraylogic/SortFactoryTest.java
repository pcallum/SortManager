package com.sparta.sortmanager.arraylogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortFactoryTest {
    SortFactory sortFactory = new SortFactory();

    @Test
    void getSortTypeWrongString() {
        assertThrows(IllegalArgumentException.class,
                () -> SortFactory.getSortType("Bla bla")
                );
    }

}