package com.example.hotelbookingapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class adapterTopDestination extends RecyclerView.Adapter<adapterTopDestination.myViewHolder>
{
    ArrayList<modelTopDestination> dataList;

    public adapterTopDestination(ArrayList<modelTopDestination> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_item_top_destination,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.CityName.setText(dataList.get(position).getCityName());
        Picasso.get().load(dataList.get(position).getCityPhoto()).into(holder.CityPhoto);

    }





    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView CityPhoto ;
        TextView  CityName ;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            CityName = itemView.findViewById(R.id.cityName);
            CityPhoto = itemView.findViewById(R.id.cityPhoto);
        }
    }
}

