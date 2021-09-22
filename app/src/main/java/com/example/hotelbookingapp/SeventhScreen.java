package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class SeventhScreen extends AppCompatActivity {

    RecyclerView RVIH2;
    ArrayList<model_IH> dataListIH2;
    adapterIH adapterIHV2;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_screen);


        backbtn = findViewById(R.id.backbtnIH2);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SeventhScreen.this, SecondScreen.class);
                startActivity(i);
            }
        });

        dataListIH2 = new ArrayList<>();
        dataListIH2.add(new model_IH(R.drawable.placeholder_grand_hotel , "Centara Grand Hotel","",".Rooms Available"));
        dataListIH2.add(new model_IH(R.drawable.placeholder_mirag_hotel, "Centara Mirage Hotel",".Rooms Unavailable",""));


        RVIH2 = findViewById(R.id.RVIH2);
        RVIH2 = (RecyclerView) findViewById(R.id.RVIH2);
        RVIH2.setLayoutManager(new LinearLayoutManager(this));

        adapterIHV2= new adapterIH(dataListIH2);
        RVIH2.setAdapter(adapterIHV2);
        adapterIHV2.notifyDataSetChanged();
    }
}