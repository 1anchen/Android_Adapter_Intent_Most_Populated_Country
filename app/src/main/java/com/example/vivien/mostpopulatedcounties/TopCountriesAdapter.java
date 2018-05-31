package com.example.vivien.mostpopulatedcounties;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopCountriesAdapter extends ArrayAdapter<Country>{


        public TopCountriesAdapter(Context context, ArrayList<Country> countries) {
            super(context, 0, countries);
        }

        @Override
        public View getView(int position, View listItemView, ViewGroup parent) {

            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.country_item, parent, false);
            }

            Country currentCountry = getItem(position);

            TextView ranking = listItemView.findViewById(R.id.ranking);
            ranking.setText(currentCountry.getRanking().toString());
            ranking.getHighlightColor();

            TextView name =  listItemView.findViewById(R.id.name);
            name.setText(currentCountry.getName());

            TextView population = listItemView.findViewById(R.id.population);
            population.setText(currentCountry.getPopulation().toString());

            listItemView.setTag(currentCountry);

            return listItemView;

        }
}
