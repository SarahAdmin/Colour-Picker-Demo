package com.example.myappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class PickAOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_aoption);
    }

    public void ChosenOne(View view) {
      Intent colourIntent1 = new Intent(this, ColourOne.class);
      startActivity(colourIntent1);
    }
    public void ChosenTwo(View view) {
        Intent colourIntent2 = new Intent(this, ColourTwo.class);
        startActivity(colourIntent2);
    }
    public void ChosenThree(View view) {
        Intent colourIntent3 = new Intent(this, ColourThree.class);
        startActivity(colourIntent3);
    }
    public void ChosenFour(View view) {
        Intent colourIntent4 = new Intent(this, ColourFour.class);
        startActivity(colourIntent4);
    }
    public void ChosenFive(View view) {
        Intent colourIntent5 = new Intent(this, ColourFive.class);
        startActivity(colourIntent5);
    }
    public void ChosenSix(View view) {
        Intent colourIntent6 = new Intent(this, ColourSix.class);
        startActivity(colourIntent6);
    }
    public void HomePage(View view) {
        Intent MainIntent = new Intent(this, MainActivity.class);
        startActivity(MainIntent);
    }

}