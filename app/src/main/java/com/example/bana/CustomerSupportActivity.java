package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CustomerSupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_support);



        FloatingActionButton floatingActionButton = findViewById(R.id.scanfloat4);

        floatingActionButton.setOnClickListener(v ->{
            startActivity(new Intent(this, ScanActivity.class));
        });


        // bottom nav bar

        LinearLayout linprofile, linsupport, linhome, linmerchant;

        linprofile = findViewById(R.id.linprofile);

        linsupport = findViewById(R.id.linsupport);

        linhome = findViewById(R.id.linhome);

        linmerchant = findViewById(R.id.linmerchants);



        linprofile.setOnClickListener(v-> {
            startActivity(new Intent(this, ProfileActivity.class));

        });



        linhome.setOnClickListener(v-> {
            startActivity(new Intent(this, DashboardActivity.class));

        });

        linmerchant.setOnClickListener(v-> {
            startActivity(new Intent(this, MerchantActivity.class));

        });




    }
}