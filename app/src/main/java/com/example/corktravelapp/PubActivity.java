package com.example.corktravelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class PubActivity extends AppCompatActivity implements MyAdapter.ItemClickListener{
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pub);
        RecyclerView rv = findViewById(R.id.recycler_view);

        ArrayList <Location> myPubList = new ArrayList<>();
        Location pub1 = new Location("Shelbourne Bar", R.drawable.shelbournebar2);
        Location pub2 = new Location("Costigans", R.drawable.costiganspub);
        Location pub3 = new Location("Cork Arms", R.drawable.corkarms);
        Location pub4 = new Location("The Oliver Plunkett", R.drawable.theoliverplunkett);
        Location pub5 = new Location("The Corner House", R.drawable.thecornerhouse);
        myPubList.add(pub1);
        myPubList.add(pub2);
        myPubList.add(pub3);
        myPubList.add(pub4);
        myPubList.add(pub5);

        rv.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, myPubList);
        myAdapter.setClickListener(this);
        rv.setAdapter(myAdapter);
    }
    public void onItemClick(View view, int position) {
        if(position == 0) {
            Intent intent = new Intent(this, ShelbourneBar.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent = new Intent(this, Costigans.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent = new Intent(this, CorkArms.class);
            startActivity(intent);
        }
        if(position == 3) {
            Intent intent = new Intent(this, OliverPlunkett.class);
            startActivity(intent);
        }
        if(position == 4) {
            Intent intent = new Intent(this, CornerHouse.class);
            startActivity(intent);
        }
    }
}