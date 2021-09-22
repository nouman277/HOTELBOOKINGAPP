package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FourthScreen extends AppCompatActivity {

    ImageView backbtn;
    CardView confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);


        backbtn = findViewById(R.id.backbtnFS);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthScreen.this, SecondScreen.class);
                startActivity(i);
            }
        });

        confirm = findViewById(R.id.confirmFS);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthScreen.this,FifthScreen.class);
                startActivity(i);
            }
        });

    }


}