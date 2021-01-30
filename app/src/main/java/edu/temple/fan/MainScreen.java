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










        spinner = findViewById(R.id.selectEvent);

        final String[] events = {"Choose an event", "Sports", "Concerts"};

        final BaseAdapter EventAdapter = new EventAdapter(MainScreen.this, events);

        spinner.setAdapter(EventAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView)spinner.getSelectedView()).setBackgroundColor(Color.MAGENTA);

                if(events[position].equals("Red")) {
                    //myLayout.setBackgroundColor(Color.RED);
                }
                else if(events[position].equals("Yellow")) {
                    //myLayout.setBackgroundColor(Color.YELLOW);
                }else if(events[position].equals("Green")) {
                    //myLayout.setBackgroundColor(Color.GREEN);

            }

        }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });


    }
}