package com.example.bana;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BuyDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_data);


        Button button = findViewById(R.id.databuybtn);

        button.setOnClickListener(v->{
            CustomBottomSheetDialog customBottomSheetDialog = new CustomBottomSheetDialog();
            customBottomSheetDialog.show(getSupportFragmentManager(), "pinsheet");

        });

    }
}