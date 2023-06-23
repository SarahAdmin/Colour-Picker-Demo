package com.example.myappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ColourFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_four);
    }
    public void ReturnPickAColour (View view) {
        Intent returnIntent4 = new Intent(this,PickAOption.class);
        startActivity(returnIntent4);
    }
}