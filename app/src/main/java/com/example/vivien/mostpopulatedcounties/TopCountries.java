package com.example.vivien.mostpopulatedcounties;


import java.util.ArrayList;

public class TopCountries {

    private ArrayList<Country> list;

    public TopCountries() {
        list = new ArrayList<>();
        list.add(new Country(1, "China", 1330141295,R.drawable.chineseflag));
        list.add(new Country(2, "India", 1173108018,R.drawable.indiaflag));
        list.add(new Country(3, "USA", 310232863,R.drawable.usaflag));
        list.add(new Country(4, "Indonesia", 242968342,R.drawable.indonesiaflag));
        list.add(new Country(5, "Brazil", 201103330,R.drawable.brazilflag));

    }

    public ArrayList<Country> getList() {
        return new ArrayList<Country>(list);
    }
}