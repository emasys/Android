package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void submit(View v) {

        if (getAnswer_Q1().equals("132")) {
            score += 25;
        } else {
            score += 0;
        }

        if (getAnswer_Q2().equals("Monday")) {
            score += 25;
        } else {
            score += 0;
        }

        if (getAnswer_Q3().equals("bloat")) {
            score += 25;
        } else {
            score += 0;
        }

        if (getAnswer_Q4().equals("leaf")) {
            score += 25;
        } else {
            score += 0;
        }


        CheckBox showResult = (CheckBox) findViewById(R.id.showResult);
        boolean printResult = showResult.isChecked();

        CheckBox sendMail = (CheckBox) findViewById(R.id.sendMail);
        boolean emailMe = sendMail.isChecked();

        String message = "";

        switch (score) {
            case 0:
                message = "Hello " + getName() + ",\nThank you for your time\nHere is your score: " + score + "/100\nYou can certainly do better";
                break;
            case 25:
                message = "Hello " + getName() + ",\nYou did well! \nHere is your score: " + score + "/100\nbut you can do better";
                break;
            case 50:
                message = "Hello " + getName() + ",\nWow! You are half way there\nHere is your score: " + score + "/100\nPut a little more effort";
                break;
            case 75:
                message = "Hello " + getName() + ",\nRockstar! \nHere is your score: " + score + "/100\nYou missed just one answer";
                break;
            case 100:
                message = "Hello " + getName() + ",\nCongratulation!\nHere is your score: " + score + "/100\nYou are a genius ";
                break;

        }


        if (printResult && emailMe) {

            if (getName().isEmpty()) {
                Toast.makeText(this, "Enter your name", Toast.LENGTH_LONG).show();
            } else {
                displayResult(message);
                final String finalMessage = message;

                //this will send the scores to an email address after 4 seconds just like javascript setInterval()
                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                Intent intent = new Intent(Intent.ACTION_SENDTO);
                                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                                intent.putExtra(Intent.EXTRA_SUBJECT, "Result for " + getName());
                                intent.putExtra(Intent.EXTRA_TEXT, finalMessage);
                                if (intent.resolveActivity(getPackageManager()) != null) {
                                    startActivity(intent);
                                }
                            }
                        },
                        4000);


            }

        } else if (printResult && emailMe == false) {
            if (getName().isEmpty()) {
                Toast.makeText(this, "Enter your name", Toast.LENGTH_LONG).show();
            } else {
                displayResult(message);

            }
        } else if (emailMe && printResult == false) {
            if (getName().isEmpty()) {
                Toast.makeText(this, "Enter your name", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: ")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT, "Result for " + getName());
                intent.putExtra(Intent.EXTRA_TEXT, message);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


            }

        } else {
            Toast.makeText(this, "Choose an Option", Toast.LENGTH_SHORT).show();
        }

        score = 0;

    }

    private String getAnswer_Q1() {
        RadioGroup q = (RadioGroup) findViewById(R.id.Q1);
        int selected = q.getCheckedRadioButtonId();
        RadioButton b = (RadioButton) findViewById(selected);
        return b.getText().toString();

    }

    private String getAnswer_Q2() {
        RadioGroup q = (RadioGroup) findViewById(R.id.Q2);
        int selected = q.getCheckedRadioButtonId();
        RadioButton b = (RadioButton) findViewById(selected);
        return b.getText().toString();
    }

    private String getAnswer_Q3() {
        RadioGroup q = (RadioGroup) findViewById(R.id.Q3);
        int selected = q.getCheckedRadioButtonId();
        RadioButton b = (RadioButton) findViewById(selected);
        return b.getText().toString();
    }

    private String getAnswer_Q4() {
        RadioGroup q = (RadioGroup) findViewById(R.id.Q4);
        int selected = q.getCheckedRadioButtonId();
        RadioButton b = (RadioButton) findViewById(selected);
        return b.getText().toString();
    }

    private void displayResult(String result) {
        TextView getResult = (TextView) findViewById(R.id.result);
        getResult.setText(result);
    }

    private String getName() {
        EditText getName = (EditText) findViewById(R.id.fullName);
        return getName.getText().toString();

    }

}
