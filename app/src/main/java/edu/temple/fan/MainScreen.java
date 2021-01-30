package edu.temple.fan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

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
                Intent quizActivityIntent = new Intent(MainScreen.this,ChiefsQuizActivity.class);
                startActivity(quizActivityIntent);
            }
        });
        bay.setOnClickListener(new AdapterView.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent quizActivityIntent = new Intent(MainScreen.this,BayQuizActivity.class);
                startActivity(quizActivityIntent);
            }
        });











    }
}