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

public class binarycodeactivity extends AppCompatActivity {
    private TextView txt;
    private TextView result;
    private Button toBinaryBtn;
    private Button toAlphaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binarycode);
        txt = (TextView) findViewById(R.id.txt1);
        result = (TextView) findViewById(R.id.result1);
        toBinaryBtn = (Button) findViewById(R.id.toBinaryBtn1);
        toAlphaBtn = (Button) findViewById(R.id.toAlphaBtn1);

        toBinaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = BinaryCode.alphaTobinary(txtToConvert);
                result.setText(convertedTxt);
            }
        });

        toAlphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = BinaryCode.binaryToAlpha(txtToConvert);
                result.setText(convertedTxt);
            }
        });
    }}
