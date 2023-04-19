package com.example.menudrivenapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       image = findViewById(R.id.imageView);
       txt = findViewById(R.id.txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        txt.setText("");
        switch (item.getItemId()){
            case R.id.masterchief:
            image.setImageResource(R.drawable.masterchief);
                break;
            case R.id.kratos:
                image.setImageResource(R.drawable.kratos);
                break;
            case R.id.raiden:
                image.setImageResource(R.drawable.raiden);
                break;
            case R.id.frenix:
                image.setImageResource(R.drawable.frenix);
                break;
            case R.id.witcher:
                image.setImageResource(R.drawable.witcher);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}