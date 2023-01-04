package com.example.myapplication;

import Adopter.MyAdopter;
import Utils.Listitem;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    private RecyclerView recyclerView;
    public List<Listitem> listitems;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

             listitems=new ArrayList<>();


            Listitem item1=new Listitem(R.drawable.a);
            Listitem item2 =new Listitem(R.drawable.b);
            Listitem item3=new Listitem(R.drawable.c);
        Listitem item4=new Listitem(R.drawable.d);
        Listitem item5 =new Listitem(R.drawable.e);
        Listitem item6=new Listitem(R.drawable.f);
        Listitem item7=new Listitem(R.drawable.g);
        Listitem item8 =new Listitem(R.drawable.h);
        Listitem item9=new Listitem(R.drawable.i);
        Listitem item10=new Listitem(R.drawable.j);
        Listitem item11 =new Listitem(R.drawable.k);
        Listitem item12=new Listitem(R.drawable.l);
        Listitem item13=new Listitem(R.drawable.m);
        Listitem item14=new Listitem(R.drawable.n);
        Listitem item15 =new Listitem(R.drawable.o);
        Listitem item16=new Listitem(R.drawable.p);
        Listitem item17=new Listitem(R.drawable.q);
        Listitem item18=new Listitem(R.drawable.r);
        Listitem item19 =new Listitem(R.drawable.s);
        Listitem item20=new Listitem(R.drawable.t);
        Listitem item21=new Listitem(R.drawable.u);
        Listitem item22=new Listitem(R.drawable.v);
        Listitem item23 =new Listitem(R.drawable.w);
        Listitem item24=new Listitem(R.drawable.x);
        Listitem item25 =new Listitem(R.drawable.y);
        Listitem item26=new Listitem(R.drawable.z);


        listitems.add(item1);
        listitems.add(item2);
        listitems.add(item3);
        listitems.add(item4);
        listitems.add(item5);
        listitems.add(item6);
        listitems.add(item7);
        listitems.add(item8);
        listitems.add(item9);
        listitems.add(item10);
        listitems.add(item11);
        listitems.add(item12);
        listitems.add(item13);
        listitems.add(item14);
        listitems.add(item15);
        listitems.add(item16);
        listitems.add(item17);
        listitems.add(item18);
        listitems.add(item19);
        listitems.add(item20);
        listitems.add(item21);
        listitems.add(item22);
        listitems.add(item23);
        listitems.add(item24);
        listitems.add(item25);
        listitems.add(item26);


        adapter=new MyAdopter(this,listitems);
        adapter.notifyDataSetChanged();
            recyclerView.setAdapter(adapter);




    }
}

//        for(int x=1;x<12;x++){
//            Listitem listitem=new Listitem(R.drawable.a+(x+1));
