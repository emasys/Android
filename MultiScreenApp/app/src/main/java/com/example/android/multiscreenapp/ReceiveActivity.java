package com.example.android.multiscreenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        Intent intent = getIntent();

        String theMessage = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView) findViewById(R.id.r_message);
        messageView.setText(theMessage);

    }

    public void sendIt(View view){

        TextView messageView = (TextView) findViewById(R.id.r_message);
        String text = messageView.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(intent.EXTRA_TEXT, text);

        Intent chooser = Intent.createChooser(intent, "choose your default app");
        startActivity(chooser);

    }

}
