package com.example.corktravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShelbourneBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelbourne_bar);
    }
    public void Open_dialer(View view){
        Button buttonDial = (Button)findViewById(R.id.button2);
        buttonDial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String number = "+353214509615";
                Uri call = Uri.parse("tel:" + number);
                Intent intent = new Intent(Intent.ACTION_DIAL, call);
                startActivity(intent);
            }
        });
    }
    public void Open_email(View view){
        Button buttonEmail = (Button)findViewById(R.id.button4);
        buttonEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:info@theshelbournecork.ie"));
                startActivity(Intent.createChooser(emailIntent, "Send enquiry"));
            }
        });
    }
    public void Open_maps(View view){
        Button buttonMap = (Button)findViewById(R.id.button);
        buttonMap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=51.90143241872847, -8.468415598647315");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}