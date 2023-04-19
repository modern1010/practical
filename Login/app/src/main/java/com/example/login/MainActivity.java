package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText usr = (EditText) findViewById(R.id.usr);
        EditText pass = (EditText) findViewById(R.id.pass);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usr.getText().toString();
                String password = pass.getText().toString();
                if(username.equals("Vishal")&&password.equals("Vishal@123")){
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }
                if(!username.equals("Vishal")){
                    usr.setError("Vishal");
                }
                if(!password.equals("Vishal@123")){
                    pass.setError("Vishal@123");
                }
            }
        });
    }
}