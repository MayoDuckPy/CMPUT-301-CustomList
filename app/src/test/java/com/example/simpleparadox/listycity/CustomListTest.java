package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list = new CustomList(null, new ArrayList<City>());

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize+1, list.getCount());
    }
}
