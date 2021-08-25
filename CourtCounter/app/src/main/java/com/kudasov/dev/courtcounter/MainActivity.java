package com.kudasov.dev.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pointA = 0;
    private int pointB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setThreePointA(View view) {
        pointA += 3;
        displayA();
    }

    public void setTwoPointA(View view) {
        pointA += 2;
        displayA();
    }

    public void setOnePointA(View view) {
        pointA++;
        displayA();
    }

    private void displayA() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(getString(R.string.score_count, pointA));
    }

    public void setThreePointB(View view) {
        pointB += 3;
        displayB();
    }

    public void setTwoPointB(View view) {
        pointB += 2;
        displayB();
    }

    public void setOnePointB(View view) {
        pointB++;
        displayB();
    }

    private void displayB() {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_score);
        teamAScore.setText(getString(R.string.score_count, pointB));
    }

    public void reset(View view) {
        pointA = 0;
        pointB = 0;
        displayA();
        displayB();
    }
}