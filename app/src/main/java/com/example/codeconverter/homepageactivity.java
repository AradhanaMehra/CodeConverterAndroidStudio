package com.example.codeconverter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class homepageactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        Button morse = (Button) findViewById(R.id.containedButton1);
        morse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent it = new Intent(getApplicationContext(), morsecodeactivity.class);
                startActivity(it);
            }

    });
        Button binary = (Button) findViewById(R.id.containedButton2);
        binary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent it = new Intent(getApplicationContext(), binarycodeactivity.class);
                startActivity(it);
            }

        });

        Button a1z26 = (Button) findViewById(R.id.containedButton3);
        a1z26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent it = new Intent(getApplicationContext(), a1z26codeactivity.class);
                startActivity(it);
            }

        });
        }}

