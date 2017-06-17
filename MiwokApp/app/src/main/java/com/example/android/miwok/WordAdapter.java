package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EMASYS ND on 6/17/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> numbers) {
        super(context,0, numbers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }

        Word words = getItem(position);

        TextView englishWord = (TextView) listItemView.findViewById(R.id.english);
        englishWord.setText(words.getmEnglishWord());

        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok);
        miwokWord.setText(words.getmMiwokWord());

        return listItemView;
    }
}
