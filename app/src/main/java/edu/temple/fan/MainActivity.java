package edu.temple.fan;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button chiefs;
    Button bay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chiefs = findViewById(R.id.chiefs);
        bay = findViewById(R.id.bay);

        chiefs.setOnClickListener(new AdapterView.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent quizActivityIntent = new Intent(MainActivity.this, ChiefQuizActivity.class);
                startActivity(quizActivityIntent);
            }
        });
        bay.setOnClickListener(new AdapterView.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent quizActivityIntent = new Intent(MainActivity.this, BayQuizActivity.class);
                startActivity(quizActivityIntent);
            }
        });


    }
}