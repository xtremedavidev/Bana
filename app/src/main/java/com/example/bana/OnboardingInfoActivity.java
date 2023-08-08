package com.example.bana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class OnboardingInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_info);


        ViewPager viewPager = findViewById(R.id.onboard_vp);
        List<SliderItem> slides = new ArrayList<>();

        TextView login = findViewById(R.id.onboardnextbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OnboardingInfoActivity.this, DashboardActivity.class));
            }
        });

        String[] titles = new String[3];
        String[] description = new String[3];

        titles[0] = "Go Cashless with Bana";
        titles[1] = "Pay for your rides via QR code";
        titles[2] = "Get your First 2 rides free around campus ";

       description[0] = "Scan the QR code and pay for your transport conveniently, " +
                "securely, and quickly without worrying about carrying cash or card";
        description[1] = "Scan the QR code and pay for your transport conveniently, " +
                "securely, and quickly without worrying about carrying cash or card";
        description[2] = "Scan the QR code and pay for your transport conveniently, " +
                "securely, and quickly without worrying about carrying cash or card";

// Add your slide data to the list here
        slides.add(new SliderItem(R.drawable.illus1, titles[0], description[0]));
        slides.add(new SliderItem(R.drawable.illus2, titles[1], description[1]));
        slides.add(new SliderItem(R.drawable.illus3, titles[2], description[2]));


        MyPagerAdapter adapter = new MyPagerAdapter(this, slides, 3000);
        viewPager.setAdapter(adapter);
    }
}