package com.example.android.soccerscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState != null){
            foulA = savedInstanceState.getInt("foulA");
        }
        displayFoulA(foulA);
    }

    int scoreTeamB, scoreTeamA, yellowCardA, yellowCardB, redCardA, redCardB, foulA, foulB;



    public void increment(View view){

        switch (view.getId()){
            case R.id.goal_A:
                scoreTeamA++;
                displayScoreA(scoreTeamA);
                break;
            case R.id.goal_B:
                scoreTeamB++;
                displayScoreB(scoreTeamB);
                break;
            case R.id.foul_A:
                foulA++;
                displayFoulA(foulA);
                break;
            case R.id.foul_B:
                foulB++;
                displayFoulB(foulB);
                break;
            case R.id.yellow_card_A:
                yellowCardA++;
                displayYellowCardA(yellowCardA);
                break;
            case R.id.yellow_card_B:
                yellowCardB++;
                displayYellowCardB(yellowCardB);
                break;
            case R.id.red_card_A:
                redCardA++;
                displayRedCardA(redCardA);
                break;
            case R.id.red_card_B:
                redCardB++;
                displayRedCardB(redCardB);
                break;
            case R.id.reset:
                scoreTeamA = 0;
                scoreTeamB = 0;
                foulA = 0;
                foulB = 0;
                yellowCardA = 0;
                yellowCardB = 0;
                redCardA = 0;
                redCardB = 0;
                displayScoreA(scoreTeamA);
                displayScoreB(scoreTeamB);
                displayFoulA(foulA);
                displayFoulB(foulB);
                displayYellowCardA(yellowCardA);
                displayYellowCardB(yellowCardB);
                displayRedCardA(redCardA);
                displayRedCardB(redCardB);
                break;
            default:
                displayScoreA(scoreTeamA);
                displayScoreB(scoreTeamB);
                displayFoulA(foulA);
                displayFoulB(foulB);
                displayYellowCardA(yellowCardA);
                displayYellowCardB(yellowCardB);
                displayRedCardA(redCardA);
                displayRedCardB(redCardB);
                break;



        }
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul count for Team B.
     */

    public void displayFoulA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.foul_team_a);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul count for Team B.
     */
    public void displayFoulB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.foul_team_b);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given yellow card count for Team B.
     */
    public void displayYellowCardA(int card) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCard_team_a);
        scoreView.setText(String.valueOf(card));
    }

    /**
     * Displays the given yellow card count for Team B.
     */
    public void displayYellowCardB(int card) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCard_team_b);
        scoreView.setText(String.valueOf(card));
    }

    /**
     * Displays the given red card count for Team B.
     */
    public void displayRedCardA(int card) {
        TextView scoreView = (TextView) findViewById(R.id.redCard_team_a);
        scoreView.setText(String.valueOf(card));
    }

    /**
     * Displays the given yellow card count for Team B.
     */
    public void displayRedCardB(int card) {
        TextView scoreView = (TextView) findViewById(R.id.redCard_team_b);
        scoreView.setText(String.valueOf(card));
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
//        savedInstanceState.putInt(displayFoulA(foulA), "a");
        savedInstanceState.putInt("foulA", foulA);

    }
}
