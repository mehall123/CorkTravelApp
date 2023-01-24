package com.example.corktravelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity implements RestaurantAdapter.ItemClickListener {
    RestaurantAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        RecyclerView rv = findViewById(R.id.recycler_view);

        ArrayList<Location> myRestaurantList = new ArrayList<>();
        Location restaurant1 = new Location("Elbow Lane", R.drawable.elbowlanebrewandsmokehouse);
        Location restaurant2 = new Location("The River Club", R.drawable.riverclub);
        Location restaurant3 = new Location("Liberty Grill", R.drawable.libertygrill);
        myRestaurantList.add(restaurant1);
        myRestaurantList.add(restaurant2);
        myRestaurantList.add(restaurant3);

        rv.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new RestaurantAdapter(this, myRestaurantList);
        myAdapter.setClickListener(this);
        rv.setAdapter(myAdapter);
    }
    public void onItemClick(View view, int position) {
        if(position == 0) {
            Intent intent = new Intent(this, ElbowLane.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent = new Intent(this, RiverClub.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent = new Intent(this, LibertyGrill.class);
            startActivity(intent);
        }
    }
}