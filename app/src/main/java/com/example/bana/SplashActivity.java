package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        final Handler handler = new Handler();


        handler.postDelayed(() -> {


            // Do something after 6s = 5000ms
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);


        }, 3000);

        


    }
}