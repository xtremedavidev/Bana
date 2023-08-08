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

public class TransDetailsSheet extends BottomSheetDialogFragment {
    private Activity mActivity;

    public void setActivity2(Activity activity) {
        mActivity = activity;
    }

    public static StatusSheet newInstance() {
        return new StatusSheet();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_trans_details, container, false);



        TextView next;

        next = view.findViewById(R.id.pay_trans);


        next.setOnClickListener(v-> {
            StatusSheet amountSheet = new StatusSheet();
            amountSheet.setActivity2(this.getActivity());
            amountSheet.show(getActivity().getSupportFragmentManager(), "pinsheet");


            dismiss();
        });

        return view;
    }
}