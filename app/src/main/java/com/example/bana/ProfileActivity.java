package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        FloatingActionButton floatingActionButton = findViewById(R.id.scanfloat3);

        floatingActionButton.setOnClickListener(v ->{
            startActivity(new Intent(this, ScanActivity.class));
        });




        RelativeLayout addbank, resetpin, changepass;

        addbank = findViewById(R.id.reladdwithdraw);
        resetpin = findViewById(R.id.relresetpin);
        changepass = findViewById(R.id.relchangepass);

        addbank.setOnClickListener(v-> startActivity(new Intent(this, AddWithdrawalAccActivity.class)));
        resetpin.setOnClickListener(v-> startActivity(new Intent(this, ResetPasswordActivity.class)));
        changepass.setOnClickListener(v-> startActivity(new Intent(this, ChangePasswordActivity.class)));

        // bottom nav bar

        LinearLayout linprofile, linsupport, linhome, linmerchant;


        linsupport = findViewById(R.id.linsupport);

        linhome = findViewById(R.id.linhome);

        linmerchant = findViewById(R.id.linmerchants);




        linsupport.setOnClickListener(v-> {
            startActivity(new Intent(this, CustomerSupportActivity.class));

        });


        linhome.setOnClickListener(v-> {
            startActivity(new Intent(this, DashboardActivity.class));

        });

        linmerchant.setOnClickListener(v-> {
            startActivity(new Intent(this, MerchantActivity.class));

        });







    }
}