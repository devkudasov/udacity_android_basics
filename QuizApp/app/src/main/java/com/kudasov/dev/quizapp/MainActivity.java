package com.kudasov.dev.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int TOTAL_QUESTION_NUM = 6;
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

        setAnswerSection();
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

    /**
     * Show question section depends on {currentQuestionNumber}
     */
    private void setAnswerSection() {
        setAnswerVisibility(findViewById(R.id.answer1), currentQuestionNumber == 1);
        setAnswerVisibility(findViewById(R.id.answer2), currentQuestionNumber == 2);
        setAnswerVisibility(findViewById(R.id.answer3), currentQuestionNumber == 3);
        setAnswerVisibility(findViewById(R.id.answer4), currentQuestionNumber == 4);
        setAnswerVisibility(findViewById(R.id.answer5), currentQuestionNumber == 5);
        setAnswerVisibility(findViewById(R.id.answer6), currentQuestionNumber == 6);
    }

    /**
     * Show view if isVisible = true and hide if false
     *
     * @param view
     * @param isVisible
     */
    private void setAnswerVisibility(View view, boolean isVisible) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = isVisible ? ViewGroup.LayoutParams.WRAP_CONTENT : 0;
        view.setLayoutParams(params);
        view.setVisibility(isVisible ? View.VISIBLE : View.INVISIBLE);
    }

    /**
     * Next button handler
     *
     * @param view
     */
    public void setNextQuestion(View view) {
        Button prevButton = findViewById(R.id.prev_button);

        if (currentQuestionNumber != TOTAL_QUESTION_NUM) {
            currentQuestionNumber++;
            setQuestion();

            if (currentQuestionNumber == TOTAL_QUESTION_NUM) {
                ((Button) view).setText(getString(R.string.show_results));
            }

            enableButton(prevButton);
        } else {
            showResult();
        }
    }

    /**
     * Previous button handler
     *
     * @param view
     */
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

    /**
     * Show toast with result in format correct/total
     */
    private void showResult() {
        Context context = getApplicationContext();
        CharSequence text = "Your score: " + getResult() + "/" + TOTAL_QUESTION_NUM;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * Calculate correct answers
     * @return
     */
    private int getResult() {
        int result = 0;

        if (((RadioButton) findViewById(R.id.answer1_variant3)).isChecked()) {
            result++;
        }
        String answer2 = ((EditText) findViewById(R.id.answer2)).getText().toString();
        if ("James Joseph Parsons".equals(answer2)) {
            result++;
        }
        String answer3 = ((EditText) findViewById(R.id.answer3)).getText().toString();
        if ("Kunal Nayyar".equals(answer3)) {
            result++;
        }
        String answer4 = ((EditText) findViewById(R.id.answer4)).getText().toString();
        if ("Simon Maxwell Helberg".equals(answer4)) {
            result++;
        }
        String answer5 = ((EditText) findViewById(R.id.answer5)).getText().toString();
        if ("Johnny Galecki".equals(answer5)) {
            result++;
        }
        Boolean answer6_1 = ((CheckBox) findViewById(R.id.answer6_variant1)).isChecked();
        Boolean answer6_2 = ((CheckBox) findViewById(R.id.answer6_variant2)).isChecked();
        Boolean answer6_3 = ((CheckBox) findViewById(R.id.answer6_variant3)).isChecked();
        Boolean answer6_4 = ((CheckBox) findViewById(R.id.answer6_variant4)).isChecked();
        if (answer6_1 && answer6_2 && answer6_3 && answer6_4) {
            result++;
        }

        return result;
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