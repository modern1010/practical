package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate","onCreate Invoked");
        Toast.makeText(getApplicationContext(),"Oncreate",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","onStart Invoked");
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","onResume Invoked");
        Toast.makeText(getApplicationContext(),"OnResume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","onPause Invoked");
        Toast.makeText(getApplicationContext(),"OnPause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","onStop Invoked");
        Toast.makeText(getApplicationContext(),"OnStop",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart","onRestart Invoked");
        Toast.makeText(getApplicationContext(),"OnRestart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","onDestroy Invoked");
        Toast.makeText(getApplicationContext(),"OnDestroy",Toast.LENGTH_LONG).show();
    }

}