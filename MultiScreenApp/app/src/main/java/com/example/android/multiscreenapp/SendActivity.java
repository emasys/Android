package com.example.android.multiscreenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_message);
    }

    public void sendMessage(View view){

        Intent intent = new Intent(this, ReceiveActivity.class);
        startActivity(intent);

    }
}
