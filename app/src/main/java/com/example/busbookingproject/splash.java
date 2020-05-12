package com.example.busbookingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.database.Transaction;

public class splash extends AppCompatActivity {

    public static int splashTimeout=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(splash.this,MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },splashTimeout);

    }
}
