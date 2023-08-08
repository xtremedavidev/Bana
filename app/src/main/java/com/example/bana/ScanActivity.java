package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;

public class ScanActivity extends AppCompatActivity {
    private CodeScanner mCodeScanner;
    private CodeScannerView mCodeScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        // Initialize CodeScannerView
        mCodeScannerView = findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(this, mCodeScannerView);

        // Set callback for successful scan
        mCodeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull final Result result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                         startActivity(new Intent(ScanActivity.this, TransferActivity.class));

                    }
                });
            }
        });

        // Set error callback
        mCodeScanner.setErrorCallback(error -> runOnUiThread(() -> Toast.makeText(ScanActivity.this, "Scan error: " + error.getMessage(), Toast.LENGTH_SHORT).show()));

        // Start scanner
        mCodeScanner.startPreview();
    }

}
