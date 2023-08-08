package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        TextView send_otp = findViewById(R.id.rpsendotp);

        send_otp.setOnClickListener(v ->{
            Intent intent = new Intent(this, OtpForgotPasswordActivity.class);
            startActivity(intent);
        });
    }
}