package com.example.activity_two_fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;




public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ArrayList<Task> mTask;

    public MyAdapter() {
        mTask = new ArrayList<>();
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_my, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.onBind(mTask.get(position));


    }

    @Override
    public int getItemCount() {
        return mTask.size();
    }
    public void addTask(Task task) {
        mTask.add(task);
        notifyDataSetChanged();

    }
}
