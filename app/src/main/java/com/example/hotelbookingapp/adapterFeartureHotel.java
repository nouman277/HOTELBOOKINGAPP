package com.example.hotelbookingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class adapterFeartureHotel extends RecyclerView.Adapter<adapterFeartureHotel.myViewHolder>
{
    ArrayList<modelFeaturedHotel> dataList;

    public adapterFeartureHotel(ArrayList<modelFeaturedHotel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_item_featured_hotel,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.CityName.setText(dataList.get(position).getCityName());
        Picasso.get().load(dataList.get(position).getHotelImage()).into(holder.HotelImage);
        holder.HotelName.setText(dataList.get(position).getHotelName());
        holder.HotelRating.setText(dataList.get(position).getHotelRating());
        holder.PeopleRecommend.setText(dataList.get(position).getPeopleRecommend());
        holder.PricePerNight.setText(dataList.get(position).getPricePerNight());







    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView HotelImage ;
        TextView  CityName,HotelName, HotelRating, PeopleRecommend, PricePerNight ;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            CityName = itemView.findViewById(R.id.cityName);
            HotelImage = itemView.findViewById(R.id.featuredHotelImage);
            HotelName =itemView.findViewById(R.id.featuredHotelName);
            HotelRating = itemView.findViewById(R.id.featuredHotelRating);
            PeopleRecommend =itemView.findViewById(R.id.featuredHotelPeopleRecommend);
            PricePerNight =itemView.findViewById(R.id.featuredHotelPricePerNight);
        }
    }
}



