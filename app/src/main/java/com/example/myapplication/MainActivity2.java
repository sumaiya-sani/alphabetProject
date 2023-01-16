package com.example.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
private ImageView alphabetPage,numberPage,stortPage,animalPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        numberPage=findViewById(R.id.pagenumber);
        alphabetPage=findViewById(R.id.imageAlphabet);
        stortPage= this.<ImageView>findViewById(R.id.pageStory);
        animalPage= this.<ImageView>findViewById(R.id.pageAnimal);
        alphabetPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secIntent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(secIntent);
            }
        });
        numberPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberActivity=new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(numberActivity);
            }
        });

stortPage.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent storyActivity=new Intent(MainActivity2.this,StoryActivity.class);
        startActivity(storyActivity);
    }
});

        animalPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalActivity=new Intent(MainActivity2.this,AnimalActivity.class);
                startActivity(animalActivity);
            }
        });


    }
}