package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class SecondScreen extends AppCompatActivity {

    RecyclerView topDestinationRV, featuredHotelRV;
    ArrayList<modelFeaturedHotel> datalistFH;
    ArrayList<modelTopDestination> dataListTD;
    adapterTopDestination adapterTopDestination;
    adapterFeartureHotel adapterFeartureHotel;
    FirebaseFirestore dbTD,dbFH;
    CardView date,booking,search,sixthscreen ,seven ,Booking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);



        GetDataFromTopDstination();
        GetDataFromFeaturedHotel();



        date =findViewById(R.id.DatesetTV);
        booking = findViewById(R.id.bookingtv);
        search = findViewById(R.id.searchTV);
        sixthscreen =findViewById(R.id.sixthScrren);
        seven = findViewById(R.id.Sevensec);
        Booking =findViewById(R.id.bookingBtn);

        Booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondScreen.this,Screen_NIghteen.class);
                startActivity(i);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondScreen.this,SixthScreen.class);
                startActivity(i);
            }
        });

        sixthscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondScreen.this,SeventhScreen.class);
                startActivity(i);
            }
        });

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondScreen.this,FourthScreen.class);
                startActivity(i);
            }
        });


        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondScreen.this,FifthScreen.class);
                startActivity(i);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondScreen.this,ThirdScreen.class);
                startActivity(i);
            }
        });



    }

    private void GetDataFromTopDstination() {

    }



    private void GetDataFromFeaturedHotel(){



    }
}