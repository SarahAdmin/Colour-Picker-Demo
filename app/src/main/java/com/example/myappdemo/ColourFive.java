package com.example.myappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ColourFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_five);
    }

    public void ReturnPickAColour (View view) {
        Intent returnIntent5 = new Intent(this,PickAOption.class);
        startActivity(returnIntent5);
    }
}