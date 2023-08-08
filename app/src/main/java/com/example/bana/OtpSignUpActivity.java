package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OtpSignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_sign_up);

        TextView next = findViewById(R.id.otpsignupnext);

        next.setOnClickListener(v -> {
            Intent intent = new Intent(this, SetPinActivity.class);
            startActivity(intent);
        });

    }
}