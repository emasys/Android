package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<>();

        numbers.add(new Word("one","lutti",R.drawable.number_one));
        numbers.add(new Word("two","otiiko",R.drawable.number_two));
        numbers.add(new Word("three", "tolookosu", R.drawable.number_three));
        numbers.add(new Word("four","oyyisa", R.drawable.number_four));
        numbers.add(new Word("five","massokka", R.drawable.number_five));
        numbers.add(new Word("six","temmokka", R.drawable.number_six));
        numbers.add(new Word("seven","kenekaku", R.drawable.number_seven));
        numbers.add(new Word("eight","kawinta", R.drawable.number_eight));
        numbers.add(new Word("nine","wo'e", R.drawable.number_nine));
        numbers.add(new Word("ten","na'aacha", R.drawable.number_ten));

        WordAdapter adapter =  new WordAdapter(this, numbers, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.root_view);


        listView.setAdapter(adapter);

    }
}
