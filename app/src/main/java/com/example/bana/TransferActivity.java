package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);


        TextView button = findViewById(R.id.done_trans_act);

        button.setOnClickListener(v->{
            startActivity(new Intent(this, SendMoneyConfirmActivity.class));
        });


    }
}