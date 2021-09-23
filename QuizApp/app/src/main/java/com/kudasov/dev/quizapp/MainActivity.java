package com.kudasov.dev.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int currentQuestionNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setQuestion();
    }

    private void setQuestion() {
        TextView questionTitle = findViewById(R.id.question_title);
        TextView questionText = findViewById(R.id.question_text);

        questionTitle.setText(getString(R.string.question_title, currentQuestionNumber));
        questionText.setText(getQuestionString());
    }

    /**
     * Return question depends on {currentQuestionNumber}
     */
    private String getQuestionString() {
        switch (currentQuestionNumber) {
            case 1:
                return getString(R.string.question1_text);
            case 2:
                return getString(R.string.question2_text);
            case 3:
                return getString(R.string.question3_text);
            case 4:
                return getString(R.string.question4_text);
            case 5:
                return getString(R.string.question5_text);
            case 6:
                return getString(R.string.question6_text);
            default:
                return "";
        }
    }

    public void setNextQuestion(View view) {
        Button prevButton = findViewById(R.id.prev_button);
        int TOTAL_QUESTION_NUM = 6;

        if (currentQuestionNumber != TOTAL_QUESTION_NUM) {
            currentQuestionNumber++;
            setQuestion();

            if (currentQuestionNumber == TOTAL_QUESTION_NUM) {
                ((Button) view).setText(getString(R.string.show_results));
            }

            enableButton(prevButton);
        } else {
            // TODO Show toast
        }
    }

    public void setPrevQuestion(View view) {
        Button nextButton = findViewById(R.id.next_button);

        if (currentQuestionNumber != 1) {
            currentQuestionNumber--;
            setQuestion();

            if (currentQuestionNumber == 1) {
                disableButton((Button) view);
            }

            nextButton.setText(getString(R.string.next_question));
        }
    }

    private void disableButton(Button button) {
        if (button.isEnabled()) {
            button.setEnabled(false);
        }
    }

    private void enableButton(Button button) {
        if (!button.isEnabled()) {
            button.setEnabled(true);
        }
    }
}