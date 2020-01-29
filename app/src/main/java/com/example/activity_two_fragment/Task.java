package com.example.activity_two_fragment;

import java.io.Serializable;

public class Task implements Serializable {

    public String title;
    public String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
}