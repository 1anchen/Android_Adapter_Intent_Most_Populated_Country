package com.example.vivien.mostpopulatedcounties;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopCountriesTest {
    @Test
    public void getListTest() {
        TopCountries topCountries = new TopCountries();
        assertEquals(5, topCountries.getList().size());
    }
}
