package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FifthScreen extends AppCompatActivity {

    ImageView backbtn;
    CardView confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_screen);



        backbtn = findViewById(R.id.backbtnFIS);
        confirm = findViewById(R.id.confirmFiS);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FifthScreen.this, SecondScreen.class);
                startActivity(i);
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FifthScreen.this, SixthScreen.class);
                startActivity(i);
            }
        });


    }
}