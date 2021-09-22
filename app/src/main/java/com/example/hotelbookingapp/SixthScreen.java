package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class SixthScreen extends AppCompatActivity {

    RecyclerView RVIH;
    ArrayList<model_IH> dataListIH;
    adapterIH adapterIHV;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_screen);

        backbtn = findViewById(R.id.backbtnIH);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SixthScreen.this, SecondScreen.class);
                startActivity(i);
            }
        });

        dataListIH = new ArrayList<>();
        dataListIH.add(new model_IH(R.drawable.placeholder_grand_hotel , "Centara Grand Hotel","",".Rooms Available"));
        dataListIH.add(new model_IH(R.drawable.placeholder_mirag_hotel, "Centara Mirage Hotel",".Rooms Unavailable",""));

        RVIH = findViewById(R.id.RVislamabadHotel);
        RVIH = (RecyclerView) findViewById(R.id.RVislamabadHotel);
        RVIH.setLayoutManager(new LinearLayoutManager(this));

        adapterIHV= new adapterIH(dataListIH);
        RVIH.setAdapter(adapterIHV);
        adapterIHV.notifyDataSetChanged();



    }
}