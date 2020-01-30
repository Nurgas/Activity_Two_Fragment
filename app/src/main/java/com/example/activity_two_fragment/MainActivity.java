package com.example.activity_two_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements FirstFragmentListener, SecondFragmentListener {

    Boolean isShowen = true;

    FragmentManager manager = getSupportFragmentManager();
    FirstFragment firstFragment = FirstFragment.create(this);
    SecondFragment secondFragment = SecondFragment.create(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager.beginTransaction().add(R.id.container, firstFragment).commit();

    }




    @Override
    public void openSecondFragment() {
        manager.beginTransaction().hide(firstFragment).commit();
        if (isShowen) {
            manager.beginTransaction().add(R.id.container, secondFragment).commit();
            isShowen = false;
        } else {
            manager.beginTransaction().show(secondFragment).commit();

        }
    }


    @Override
    public void openFirstFragment(String text) {
        manager.beginTransaction().hide(secondFragment).commit();
        manager.beginTransaction().show(firstFragment).commit();

        firstFragment.addTask(text);

    }

}
