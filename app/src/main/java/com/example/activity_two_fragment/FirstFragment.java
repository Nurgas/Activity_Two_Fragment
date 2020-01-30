package com.example.activity_two_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {

    Button addButton;
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

    public void addTask(String text) {
        mMyAdapter.addTask(text);

    }

}
