package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import org.mariuszgromada.math.mxparser.*;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void btnClick(String btn){
        TextView equation = findViewById(R.id.equation);
        String equation2 = equation.getText().toString();
        //int con=equation.getSelectionStart();
        equation.setText(equation2+btn);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ninebtn = (Button) findViewById(R.id.ninebtn);
        Button eightbtn = (Button) findViewById(R.id.eightbtn);
        Button sevenbtn = (Button) findViewById(R.id.sevenbtn);
        Button sixbtn = (Button) findViewById(R.id.sixbtn);
        Button fivebtn = (Button) findViewById(R.id.fivebtn);
        Button fourbtn = (Button) findViewById(R.id.fourbtn);
        Button threebtn = (Button) findViewById(R.id.threebtn);
        Button twobtn = (Button) findViewById(R.id.twobtn);
        Button onebtn = (Button) findViewById(R.id.onebtn);
        Button zerobtn = (Button) findViewById(R.id.zerobtn);
        Button dotbtn = (Button) findViewById(R.id.dotbtn);
        Button clearbtn = (Button) findViewById(R.id.clear);
        Button div = (Button) findViewById(R.id.div);
        Button equals = (Button) findViewById(R.id.equals);
        Button mul = (Button) findViewById(R.id.multiply);
        Button sub = (Button) findViewById(R.id.subtraction);
        Button mod = (Button) findViewById(R.id.modulo);
        Button p1 = (Button) findViewById(R.id.p1);
        Button p2 = (Button) findViewById(R.id.p2);
        Button add = (Button) findViewById(R.id.addition);
        //Button Nine
        ninebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(ninebtn.getText().toString()); }
        });
        //Button Eight
        eightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(eightbtn.getText().toString());
        }});
        //Button Seven
        sevenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(sevenbtn.getText().toString()); }
        });
        //Button Six
        sixbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(sixbtn.getText().toString()); }
        });
        //Button Five
        fivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(fivebtn.getText().toString()); }
        });
        //Button Four
        fourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(fourbtn.getText().toString());}
        });
        //Button Four
        fourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(fourbtn.getText().toString()); }
        });
        //Button three
        threebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(threebtn.getText().toString()); }
        });
        //Button Two
        twobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(twobtn.getText().toString()); }
        });
        //Button One
        onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(onebtn.getText().toString()); }
        });
        //Button Zero
        zerobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(zerobtn.getText().toString()); }
        });
        //Button Dot
        dotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(dotbtn.getText().toString()); }
        });
        //Button Div
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(div.getText().toString());}
        });
        //Button Mul
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(mul.getText().toString());}
        });
        //Button Sub
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(sub.getText().toString()); }
        });
        //Button Mod
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(mod.getText().toString()); }
        });
        //Button (
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(p1.getText().toString()); }
        });
        //Button )
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(p2.getText().toString()); }
        });
        //Button Add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnClick(add.getText().toString()); }
        });
        //Button Clear
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView equation = findViewById(R.id.equation);
                String equation2 = equation.getText().toString();
                if(equation.getSelectionStart()!=0 && equation.length()!=0){
                    String finres = "";
                    for(int i=0;i<equation2.length()-1;i++){
                        finres=finres+equation2.charAt(i);
                    }
                    equation.setText(finres);
                }
            }
        });
        //Button Equals
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView equation = findViewById(R.id.equation);
                String equation2 = equation.getText().toString();
                //MxParser
                equation2 = equation2.replaceAll("×","*");
                equation2 = equation2.replaceAll("÷","/");
                equation2 = equation2.replaceAll("%","#");
                Expression exp = new Expression(equation2);
                TextView result = findViewById(R.id.result);
                result.setText(String.valueOf(exp.calculate()));
            }
        });

    }
}