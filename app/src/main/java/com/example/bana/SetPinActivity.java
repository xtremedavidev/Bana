package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SetPinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_pin);

        TextView next = findViewById(R.id.pinsignupnext);

        next.setOnClickListener(v -> {
                Intent intent = new Intent(this, OnboardingInfoActivity.class);
                startActivity(intent);
        });
    }
}