package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    @Test
    public void addCityTest() {
        CustomList list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        CustomList list = new CustomList(null, new ArrayList<City>());
        assertFalse(list.hasCity(new City("Edmonton", "Alberta")));
        list.addCity(new City("Edmonton", "Alberta"));
        assertTrue(list.hasCity(new City("Edmonton", "Alberta")));
    }
}
