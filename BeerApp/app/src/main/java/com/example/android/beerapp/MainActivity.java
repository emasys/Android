package com.example.android.beerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CheckBeer expert = new CheckBeer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findBeer(View v) {
        //Get the value of the selected item in the spinner
        Spinner beerType = (Spinner) findViewById(R.id.spinner);
        String beer = String.valueOf(beerType.getSelectedItem());

        //Display the value of the selected item in the spinner in the Textview

        TextView brands = (TextView) findViewById(R.id.brand);
//        brand.setText(beer);

        //find beer slogan
        List<String> brandsList = expert.beer(beer);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
//Display the beers
        brands.setText(brandsFormatted);

    }
}
