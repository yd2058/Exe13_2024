package com.example.exe13_2024;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int[] flags = {R.drawable.bolivia, R.drawable.congo, R.drawable.kiribati, R.drawable.mongolia, R.drawable.new_zealand,R.drawable.slovakia,R.drawable.spain};
    String[] pops = {"12Mil","96Mil","129K","3Mil","5Mil","5Mil","47Mil"};
    String[] names = {"Bolivia", "Congo", "Kiribati", "Mongolia", "New Zealand", "Slovakia", "Spain"};
    String[] caps = {"Sucre","Kinshasa","Tarawa","Ulaanbaatar","Wellington","Bratislava","Madrid"};
    Spinner spin;
    TextView info;
    Spinadp adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin = findViewById(R.id.countspin);
        info = findViewById(R.id.infotv);
        adp = new Spinadp(this, flags, names, caps);
        spin.setAdapter(adp);
        spin.setOnItemSelectedListener(this);
        info.setText("Country Name:\nCountry Capital:\nCountryPopulation:");

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        info.setText("Country Name: "+names[i]+"\nCountry Capital: "+caps[i]+"\nCountryPopulation: "+pops[i]);
    }

    
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}