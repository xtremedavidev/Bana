package com.example.bana;
public class SliderItem {
    private int imageResourceId;
    private String title;
    private String description;

    public SliderItem(int imageResourceId, String title, String description) {
        this.imageResourceId = imageResourceId;
        this.title = title;
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
