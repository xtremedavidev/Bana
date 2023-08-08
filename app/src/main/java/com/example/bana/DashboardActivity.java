package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        FloatingActionButton floatingActionButton = findViewById(R.id.scanfloat1);

        floatingActionButton.setOnClickListener(v ->{
            startActivity(new Intent(this, ScanActivity.class));
        });


        // inside dashboard

        TextView copyacc;


        copyacc = findViewById(R.id.copy_dash);


        copyacc.setOnClickListener(v-> {
            Toast.makeText(this, "Account Number Copied", Toast.LENGTH_SHORT).show();
        });











        LinearLayout linbills, linsend, lintrans, linreceive, linmerchants, linlinkaccount, linfund, linwithdraw;

        linbills = findViewById(R.id.linpaybillsdash);
        linsend = findViewById(R.id.linsendmoneydash);
        linreceive = findViewById(R.id.linreceivedash);
        lintrans = findViewById(R.id.lintranshistorydash);
        linmerchants = findViewById(R.id.linmerchants);
        linlinkaccount = findViewById(R.id.linlinkaccountdash);

        linfund = findViewById(R.id.linfund_dash);
        linwithdraw = findViewById(R.id.linwithdraw_dash);


        linwithdraw.setOnClickListener(v-> {
            AmountSheet amountSheet = new AmountSheet();
            amountSheet.setActivity(this);
            amountSheet.show(getSupportFragmentManager(), "pinsheet");

        });



        linbills.setOnClickListener(v-> startActivity(new Intent(this, PayBillsActivity.class)));

        linsend.setOnClickListener(v-> startActivity(new Intent(this, SendMoneyActivity.class)));

        lintrans.setOnClickListener(v-> startActivity(new Intent(this, TransactionHistoryActivity.class)));

        linreceive.setOnClickListener(v-> startActivity(new Intent(this, RecieveActivity.class)));

        linlinkaccount.setOnClickListener(v-> startActivity(new Intent(this, AddWithdrawalAccActivity.class)));











        // bottom nav bar

        LinearLayout linprofile, linsupport, linhome, linmerchant;

        linprofile = findViewById(R.id.linprofile);

        linsupport = findViewById(R.id.linsupport);

        linhome = findViewById(R.id.linhome);

        linmerchant = findViewById(R.id.linmerchants);



        linprofile.setOnClickListener(v-> {
           startActivity(new Intent(this, ProfileActivity.class));

        });

        linsupport.setOnClickListener(v-> {
            startActivity(new Intent(this, CustomerSupportActivity.class));

        });

        linmerchant.setOnClickListener(v-> {
            startActivity(new Intent(this, MerchantActivity.class));

        });





    }

}