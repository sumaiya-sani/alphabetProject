package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adopter.MyAnimalAdopter;
import Utils.AnimalList;


public class AnimalActivity extends AppCompatActivity {
    private RecyclerView recyclerViewAnimal ;
    private List<AnimalList> listitemsAnimal;
    private RecyclerView.Adapter animalAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        recyclerViewAnimal=findViewById(R.id.recyclerviewanimal);
        recyclerViewAnimal.setHasFixedSize(true);
        recyclerViewAnimal.setLayoutManager(new GridLayoutManager(this,3));

        listitemsAnimal=new ArrayList<>();
        AnimalList animal1= new AnimalList(R.drawable.anaconda,R.string.anconda);
        AnimalList animal2= new AnimalList(R.drawable.butterfly,R.string.butterFly);
        AnimalList animal3= new AnimalList(R.drawable.cow,R.string.cow);
        AnimalList animal4= new AnimalList(R.drawable.duck,R.string.duck);
        AnimalList animal5= new AnimalList(R.drawable.elephant,R.string.elephant);
        AnimalList animal6= new AnimalList(R.drawable.fish,R.string.fish);
        AnimalList animal7= new AnimalList(R.drawable.goose,R.string.goose);
        AnimalList animal8= new AnimalList(R.drawable.horse,R.string.horse);
        AnimalList animal9= new AnimalList(R.drawable.lizard,R.string.lizard);
        AnimalList animal10= new AnimalList(R.drawable.ja,R.string.jackal);
        AnimalList animal11= new AnimalList(R.drawable.kangaroo,R.string.kangaroo);
        AnimalList animal12= new AnimalList(R.drawable.lion,R.string.lion);
        AnimalList animal13= new AnimalList(R.drawable.monkey,R.string.monkey);
        AnimalList animal14= new AnimalList(R.drawable.nde,R.string.newt);
        AnimalList animal15= new AnimalList(R.drawable.octopus,R.string.octopus);
        AnimalList animal16= new AnimalList(R.drawable.pig,R.string.pig);
        AnimalList animal17= new AnimalList(R.drawable.quail,R.string.quail);
        AnimalList animal18= new AnimalList(R.drawable.rabbit,R.string.rabbit);
        AnimalList animal19= new AnimalList(R.drawable.snake,R.string.snake);
        AnimalList animal20= new AnimalList(R.drawable.tiger,R.string.tiger);
        AnimalList animal21= new AnimalList(R.drawable.unicorn,R.string.unicorn);
        AnimalList animal22= new AnimalList(R.drawable.va,R.string.vane);
        AnimalList animal23= new AnimalList(R.drawable.wolf,R.string.wolf);
        AnimalList animal24= new AnimalList(R.drawable.xray,R.string.xray);
        AnimalList animal25= new AnimalList(R.drawable.you,R.string.yak);
        AnimalList animal26= new AnimalList(R.drawable.zebra,R.string.zebra);

        listitemsAnimal.add(animal1);
        listitemsAnimal.add(animal2);
        listitemsAnimal.add(animal3);
        listitemsAnimal.add(animal4);
        listitemsAnimal.add(animal5);
        listitemsAnimal.add(animal6);
        listitemsAnimal.add(animal7);
        listitemsAnimal.add(animal8);
        listitemsAnimal.add(animal9);
        listitemsAnimal.add(animal10);
        listitemsAnimal.add(animal11);
        listitemsAnimal.add(animal12);
        listitemsAnimal.add(animal13);
        listitemsAnimal.add(animal14);
        listitemsAnimal.add(animal15);
        listitemsAnimal.add(animal16);
        listitemsAnimal.add(animal17);
        listitemsAnimal.add(animal18);
        listitemsAnimal.add(animal19);
        listitemsAnimal.add(animal20);
        listitemsAnimal.add(animal21);
        listitemsAnimal.add(animal22);
        listitemsAnimal.add(animal23);
        listitemsAnimal.add(animal24);
        listitemsAnimal.add(animal25);
        listitemsAnimal.add(animal26);


        animalAdapter=new MyAnimalAdopter(this,listitemsAnimal);
        animalAdapter.notifyDataSetChanged();
        recyclerViewAnimal.setAdapter(animalAdapter);
    }
}