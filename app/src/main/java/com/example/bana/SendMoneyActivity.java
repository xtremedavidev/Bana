package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SendMoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        LinearLayout linscan, bana, bank;

        linscan = findViewById(R.id.scan_send_act);
        bana = findViewById(R.id.bana_send_act);
        bank = findViewById(R.id.banktrans_send_act);


        linscan.setOnClickListener(v-> startActivity(new Intent(this, ScanActivity.class)));
        bank.setOnClickListener(v-> startActivity(new Intent(this, TransferActivity.class)));


    }
}