package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PayBillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bills);

        LinearLayout linelectricity, lindata, lincable, linairtime;

        linelectricity = findViewById(R.id.linelectricity);
        lindata = findViewById(R.id.lindata);
        lincable = findViewById(R.id.lincable);
        linairtime = findViewById(R.id.linairtime);

        linelectricity.setOnClickListener(v-> startActivity(new Intent(this, BuyCableActivity.class)));
        linairtime.setOnClickListener(v-> startActivity(new Intent(this, BuyAirtimeActivity.class)));
        lindata.setOnClickListener(v-> startActivity(new Intent(this, BuyDataActivity.class)));
        lincable.setOnClickListener(v-> startActivity(new Intent(this, BuyCableActivity.class)));


    }
}