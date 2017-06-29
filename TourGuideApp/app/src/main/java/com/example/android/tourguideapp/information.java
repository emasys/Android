package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.tourguideapp.R.layout.activity_information;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_information);

        final Toolbar toolbar = (Toolbar)findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("Useful Information");
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.MyCustomTabTextAppearance);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextExpAppearance);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/Fugaz.ttf");
        Typeface face1= Typeface.createFromAsset(getAssets(), "fonts/PassionOne.ttf");

        collapsingToolbarLayout.setCollapsedTitleTypeface(face);
        collapsingToolbarLayout.setExpandedTitleTypeface(face1);

        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);



        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context, R.color.colorPrimary));

        final ArrayList<Word> word = new ArrayList<>();

        word.add(new Word("About Lagos"));
        word.add(new Word("Language"));
        word.add(new Word("Airport"));
        word.add(new Word("Transport"));
        word.add(new Word("Banks and Money"));
        word.add(new Word("Visas and Border Control"));
        word.add(new Word("Emergency Phone numbers"));
        word.add(new Word("Tourist Information Offices"));



        WordAdapter adapter =  new WordAdapter(this, word);

        ListView listView = (ListView) findViewById(R.id.root_view);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long resourceId) {
                Class<? extends Activity> activityToStart = null;

                switch (position){
                    case 0:
                        activityToStart = AboutLagos.class;
                        break;
                    case 1:
                        activityToStart = language.class;
                        break;
                    //etc.
                }

                Intent i = new Intent(getApplicationContext(), activityToStart);
                startActivity(i);




            }
        });

    }
}
