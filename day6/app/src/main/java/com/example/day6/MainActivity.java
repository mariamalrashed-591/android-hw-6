package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Movie m = new Movie("Hungergames","JenniferLawrence",80,16,"fiction");
        Movie m2 = new Movie("HarryPotter","DanielRadcliffe",75,18, "fiction");


    }
}