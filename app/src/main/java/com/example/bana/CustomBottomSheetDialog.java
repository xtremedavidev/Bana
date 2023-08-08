package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.dpizarro.pinview.library.PinView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class CustomBottomSheetDialog extends BottomSheetDialogFragment {

    private PinView mPinView;
    String currentPin;

    public static CustomBottomSheetDialog newInstance() {
        return new CustomBottomSheetDialog();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_pin, container, false);

        mPinView = view.findViewById(R.id.pinview);

        TextView button1 = view.findViewById(R.id.btn_1);
        TextView button2 = view.findViewById(R.id.btn_2);
        TextView button3 = view.findViewById(R.id.btn_3);
        TextView button4 = view.findViewById(R.id.btn_4);
        TextView button5 = view.findViewById(R.id.btn_5);
        TextView button6 = view.findViewById(R.id.btn_6);
        TextView button7 = view.findViewById(R.id.btn_7);
        TextView button8 = view.findViewById(R.id.btn_8);
        TextView button9 = view.findViewById(R.id.btn_9);
        TextView button0 = view.findViewById(R.id.btn_0);

        ImageView buttondel = view.findViewById(R.id.btn_del);
        ImageView buttonscan = view.findViewById(R.id.scanfinger);


        button0.setOnClickListener(v->{
            addNumberToPinview(button0, mPinView);
        });

        button1.setOnClickListener(v->{
            addNumberToPinview(button1, mPinView);
        });
        button2.setOnClickListener(v->{
            addNumberToPinview(button2, mPinView);
        });
        button3.setOnClickListener(v->{
            addNumberToPinview(button3, mPinView);
        });
        button4.setOnClickListener(v->{
            addNumberToPinview(button4, mPinView);
        });
        button5.setOnClickListener(v->{
            addNumberToPinview(button5, mPinView);
        });
        button6.setOnClickListener(v->{
            addNumberToPinview(button6, mPinView);
        });
        button7.setOnClickListener(v->{
            addNumberToPinview(button7, mPinView);
        });
        button8.setOnClickListener(v->{
            addNumberToPinview(button8, mPinView);
        });
        button9.setOnClickListener(v->{
            addNumberToPinview(button9, mPinView);
        });

        buttondel.setOnClickListener(v->{
            deleteLastNumber(mPinView);
        });

        buttonscan.setOnClickListener(v-> {
            TransDetailsSheet amountSheet = new TransDetailsSheet();
            amountSheet.setActivity2(this.getActivity());
            amountSheet.show(getActivity().getSupportFragmentManager(), "pinsheet");

            dismiss();
        });


        return view;
    }



    private void addNumberToPinview(TextView button, PinView pinview) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = button.getText().toString();
                currentPin = pinview.getPinResults();
                String newPin = currentPin + value;
                if (currentPin.length() < 4) {

                    pinview.setTitles(currentPin.split("",4));
                }
                if (currentPin.length() == 4){

                    Intent i = new Intent(getContext(), DashboardActivity.class);
                    startActivity(i);
                    dismiss();
                }
            }
        });
    }

    private void deleteLastNumber(PinView pinview) {
        if (currentPin.length() > 0) {
            currentPin.substring(0, currentPin.length() - 1);
            pinview.setTitles(currentPin.split(""));
        }
    }

}
