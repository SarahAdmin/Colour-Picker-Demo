package com.example.myappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ColourOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_one);
    }

    public void ReturnPickAColour(View view) {
        Intent pickIntent1 = new Intent(this, PickAOption.class);
        startActivity(pickIntent1);

    }
}