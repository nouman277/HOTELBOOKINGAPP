package com.example.hotelbookingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class adapterRS extends RecyclerView.Adapter<adapterRS.myViewHolder>
{
    ArrayList<model_rs> dataList;

    public adapterRS(ArrayList<model_rs> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_item_rs,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.cityCountryRS.setText(dataList.get(position).getCityCountryRS());
        holder.numbHotelRS.setText(dataList.get(position).getNumbHotelsRS());
        holder.imageRS.setImageResource(dataList.get(position).getImageRS());






    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageRS ;
        TextView  cityCountryRS, numbHotelRS ;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            imageRS= itemView.findViewById(R.id.imageViewRS);
            cityCountryRS=itemView.findViewById(R.id.cityContryTVRS);
            numbHotelRS=itemView.findViewById(R.id.numbHotelsRS);

        }
    }
}
