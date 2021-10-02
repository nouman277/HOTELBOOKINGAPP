package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NinthScreen extends AppCompatActivity {

    CardView apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_screen);

        apply = findViewById(R.id.applyTV);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NinthScreen.this, ThirteenScreen.class);
                startActivity(i);
            }
        });
    }
}