package com.example.bana;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyPagerAdapter extends PagerAdapter {

    private final Context context;
    private final List<SliderItem> slides;
    private final Handler handler = new Handler();
    private final Runnable runnable;
    private final long delayMs;
    private ViewPager viewPager;

    private int mCurrentPage;

    public MyPagerAdapter(Context context, List<SliderItem> slides, long delayMs) {
        this.context = context;
        this.slides = slides;
        this.delayMs = delayMs;
        this.runnable = new Runnable() {
            @Override
            public void run() {
                int currentItem = viewPager.getCurrentItem();
                int nextItem = currentItem + 1;
                if (nextItem >= slides.size()) {
                    nextItem = 0;
                }
                viewPager.setCurrentItem(nextItem, true);
                handler.postDelayed(runnable, delayMs);
            }
        };
    }

    @Override
    public int getCount() {
        return slides.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.slider_layout, container, false);

        SliderItem slide = slides.get(position);
        ImageView imageView = view.findViewById(R.id.image_view);
        TextView titleTextView = view.findViewById(R.id.title_text_view);
        TextView descriptionTextView = view.findViewById(R.id.description_text_view);

        Glide.with(context).load(slide.getImageResourceId()).into(imageView);
        titleTextView.setText(slide.getTitle());
        descriptionTextView.setText(slide.getDescription());

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
        mCurrentPage = position;
        updateIconLayout();
    }

    private void updateIconLayout() {
        ImageView icon1 = (ImageView) ((Activity) context).findViewById(R.id.icon_1);
        ImageView icon2 = (ImageView) ((Activity) context).findViewById(R.id.icon_2);
        ImageView icon3 = (ImageView) ((Activity) context).findViewById(R.id.icon_3);

        // Create the selected icon scale animation
        ObjectAnimator selectedIconScaleX = ObjectAnimator.ofFloat(icon1, "scaleX", 1f, 1.2f);
        ObjectAnimator selectedIconScaleY = ObjectAnimator.ofFloat(icon1, "scaleY", 1f, 1.2f);
        AnimatorSet selectedIconAnimator = new AnimatorSet();
        selectedIconAnimator.playTogether(selectedIconScaleX, selectedIconScaleY);

        // Create the unselected icon scale animation
        ObjectAnimator unselectedIconScaleX = ObjectAnimator.ofFloat(icon2, "scaleX", 1.2f, 1f);
        ObjectAnimator unselectedIconScaleY = ObjectAnimator.ofFloat(icon2, "scaleY", 1.2f, 1f);
        AnimatorSet unselectedIconAnimator = new AnimatorSet();
        unselectedIconAnimator.playTogether(unselectedIconScaleX, unselectedIconScaleY);


        switch (mCurrentPage) {
            case 0:
                icon1.setImageResource(R.drawable.icon_selected);
                icon2.setImageResource(R.drawable.icon_unselected);
                icon3.setImageResource(R.drawable.icon_unselected);
                selectedIconAnimator.start();
                unselectedIconAnimator.start();
                break;
            case 1:
                icon1.setImageResource(R.drawable.icon_unselected);
                icon2.setImageResource(R.drawable.icon_selected);
                icon3.setImageResource(R.drawable.icon_unselected);
                selectedIconAnimator.start();
                unselectedIconAnimator.start();
                break;
            case 2:
                icon1.setImageResource(R.drawable.icon_unselected);
                icon2.setImageResource(R.drawable.icon_unselected);
                icon3.setImageResource(R.drawable.icon_selected);
                selectedIconAnimator.start();
                unselectedIconAnimator.start();
                break;
        }
    }


        public void startAutoScroll() {
        handler.postDelayed(runnable, delayMs);
    }

    public void stopAutoScroll() {
        handler.removeCallbacks(runnable);
    }
}
