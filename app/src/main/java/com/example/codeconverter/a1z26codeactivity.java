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

public class a1z26codeactivity extends AppCompatActivity {
    private TextView txt;
    private TextView result;
    private Button toBinaryBtn;
    private Button toAlphaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1z26code);
        txt = (TextView) findViewById(R.id.txt2);
        result = (TextView) findViewById(R.id.result2);
        toBinaryBtn = (Button) findViewById(R.id.toa1z26Btn2);
        toAlphaBtn = (Button) findViewById(R.id.toAlphaBtn2);

        toBinaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = a1z26code.alphaToa1z26(txtToConvert);
                result.setText(convertedTxt);
            }
        });

        toAlphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = a1z26code.a1z26ToAlpha(txtToConvert);
                result.setText(convertedTxt);
            }
        });
    }}
