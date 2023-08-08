package com.example.bana;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BuyCableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_cable);


        Button button = findViewById(R.id.cablebuybtn);

        button.setOnClickListener(v->{
            CustomBottomSheetDialog customBottomSheetDialog = new CustomBottomSheetDialog();
            customBottomSheetDialog.show(getSupportFragmentManager(), "pinsheet");

        });


    }
}