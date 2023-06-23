package com.example.myappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ColourTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_two);
    }
    public void ReturnPickAColour (View view) {
        Intent returnIntent2 = new Intent(this,PickAOption.class);
        startActivity(returnIntent2);
    }
}