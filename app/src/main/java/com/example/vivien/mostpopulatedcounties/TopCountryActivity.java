package com.example.vivien.mostpopulatedcounties;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_country);

        TopCountries topCountries = new TopCountries();
        ArrayList<Country> list = topCountries.getList();

        TopCountriesAdapter countriesAdapter = new TopCountriesAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(countriesAdapter);
    }


    public void onListItemClick(View listItem){

        Country country = (Country) listItem.getTag();

        Intent intent = new Intent(this, CountryActivity.class);
        intent.putExtra("country", country);
        startActivity(intent);

    }
}
