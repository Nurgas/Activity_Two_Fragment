package com.example.activity_two_fragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements FirstFragmentListener, SecondFragmentListener {

    FragmentManager manager = getSupportFragmentManager();
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = FirstFragment.create(this);
        secondFragment = SecondFragment.create(this);
        changeFragment(R.id.container,firstFragment);
    }


    public void changeFragment(int container, Fragment fragment){
        transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();

    }


    @Override
    public void openSecondFragment() {
        changeFragment(R.id.container,secondFragment);


    }


    @Override
    public void openFirstFragment(Task task) {
        changeFragment(R.id.container,firstFragment);
        firstFragment.addTask(task);

    }

}
