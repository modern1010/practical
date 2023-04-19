package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        EditText txt;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.check);
        txt=findViewById(R.id.txt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.length()==0){
                    txt.setError("required!");
                }
                else {
                    TextView dis = findViewById(R.id.dis);
                    String pal = "";
                    String res = txt.getText().toString();
                    for (int i = res.length() - 1; i >= 0; i--) {
                        pal = pal + res.charAt(i);
                    }
                    if (res.equals(pal)) {
                        dis.setText("Palindrome");
                    } else {
                        dis.setText("Not Palindrome");
                    }
                }
            }
        });
    }
}