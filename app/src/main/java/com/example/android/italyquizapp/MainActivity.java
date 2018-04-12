package com.example.android.italyquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void checkAnswers(View view) {
        score = 0;
        checkAnswerOne(view);
        checkAnswerTwo(view);
        checkAnswerThree(view);
        checkAnswerFour(view);
        checkAnswerFive(view);

        Toast.makeText(getApplicationContext(), "You have " + score + " of 5 questions correct.",
                Toast.LENGTH_SHORT).show();
    }

    public void checkAnswerOne(View view) {
        EditText question01EditView = (EditText) findViewById(R.id.q01_text_input);
        String question01Input = question01EditView.getText().toString();

        if (question01Input.equalsIgnoreCase("Grazie")) {
            score++;
        }
    }

    public void checkAnswerTwo(View view) {
        RadioButton question02input = (RadioButton) findViewById(R.id.radio_button_q02_a02);
        boolean answer = question02input.isChecked();

        if (answer) {
            score++;
        }

    }

    public void checkAnswerThree(View view) {
        RadioButton question03input = (RadioButton) findViewById(R.id.radio_button_q03_a01);
        boolean answer = question03input.isChecked();

        if (answer) {
            score++;
        }
    }

    public void checkAnswerFour(View view) {
        RadioButton question04input = (RadioButton) findViewById(R.id.radio_button_q04_a03);
        boolean answer = question04input.isChecked();

        if (answer) {
            score++;
        }
    }

    public void checkAnswerFive(View view) {
        CheckBox question05_answer01 = (CheckBox) findViewById(R.id.q05_checkbox_01);
        CheckBox question05_answer02 = (CheckBox) findViewById(R.id.q05_checkbox_02);
        CheckBox question05_answer03 = (CheckBox) findViewById(R.id.q05_checkbox_03);
        CheckBox question05_answer04 = (CheckBox) findViewById(R.id.q05_checkbox_04);

        if (question05_answer01.isChecked() && question05_answer02.isChecked() && question05_answer03.isChecked() && question05_answer04.isChecked()) {
            score++;
        }
    }
}
