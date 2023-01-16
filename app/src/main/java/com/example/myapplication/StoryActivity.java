package com.example.myapplication;

import Adopter.MyAdopter;
import Adopter.MyStoryAdopter;
import Adopter.MyThaiStoryAdopter;
import Utils.Listitem;
import Utils.StortThaiItem;
import Utils.StoryItem;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StoryActivity extends AppCompatActivity {
    private RecyclerView englishRecycler,thaiRecycler;
    public List<StoryItem> storyItems;
    public List<StortThaiItem> storyThaiItems;
    private RecyclerView.Adapter adapter ,adapterthai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        englishRecycler=findViewById(R.id.englishRecycler);
        englishRecycler.setHasFixedSize(true);
        englishRecycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        storyItems=new ArrayList<>();
       StoryItem item1= new StoryItem(R.drawable.cindrela,R.string.title1,R.string.story1);
        StoryItem item2= new StoryItem(R.drawable.snow,R.string.title2,R.string.story2);
        StoryItem item3= new StoryItem(R.drawable.duckpic,R.string.title3,R.string.story3);
        StoryItem item4= new StoryItem(R.drawable.pinocchio,R.string.title4,R.string.story4);
        storyItems.add(item1);
        storyItems.add(item2);
        storyItems.add(item3);
        storyItems.add(item4);

        adapter=new MyStoryAdopter(this,storyItems);
        adapter.notifyDataSetChanged();
        englishRecycler.setAdapter(adapter);


        thaiRecycler=findViewById(R.id.thaiRecycler);
        thaiRecycler.setHasFixedSize(true);
       thaiRecycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        storyThaiItems=new ArrayList<>();
        StortThaiItem item1T= new StortThaiItem(R.drawable.cindrela,R.string.title1);
        StortThaiItem item2T= new StortThaiItem(R.drawable.snow,R.string.title2);
        StortThaiItem item3T= new StortThaiItem(R.drawable.duckpic,R.string.title3);
        StortThaiItem item4T= new StortThaiItem(R.drawable.pinocchio,R.string.title4);
       storyThaiItems.add(item1T);
        storyThaiItems.add(item2T);
        storyThaiItems.add(item3T);
        storyThaiItems.add(item4T);

        adapterthai=new MyThaiStoryAdopter(this,storyThaiItems);
        adapterthai.notifyDataSetChanged();
        thaiRecycler.setAdapter(adapterthai);

    }
}