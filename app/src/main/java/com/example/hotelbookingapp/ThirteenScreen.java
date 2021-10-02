package com.example.hotelbookingapp;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirteenScreen extends AppCompatActivity {
    CardView dialog, back;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen_screen);
        dialog = findViewById(R.id.dialogTV);
        back = findViewById(R.id.BACKBTN);
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder
                        = new AlertDialog
                        .Builder(ThirteenScreen.this);
                builder.setView(R.layout.amenities_layout);

                builder
                        .setNegativeButton(
                                "Cancel",
                                new DialogInterface
                                        .OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Intent intent = new Intent(ThirteenScreen.this, ThirteenScreen.class);
                                        startActivity(intent);

                                    }
                                });


                AlertDialog alertDialog = builder.create();


                alertDialog.show();


            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirteenScreen.this, SecondScreen.class);
                startActivity(intent);

            }
        });
    }
}