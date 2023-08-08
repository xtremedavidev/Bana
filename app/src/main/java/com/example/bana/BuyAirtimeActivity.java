package com.example.bana;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BuyAirtimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_airtime);

        Button button = findViewById(R.id.airtimebuybtn);

        button.setOnClickListener(v->{
            CustomBottomSheetDialog customBottomSheetDialog = new CustomBottomSheetDialog();
            customBottomSheetDialog.show(getSupportFragmentManager(), "pinsheet");

        });






    }
}