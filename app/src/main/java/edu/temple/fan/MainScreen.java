package edu.temple.fan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    Spinner spinner;

    @Override//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.selectEvent);

        final String[] events = {"Choose an event", "Sports", "Concerts", "Private Event"};

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