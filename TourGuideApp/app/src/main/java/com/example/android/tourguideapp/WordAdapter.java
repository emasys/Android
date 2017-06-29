package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EMASYS ND on 6/27/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> word) {
        super(context,0, word);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }

        Word words = getItem(position);

        TextView word = (TextView) listItemView.findViewById(R.id.word);
        word.setText(words.getmWord());



//        View textContainer = listItemView.findViewById(R.id.list);
//        int color = ContextCompat.getColor(getContext(), mColorResource);
//        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
