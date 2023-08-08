package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChangePasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        TextView confirm = findViewById(R.id.cpconfirm);

        confirm.setOnClickListener(v ->{
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}