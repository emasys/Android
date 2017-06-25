package com.example.android.tourguideapp;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar)findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("This Is LAGOS");
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.MyCustomTabTextAppearance);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextExpAppearance);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/Fugaz.ttf");
        Typeface face1= Typeface.createFromAsset(getAssets(), "fonts/PassionOne.ttf");

        collapsingToolbarLayout.setCollapsedTitleTypeface(face);
        collapsingToolbarLayout.setExpandedTitleTypeface(face1);



        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context, R.color.colorPrimary));
    }
}
