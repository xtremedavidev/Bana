package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FundWalletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fund_wallet);

        LinearLayout linbank, linscan;

        linbank = findViewById(R.id.linbank_fund);
        linscan = findViewById(R.id.linscan_fund);


        linbank.setOnClickListener(v-> {
            Toast.makeText(this, "Paystack is not yet available", Toast.LENGTH_SHORT).show();
        });

        linscan.setOnClickListener(v-> startActivity(new Intent(this, ScanActivity.class)));




    }
}