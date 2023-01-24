package com.example.corktravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button pubsButton, restaurantButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pubsButton =(Button) findViewById(R.id.pubsButton);
        restaurantButton =(Button) findViewById(R.id.restaurantButton);

        pubsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPubActivity();
            }
        });
        restaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestaurantActivity();
            }
        });
    }
    public void openPubActivity(){
        Intent intent = new Intent(this, PubActivity.class);
        startActivity(intent);
    }
    public void openRestaurantActivity(){
        Intent intent = new Intent(this, RestaurantActivity.class);
        startActivity(intent);
    }
}