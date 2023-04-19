package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        TextView timeline = (TextView) findViewById(R.id.timeline);

        //Get Extras
        Intent i = getIntent();
        String choice = i.getStringExtra("year");
        String day = i.getStringExtra("day");
        String month = i.getStringExtra("month");

        //Switch Year
        switch (choice){
            case "2021":
                timeline.setText(day+"/"+month+"/"+choice);
                img.setImageResource(R.drawable.pexel10);
                break;
            case "2022":
                timeline.setText(day+"/"+month+"/"+choice);
                img.setImageResource(R.drawable.pexel20);
                break;
            case "2020":
                timeline.setText(day+"/"+month+"/"+choice);
                img.setImageResource(R.drawable.pexel30);
                break;
            default:
                timeline.setText("No Timeline Found! :(");
                img.setImageResource(R.drawable.empty);
                break;

        }
    }
}