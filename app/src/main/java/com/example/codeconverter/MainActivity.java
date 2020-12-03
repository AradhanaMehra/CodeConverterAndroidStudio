package com.example.codeconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //EditText edtuser,edtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edtuser = (EditText) findViewById(R.id.txtEmail);
        final EditText edtpass = (EditText) findViewById(R.id.txtPwd);

        Button home = (Button) findViewById(R.id.btnLogin);
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (edtuser.getText().toString().trim().length() == 0) {
                    edtuser.setError("Username is not entered");
                    edtuser.requestFocus();
                }
                if (edtpass.getText().toString().trim().length() == 0) {
                    edtpass.setError("Password is not entered");
                    edtpass.requestFocus();
                } else {
                    Intent it = new Intent(getApplicationContext(), homepageactivity.class);
                    startActivity(it);
                }
            }
        });

       TextView register = (TextView)findViewById(R.id.lnkRegister);
        register.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
    }
