package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("Where are you going?","minto wuksus"));
        colors.add(new Word("What is your name?","tinna oyaase'na"));
        colors.add(new Word("My name is....", "oyaaset..."));
        colors.add(new Word("How are you feeling?","michaksas?"));
        colors.add(new Word("Are you coming?","aanas'aa?"));
        colors.add(new Word("Yes, I'm coming.","haa' aanam"));
        colors.add(new Word("I'm coming.","aanam"));
        colors.add(new Word("Come here","anni'nem"));


        WordAdapter adapter =  new WordAdapter(this, colors, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.root_view);


        listView.setAdapter(adapter);

    }
}
