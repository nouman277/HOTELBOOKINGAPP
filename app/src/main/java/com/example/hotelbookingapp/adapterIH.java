package com.example.hotelbookingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterIH extends RecyclerView.Adapter<adapterIH.myViewHolder>
{
    ArrayList<model_IH> dataList;

    public adapterIH(ArrayList<model_IH> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_item_islamabad_hotel,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        // holder.numbHotelPD.setText(dataList.get(position).getNumbHotelsPD());
        //
        holder.islamabadHotelName.setText(dataList.get(position).getIslamabadHotelName());
        holder.roomAvaliGreen.setText(dataList.get(position).getRoomAvaliGreen());
        holder.roomUnavialRed.setText(dataList.get(position).getRoomUnavialRed());


        holder.IslamabadHotelImage.setImageResource(dataList.get(position).getIslamabadHotelImage());







    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView Prmimumtag, IslamabadHotelImage, starImage;

        TextView islamabadHotelName, roomUnavialRed,roomAvaliGreen;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            IslamabadHotelImage=itemView.findViewById(R.id.IslamabadHotelImage);
            starImage=itemView.findViewById(R.id.starImage);
            islamabadHotelName=itemView.findViewById(R.id.islamabadHotelName);
            roomUnavialRed=itemView.findViewById(R.id.roomUnavialRed);
            roomAvaliGreen=itemView.findViewById(R.id.roomAvaliGreen);

        }
    }
}

