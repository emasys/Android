package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EMASYS ND on 6/17/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResource;
    public WordAdapter(Context context, ArrayList<Word> numbers, int colorResource) {
        super(context,0, numbers);
        this.mColorResource = colorResource;

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

            ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if(words.getmResourceId() == 0) {
            image.setVisibility(View.GONE);


        }else{

            image.setImageResource(words.getmResourceId());
            image.setVisibility(View.VISIBLE);
        }

        View textContainer = listItemView.findViewById(R.id.list);
        int color = ContextCompat.getColor(getContext(), mColorResource);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
