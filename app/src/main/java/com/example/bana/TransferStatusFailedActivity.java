package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TransferStatusFailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_status_failed);


        TextView buttondone, buttoncancel;
        buttondone = findViewById(R.id.cancel_failed);

        buttondone.setOnClickListener(v->{
            startActivity(new Intent(this, DashboardActivity.class));
        });




    }
}