package com.example.vivien.mostpopulatedcounties;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryTest {

    Country country;

    @Before
    public void before() {
        country = new Country(1,"China",  1330141295, R.drawable.chineseflag);
    }

    @Test
    public void getRanking(){
        assertEquals((Integer) 1, country.getRanking());

    }
    @Test
    public void getName(){
        assertEquals("China", country.getName());

    }

    @Test
    public void getPopulation() {
        assertEquals((Integer)1330141295, country.getPopulation());

    }
    @Test
    public void getImage() {
        assertEquals(R.drawable.chineseflag, country.getImage());

    }


}
