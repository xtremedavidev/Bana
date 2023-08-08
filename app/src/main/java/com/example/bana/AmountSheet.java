package com.example.bana;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AmountSheet  extends BottomSheetDialogFragment {

    private Activity mActivity;

    public void setActivity(Activity activity) {
        mActivity = activity;
    }


    public static AmountSheet newInstance() {
        return new AmountSheet();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_amount, container, false);


        TextView next;

        next = view.findViewById(R.id.btn_next_amount);


        next.setOnClickListener(v-> {
            TransDetailsSheet amountSheet = new TransDetailsSheet();
            amountSheet.setActivity2(this.getActivity());
            amountSheet.show(getActivity().getSupportFragmentManager(), "pinsheet");


            dismiss();
        });









        return view;
    }
}