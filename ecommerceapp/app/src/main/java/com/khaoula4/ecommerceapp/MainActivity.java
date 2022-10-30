package com.khaoula4.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button ButtonDEC,ButtonINC;
  TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  "ButtonDEC = findViewById(R.);
       //"/ ButtonINC = findViewById(R.);"
        tvDisplay = findViewById(R.id.tv_output_id);

    }



}