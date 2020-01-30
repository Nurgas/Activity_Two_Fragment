package com.example.activity_two_fragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView titleView;

    public MyViewHolder(@NonNull View itemView) {

        super(itemView);
        titleView = itemView.findViewById(R.id.holderTitle);

    }

    public void onBind(String s){
        titleView.setText(s);



    }
}
