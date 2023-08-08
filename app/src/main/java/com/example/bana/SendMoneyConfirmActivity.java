package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SendMoneyConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money_confirm);

        TextView buttondone, buttoncancel;
        buttondone = findViewById(R.id.send_money_confirm);
        buttoncancel = findViewById(R.id.send_money_cancel);

        buttondone.setOnClickListener(v->{
            startActivity(new Intent(this, TransferStatusActivity.class));
        });

        buttoncancel.setOnClickListener(v->{
            startActivity(new Intent(this, TransferStatusFailedActivity.class));
        });
    }
}