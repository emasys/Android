package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EMASYS ND on 7/4/2017.
 */

public class WordAdapter extends ArrayAdapter<Earthquake> {
    public WordAdapter(Context context, ArrayList<Earthquake> words) {
        super(context,0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_activity, parent, false);
        }

        Earthquake earthquake = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.mag);
        magnitude.setText(earthquake.getMag());

        TextView city = (TextView) listItemView.findViewById(R.id.city);
        city.setText(earthquake.getCity());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(earthquake.getLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(earthquake.getDate());

        TextView time = (TextView) listItemView.findViewById(R.id.time);
        time.setText(earthquake.getTime());



        return listItemView;
    }
}