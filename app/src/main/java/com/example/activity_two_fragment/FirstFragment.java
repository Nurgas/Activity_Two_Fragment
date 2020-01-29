package com.example.activity_two_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    Button addButton;
    TextView tv;
    RecyclerView recyclerView;
    MyAdapter mMyAdapter;
    FirstFragmentListener firstFragmentListener;

    public static FirstFragment create(FirstFragmentListener firstFragmentListener){
        FirstFragment firstFragment = new FirstFragment();
        firstFragment.firstFragmentListener = firstFragmentListener;
        return firstFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_first, container, false);
            recyclerView = view.findViewById(R.id.recyclerView);
            tv = view.findViewById(R.id.first_frag_text);
            addButton = view.findViewById(R.id.addBtn);
            RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(manager);
            mMyAdapter = new MyAdapter();
            recyclerView.setAdapter(mMyAdapter);
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    firstFragmentListener.openSecondFragment();
                }
            });
            return view;
    }
    public void addTask(Task task) {
        mMyAdapter.addTask(task);
        tv.setText(task.title);
        Log.e("ololo", "Task title "+ task.title);
        Log.e("ololo", "Task title "+ tv.getText().toString());
    }

}
