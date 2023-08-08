package com.example.bana;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ConfirmWithdrawSheet extends BottomSheetDialogFragment {
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
        View view = inflater.inflate(R.layout.bottom_sheet_confirm_withdraw, container, false);


        return view;
    }
}
