package com.example.activity_two_fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView titleView;
    TextView descView;
    Task mTask;

    public MyViewHolder(@NonNull View itemView) {

        super(itemView);
        titleView = itemView.findViewById(R.id.holderTitle);
        descView = itemView.findViewById(R.id.holderDesc);

    }

    public void onBind(Task task){
        this.mTask = task;
        titleView.setText(task.title);
        descView.setText(task.description);
//        Log.e("ololo", "Task" + task.title);



    }
}
