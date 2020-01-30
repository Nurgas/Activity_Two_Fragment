package com.example.activity_two_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SecondFragment extends Fragment {
    SecondFragmentListener listener;
    EditText editTitle;
    EditText editDesc;

    Button saveBtn;


    public static SecondFragment create(SecondFragmentListener listener){
        SecondFragment secondFragment = new SecondFragment();
        secondFragment.listener = listener;
        return secondFragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);
        editTitle = view.findViewById(R.id.editTitle);
        editDesc = view.findViewById(R.id.editDesc);
        saveBtn = view.findViewById(R.id.save);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textTitle = editTitle.getText().toString();
                String textDesc = editDesc.getText().toString();
                Task task = new Task(textTitle, textDesc);
                listener.openFirstFragment(task);
            }
        });
        return view;
    }

}
