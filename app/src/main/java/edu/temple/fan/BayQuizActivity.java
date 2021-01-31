package edu.temple.fan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import java.io.Serializable;

public class BayQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bay_quiz);
    }

    public void startEvaluation(View view) {
        String[] answers = evaluateGui();
        int result = evaluateQuiz(answers);
        toastResult(result);
    }

    public String[] evaluateGui() {
        String[] ret = new String[5];
        EditText editTextQuestion1 = findViewById(R.id.question_1);
        CheckBox checkBoxQuestion2_3 = findViewById(R.id.question_2_Option_3);
        CheckBox checkBoxQuestion2_2 = findViewById(R.id.question_2_option_2);
        CheckBox checkBoxQuestion2_1 = findViewById(R.id.question_2_option_1);

        Boolean answerQuestion2 = false;

        if (checkBoxQuestion2_3.isChecked() == true && checkBoxQuestion2_2.isChecked() == false && checkBoxQuestion2_1.isChecked() == true) {
            answerQuestion2 = true;
        }
        CheckBox checkBoxQuestion4_3 = findViewById(R.id.question_4_option_3);
        CheckBox checkBoxQuestion4_2 = findViewById(R.id.question_2_option_2);
        CheckBox checkBoxQuestion4_1 = findViewById(R.id.question_4_option_1);

        Boolean answerQuestion4 = false;
        Boolean option3 = checkBoxQuestion4_3.isChecked();
        Boolean option2 = checkBoxQuestion4_2.isChecked();
        Boolean option1 = checkBoxQuestion4_1.isChecked();


        if (option3 == false && option2 == false && option1 == true) {
            answerQuestion4 = true;
        }

        ret[0] = editTextQuestion1.getText().toString().toLowerCase();
        ret[1] = Boolean.toString(answerQuestion2);
        ret[2] = evaluateRadioGroup(R.id.radio_group_question_3).toLowerCase();
        ret[3] = Boolean.toString(answerQuestion4);
        ret[4] = evaluateRadioGroup(R.id.radio_group_question_5).toLowerCase();

        return ret;
    }

    public int evaluateQuiz(String[] answers) {
        int result = 0;
        String[] correctAnswers = {"Mahomes", "true", "Shrek", "true", };
        for (int i = 0; i < correctAnswers.length; i++) {
            if (answers[i].equals(correctAnswers[i])) {
                result++;
            }
        }

        return result;
    }

    public void toastResult(int result) {
        String message = result + " out of 5. ";

        if (result == 0) {
            message += "Poor luck.";
        } else if (result == 1) {
            message += "You could do better.";
        } else if (result == 2) {
            message += "Quite nice.";
        } else if (result == 3) {
            message += "Really nice.";
        } else if (result == 4) {
            message += "Great!";
        } else if (result == 5) {
            message += "Absolutely awesome!";
        }

        Toast reportResult = Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT);
        reportResult.show();
    }

    private String evaluateRadioGroup(int id) {
        RadioGroup radioGroupQuestion;
        RadioButton radioButtonQuestion;

        radioGroupQuestion = findViewById(id);

        int radioButtonId = radioGroupQuestion.getCheckedRadioButtonId();
        radioButtonQuestion = findViewById(radioButtonId);

        if (radioButtonQuestion == null) {
            return "";
        }

        return (String)radioButtonQuestion.getText();
    }

    public void reset(View view) {
        EditText editText = findViewById(R.id.question_1);
        editText.setText("");

        CheckBox checkBox = findViewById(R.id.question_2_Option_3);
        checkBox.setChecked(false);

        checkBox = findViewById(R.id.question_2_option_2);
        checkBox.setChecked(false);

        checkBox = findViewById(R.id.question_2_option_1);
        checkBox.setChecked(false);

        RadioGroup radioGroup = findViewById(R.id.radio_group_question_3);
        radioGroup.clearCheck();

        checkBox = findViewById(R.id.question_4_option_3);
        checkBox.setChecked(false);

        checkBox = findViewById(R.id.question_4_option_2);
        checkBox.setChecked(false);

        checkBox = findViewById(R.id.question_4_option_1);
        checkBox.setChecked(false);

        radioGroup = findViewById(R.id.radio_group_question_5);
        radioGroup.clearCheck();
    }
}



