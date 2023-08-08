package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OtpForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_forgot_password);

        TextView next = findViewById(R.id.ofpnext);

        next.setOnClickListener(v ->{
            Intent intent = new Intent(this, ChangePasswordActivity.class);
            startActivity(intent);
        });
    }
}