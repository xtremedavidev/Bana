package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TransferStatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_status_successful);

        TextView buttondone;
        buttondone = findViewById(R.id.done_status);

        buttondone.setOnClickListener(v->{
            startActivity(new Intent(this, DashboardActivity.class));
        });    }
}