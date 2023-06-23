package com.example.myappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ColourThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_three);
    }
    public void ReturnPickAColour (View view) {
        Intent returnIntent3 = new Intent(this,PickAOption.class);
        startActivity(returnIntent3);
    }
}