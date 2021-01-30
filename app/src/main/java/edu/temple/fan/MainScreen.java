package edu.temple.fan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.Spinner;

public class MainScreen extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.selectEvent);

        final String[] events = {"Choose a color", "Sports", "Concerts", "Private Event"};

        final BaseAdapter ColorAdapter = new EventAdapter(MainScreen.this, events);



    }
}