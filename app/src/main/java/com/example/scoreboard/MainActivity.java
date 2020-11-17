package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       EditText textBox = (EditText)findViewById(R.id.textBox);
        EditText textBox2 = (EditText)findViewById(R.id.textBox2);

        Button passButton = (Button)findViewById(R.id.passButton);

       passButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String str = textBox.getText().toString();
               String tx = textBox2.getText().toString();
               if (str.length() == 0) {
                   textBox.requestFocus();
                   textBox.setError("FIELD CANNOT BE EMPTY");
               } else if (!str.matches("[a-zA-Z ]+")) {
                   textBox.requestFocus();
                   textBox.setError("ENTER ONLY ALPHABETICAL CHARACTER");
               } else if (tx.length() == 0) {
                   textBox2.requestFocus();
                   textBox2.setError("FIELD CANNOT BE EMPTY");
               } else {
                   Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                   intent.putExtra("message", str);
                   intent.putExtra("name", tx);

                   startActivity(intent);

               }
           }
       });

    }
}

