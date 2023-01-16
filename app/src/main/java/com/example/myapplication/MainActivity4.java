package com.example.myapplication;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
 ImageView show,imageAnimal ;
Bundle extras;
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        show=findViewById(R.id.imageViewshow);
        imageAnimal=findViewById(R.id.imageAnimal);
        extras=getIntent().getExtras();
        if(extras != null){
            show.setImageResource((extras.getInt("image")));
    }


        mediaPlayer = MediaPlayer.create(this, R.raw.a);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(extras.getInt("image")==R.drawable.a){
                         getMd(R.raw.a);
                         mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.aposter);
                }
                else if(extras.getInt("image")==R.drawable.b){
                    imageAnimal.setImageResource(R.drawable.butterfly);
                    getMd(R.raw.b);
                    mediaPlayer.start();

                }
                else if(extras.getInt("image")==R.drawable.c){

                    getMd(R.raw.c);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.cow);
                }
                else if(extras.getInt("image")==R.drawable.d){

                    getMd(R.raw.d);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.duck);
                }
                else if(extras.getInt("image")==R.drawable.e){

                    getMd(R.raw.e);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.elephant);
                }
                else if(extras.getInt("image")==R.drawable.f){

                    getMd(R.raw.f);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.fish);


                }
                else if(extras.getInt("image")==R.drawable.g){

                    getMd(R.raw.g);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.goose);
                }
                else if(extras.getInt("image")==R.drawable.h){

                    getMd(R.raw.h);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.horse);
                }
                else if(extras.getInt("image")==R.drawable.i){

                    getMd(R.raw.i);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.lizard);
                }
                else if(extras.getInt("image")==R.drawable.j){

                    getMd(R.raw.j);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.ja);

                }
                else if(extras.getInt("image")==R.drawable.k){

                    getMd(R.raw.k);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.kangaroo);
                }
                else if(extras.getInt("image")==R.drawable.l){

                    getMd(R.raw.l);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.lion);
                }
                else if(extras.getInt("image")==R.drawable.m){

                    getMd(R.raw.m);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.monkey);
                }
                else if(extras.getInt("image")==R.drawable.n){

                    getMd(R.raw.n);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.nde);

                }
                else if(extras.getInt("image")==R.drawable.o){

                    getMd(R.raw.o);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.octopus);
                }
                else if(extras.getInt("image")==R.drawable.p){

                    getMd(R.raw.p);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.pig);
                }
                else if(extras.getInt("image")==R.drawable.q){

                    getMd(R.raw.q);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.quail);
                }
                else if(extras.getInt("image")==R.drawable.r){

                    getMd(R.raw.r);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.rabbit);

                }
                else if(extras.getInt("image")==R.drawable.s){

                    getMd(R.raw.s);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.snake);

                }
                else if(extras.getInt("image")==R.drawable.t){

                    getMd(R.raw.t);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.tiger);
                }
                else if(extras.getInt("image")==R.drawable.u){

                    getMd(R.raw.u);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.unicorn);
                }
                else if(extras.getInt("image")==R.drawable.v){

                    getMd(R.raw.v);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.va);
                }
                else if(extras.getInt("image")==R.drawable.w){

                    getMd(R.raw.w);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.wolf);

                }
                else if(extras.getInt("image")==R.drawable.x){

                    getMd(R.raw.x);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.xray);
                }
                else if(extras.getInt("image")==R.drawable.y){

                    getMd(R.raw.y);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.you);
                }
                else if(extras.getInt("image")==R.drawable.z){

                    getMd(R.raw.z);
                    mediaPlayer.start();
                    imageAnimal.setImageResource(R.drawable.zebra);
                }
                //I need to write a defult
            }
        });

}
public void getMd(int md){
    mediaPlayer = MediaPlayer.create(this, md);

}
}