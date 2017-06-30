package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar)findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("This Is Lagos");
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.MyCustomTabTextAppearance);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextExpAppearance);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/Fugaz.ttf");
        Typeface face1= Typeface.createFromAsset(getAssets(), "fonts/PassionOne.ttf");

        collapsingToolbarLayout.setCollapsedTitleTypeface(face);
        collapsingToolbarLayout.setExpandedTitleTypeface(face1);



        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context, R.color.colorPrimary));

        // Find the view pager that will allow the user to swipe between fragments
//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//
//        // Create an adapter that knows which fragment should be shown on each page
//        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());
//
//        // Set the adapter onto the view pager
//        viewPager.setAdapter(adapter);
//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
    }

    public void getInfo(View view){
        Intent intent = new Intent(this,information.class);
        startActivity(intent);
    }

    public void getAttraction(View view){
        Intent intent = new Intent(this,test.class);
        startActivity(intent);
    }
}
