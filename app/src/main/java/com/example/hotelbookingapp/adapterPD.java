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

public class adapterPD extends RecyclerView.Adapter<adapterPD.myViewHolder>
{
    ArrayList<model_pd> dataList;

    public adapterPD(ArrayList<model_pd> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_item_pd,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.cityCountryPD.setText(dataList.get(position).getCityCountryPD());
        holder.numbHotelPD.setText(dataList.get(position).getNumbHotelsPD());


        holder.imagePD.setImageResource(dataList.get(position).getImagePD());






    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imagePD ;
        TextView  cityCountryPD, numbHotelPD ;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            imagePD= itemView.findViewById(R.id.imagePD);
            cityCountryPD=itemView.findViewById(R.id.cityContryTVPD);
            numbHotelPD=itemView.findViewById(R.id.numbHotelsPD);

        }
    }
}
