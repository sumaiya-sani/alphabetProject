package com.example.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
private ImageView alphabetPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        alphabetPage=findViewById(R.id.imageAlphabet);
        alphabetPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secIntent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(secIntent);
            }
        });


    }
}