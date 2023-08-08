package com.example.bana;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Calendar;

public class TransactionHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);

        ImageView imageView = findViewById(R.id.filterimg);

        imageView.setOnClickListener(v -> {

            showDatePickerBottomSheet();

        });
    }

    private void showDatePickerBottomSheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View dialogView = getLayoutInflater().inflate(R.layout.bottom_sheet_date_picker, null);
        bottomSheetDialog.setContentView(dialogView);

        DatePicker datePicker = dialogView.findViewById(R.id.date_picker);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        datePicker.init(year, month, dayOfMonth, null);

        Button confirmButton = dialogView.findViewById(R.id.ok_button);
        confirmButton.setOnClickListener(v -> {
            int selectedYear = datePicker.getYear();
            int selectedMonth = datePicker.getMonth() + 1; // add 1 to match standard month numbering
            int selectedDayOfMonth = datePicker.getDayOfMonth();
            String selectedDate = selectedYear + "-" + selectedMonth + "-" + selectedDayOfMonth;
            // do something with selectedDate, such as passing it back to the calling activity or fragment
            bottomSheetDialog.dismiss();
        });

        bottomSheetDialog.show();
    }
}