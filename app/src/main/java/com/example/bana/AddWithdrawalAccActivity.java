package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddWithdrawalAccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_withdrawal_acc);
        TextView continue1;

        continue1 = findViewById(R.id.confirm_add_acc);




        continue1.setOnClickListener(v-> startActivity(new Intent(this, DashboardActivity.class)));



    }
}