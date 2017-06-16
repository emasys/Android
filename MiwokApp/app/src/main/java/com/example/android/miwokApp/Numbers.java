package com.example.android.miwokApp;

import android.view.View;
import android.widget.Toast;

/**
 * Created by EMASYS ND on 6/16/2017.
 */

public class Numbers implements View.OnClickListener {

    @Override
    public void onClick(View view) {

        Toast.makeText(view.getContext(), "Numbers has been clicked", Toast.LENGTH_SHORT).show();

    }
}
