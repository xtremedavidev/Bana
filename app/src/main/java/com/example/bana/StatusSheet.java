package com.example.bana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class StatusSheet extends BottomSheetDialogFragment {
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
        View view = inflater.inflate(R.layout.bottom_sheet_status, container, false);
        TextView next;

        next = view.findViewById(R.id.done_status_bottom);


        next.setOnClickListener(v-> {
            startActivity(new Intent(getContext(), DashboardActivity.class));
            dismiss();
        });

        return view;
    }
}