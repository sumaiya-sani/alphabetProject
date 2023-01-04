package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
 ImageView show;
Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        show=findViewById(R.id.imageViewshow);
        extras=getIntent().getExtras();
        if(extras != null){
            show.setImageResource((extras.getInt("image")));
    }
}}