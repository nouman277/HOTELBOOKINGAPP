package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ThirdScreen extends AppCompatActivity {

    RecyclerView RVPD, RVRS;
    ArrayList<model_pd> dataListPD;
    ArrayList<model_rs> dataListRS;
    adapterRS adapterRSV;
    adapterPD adapterPDV;
    ImageView backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdScreen.this, SecondScreen.class);
                startActivity(i);
            }
        });


        dataListRS=new ArrayList<>();
        dataListRS.add(new model_rs(R.drawable.ic_language_24px,"Islamabad, Pakistan","227 Hotels"));
        dataListRS.add(new model_rs(R.drawable.ic_language_24px,"Karachi, Pakistan","350 Hotels"));
        dataListRS.add(new model_rs(R.drawable.home,"Karachi Hyatt Hotel","9.6/10"));

        RVRS = findViewById(R.id.recyclerViewRS);
        RVRS = (RecyclerView) findViewById(R.id.recyclerViewRS);
        RVRS.setLayoutManager(new LinearLayoutManager(this));

        adapterRSV = new adapterRS(dataListRS);
        RVRS.setAdapter(adapterRSV);
        adapterRSV.notifyDataSetChanged();



        dataListPD=new ArrayList<>();
        dataListPD.add(new model_pd(R.drawable.star__1_,"Islamabad, Pakistan","227 Hotels"));
        dataListPD.add(new model_pd(R.drawable.star__1_,"Karachi, Pakistan","350 Hotels"));
        dataListPD.add(new model_pd(R.drawable.star__1_,"Swat, Pakistan","70 Hotels"));

        RVPD = findViewById(R.id.recyclerViewPD);
        RVPD = (RecyclerView) findViewById(R.id.recyclerViewPD);
        RVPD.setLayoutManager(new LinearLayoutManager(this));

        adapterPDV = new adapterPD(dataListPD);
        RVPD.setAdapter(adapterPDV);
        adapterRSV.notifyDataSetChanged();

    }
}