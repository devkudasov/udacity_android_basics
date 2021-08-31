package com.kudasov.dev.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pointA = 0;
    private int pointAPlayer1 = 0;
    private int pointAPlayer2 = 0;
    private int pointAPlayer3 = 0;
    private int pointAPlayer4 = 0;
    private int pointAPlayer5 = 0;

    private int pointB = 0;
    private int pointBPlayer1 = 0;
    private int pointBPlayer2 = 0;
    private int pointBPlayer3 = 0;
    private int pointBPlayer4 = 0;
    private int pointBPlayer5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setThreePointAPlayer1(View view) {
        pointAPlayer1 +=3;
        pointA += 3;
        displayAPlayer1();
    }

    public void setTwoPointAPlayer1(View view) {
        pointAPlayer1 +=2;
        pointA += 2;
        displayAPlayer1();
    }

    public void setOnePointAPlayer1(View view) {
        pointAPlayer1++;
        pointA++;
        displayAPlayer1();
    }

    private void displayAPlayer1() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_player_1);
        teamAScore.setText(getString(R.string.score_count, pointAPlayer1));
        displayA();
    }

    public void setThreePointAPlayer2(View view) {
        pointAPlayer2 +=3;
        pointA += 3;
        displayAPlayer2();
    }

    public void setTwoPointAPlayer2(View view) {
        pointAPlayer2 +=2;
        pointA += 2;
        displayAPlayer2();
    }

    public void setOnePointAPlayer2(View view) {
        pointAPlayer2++;
        pointA++;
        displayAPlayer2();
    }

    private void displayAPlayer2() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_player_2);
        teamAScore.setText(getString(R.string.score_count, pointAPlayer2));
        displayA();
    }

    public void setThreePointAPlayer3(View view) {
        pointAPlayer3 +=3;
        pointA += 3;
        displayAPlayer3();
    }

    public void setTwoPointAPlayer3(View view) {
        pointAPlayer3 +=2;
        pointA += 2;
        displayAPlayer3();
    }

    public void setOnePointAPlayer3(View view) {
        pointAPlayer3++;
        pointA++;
        displayAPlayer3();
    }

    private void displayAPlayer3() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_player_3);
        teamAScore.setText(getString(R.string.score_count, pointAPlayer3));
        displayA();
    }

    public void setThreePointAPlayer4(View view) {
        pointAPlayer4 +=3;
        pointA += 3;
        displayAPlayer4();
    }

    public void setTwoPointAPlayer4(View view) {
        pointAPlayer4 +=2;
        pointA += 2;
        displayAPlayer4();
    }

    public void setOnePointAPlayer4(View view) {
        pointAPlayer4++;
        pointA++;
        displayAPlayer4();
    }

    private void displayAPlayer4() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_player_4);
        teamAScore.setText(getString(R.string.score_count, pointAPlayer4));
        displayA();
    }

    public void setThreePointAPlayer5(View view) {
        pointAPlayer5 +=3;
        pointA += 3;
        displayAPlayer5();
    }

    public void setTwoPointAPlayer5(View view) {
        pointAPlayer5 +=2;
        pointA += 2;
        displayAPlayer5();
    }

    public void setOnePointAPlayer5(View view) {
        pointAPlayer5++;
        pointA++;
        displayAPlayer5();
    }

    private void displayAPlayer5() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_player_5);
        teamAScore.setText(getString(R.string.score_count, pointAPlayer5));
        displayA();
    }

    private void displayA() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(getString(R.string.score_count, pointA));
    }

    public void setThreePointBPlayer1(View view) {
        pointBPlayer1 +=3;
        pointB += 3;
        displayBPlayer1();
    }

    public void setTwoPointBPlayer1(View view) {
        pointBPlayer1 +=2;
        pointB += 2;
        displayBPlayer1();
    }

    public void setOnePointBPlayer1(View view) {
        pointBPlayer1++;
        pointB++;
        displayBPlayer1();
    }

    private void displayBPlayer1() {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_player_1);
        teamAScore.setText(getString(R.string.score_count, pointBPlayer1));
        displayB();
    }

    public void setThreePointBPlayer2(View view) {
        pointBPlayer2 +=3;
        pointB += 3;
        displayBPlayer2();
    }

    public void setTwoPointBPlayer2(View view) {
        pointBPlayer2 +=2;
        pointB += 2;
        displayBPlayer2();
    }

    public void setOnePointBPlayer2(View view) {
        pointBPlayer2++;
        pointB++;
        displayBPlayer2();
    }

    private void displayBPlayer2() {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_player_2);
        teamAScore.setText(getString(R.string.score_count, pointBPlayer2));
        displayB();
    }

    public void setThreePointBPlayer3(View view) {
        pointBPlayer3 +=3;
        pointB += 3;
        displayBPlayer3();
    }

    public void setTwoPointBPlayer3(View view) {
        pointBPlayer3 +=2;
        pointB += 2;
        displayBPlayer3();
    }

    public void setOnePointBPlayer3(View view) {
        pointBPlayer3++;
        pointB++;
        displayBPlayer3();
    }

    private void displayBPlayer3() {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_player_3);
        teamAScore.setText(getString(R.string.score_count, pointBPlayer3));
        displayB();
    }

    public void setThreePointBPlayer4(View view) {
        pointBPlayer4 +=3;
        pointB += 3;
        displayBPlayer4();
    }

    public void setTwoPointBPlayer4(View view) {
        pointBPlayer4 +=2;
        pointB += 2;
        displayBPlayer4();
    }

    public void setOnePointBPlayer4(View view) {
        pointBPlayer4++;
        pointB++;
        displayBPlayer4();
    }

    private void displayBPlayer4() {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_player_4);
        teamAScore.setText(getString(R.string.score_count, pointBPlayer4));
        displayB();
    }

    public void setThreePointBPlayer5(View view) {
        pointBPlayer5 +=3;
        pointB += 3;
        displayBPlayer5();
    }

    public void setTwoPointBPlayer5(View view) {
        pointBPlayer5 +=2;
        pointB += 2;
        displayBPlayer5();
    }

    public void setOnePointBPlayer5(View view) {
        pointBPlayer5++;
        pointB++;
        displayBPlayer5();
    }

    private void displayBPlayer5() {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_player_5);
        teamAScore.setText(getString(R.string.score_count, pointBPlayer5));
        displayB();
    }

    private void displayB() {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_score);
        teamAScore.setText(getString(R.string.score_count, pointB));
    }

    public void reset(View view) {
        pointA = 0;
        pointAPlayer1 = 0;
        pointAPlayer2 = 0;
        pointAPlayer3 = 0;
        pointAPlayer4 = 0;
        pointAPlayer5 = 0;

        pointB = 0;
        pointBPlayer1 = 0;
        pointBPlayer2 = 0;
        pointBPlayer3 = 0;
        pointBPlayer4 = 0;
        pointBPlayer5 = 0;

        displayAll();
    }

    private void displayAll() {
        displayAPlayer1();
        displayAPlayer2();
        displayAPlayer3();
        displayAPlayer4();
        displayAPlayer5();
        displayA();

        displayBPlayer1();
        displayBPlayer2();
        displayBPlayer3();
        displayBPlayer4();
        displayBPlayer5();
        displayB();
    }
}