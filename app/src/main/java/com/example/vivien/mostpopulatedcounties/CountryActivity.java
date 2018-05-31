package com.example.vivien.mostpopulatedcounties;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        Intent intent = getIntent();
        Country country = (Country) intent.getSerializableExtra("country");

        TextView displayName = findViewById(R.id.name);
        String name = country.getName();
        displayName.setText(name);

        ImageView imageView = findViewById(R.id.flag);
        int flag = country.getImage();
        imageView.setImageResource(flag);

    }
}
