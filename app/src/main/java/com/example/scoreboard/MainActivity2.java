package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn  =(Button) findViewById(R.id.btn_count);
         TextView tv2=(TextView) findViewById(R.id.tv2) ;
         Button btn2 = (Button)findViewById(R.id.btn_count2);
         TextView tv1= (TextView) findViewById(R.id.tv1) ;
        btn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String value1=tv1.getText().toString();
                    int finalValue1 = Integer.parseInt(value1);
                    String result1 = String.valueOf(finalValue1 +1);
                 tv1.setText(result1);
                }
        }));
         btn.setOnClickListener((new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String value=tv2.getText().toString();
                 int finalValue = Integer.parseInt(value);
                 String result = String.valueOf(finalValue +1);
                 tv2.setText(result);


             }
         }));

         Button btnReset =(Button)findViewById(R.id.btnReset);
         btnReset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 tv1.setText("0");
                 tv2.setText("0");
             }
         });

        TextView text = (TextView)findViewById(R.id.text);
       TextView text1 =(TextView) findViewById(R.id.text1);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        String tx = intent.getStringExtra("name");
        text.setText(str);
        text1.setText(tx);
    }
}