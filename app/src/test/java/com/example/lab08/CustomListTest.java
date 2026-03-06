package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because deleteCity() doesn't exist
        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        int cityCount = list.countCities();
        assertEquals(0,cityCount);

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        City Edmonton = new City("Edmonton", "AB");
        list.addCity(Edmonton);

        int cityCount2 = list.countCities();
        assertEquals(2,cityCount2);
    }
}
