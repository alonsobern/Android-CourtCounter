package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int addpoints(int score, int sum){
        score = score + sum;
        return score;
    }

    public void threepointsA(View view){
        scoreA = addpoints(scoreA, 3);
        displayscoreA(scoreA);
    }

    public void twopointsA(View view){
        scoreA = addpoints(scoreA, 2);
        displayscoreA(scoreA);
    }

    public void freepointA(View view){
        scoreA = addpoints(scoreA, 1);
        displayscoreA(scoreA);
    }

    public void threepointsB(View view){
        scoreB = addpoints(scoreB, 3);
        displayscoreB(scoreB);
    }

    public void twopointsB(View view){
        scoreB = addpoints(scoreB, 2);
        displayscoreB(scoreB);
    }

    public void freepointB(View view){
        scoreB = addpoints(scoreB, 1);
        displayscoreB(scoreB);
    }


    private void displayscoreA(int number){
        TextView result = (TextView) findViewById(R.id.scoreA);
        result.setText(String.valueOf(number)); /* Cast the integer to string */
    }

    private void displayscoreB(int number){
        TextView result = (TextView) findViewById(R.id.scoreB);
        result.setText(String.valueOf(number)); /* Cast the integer to string */
    }

    public void displayreset(View view){
        TextView resetA = (TextView) findViewById(R.id.scoreA);
        TextView resetB = (TextView) findViewById(R.id.scoreB);
        scoreA = 0;
        scoreB = 0;
        resetA.setText("0");
        resetB.setText("0");
    }

}