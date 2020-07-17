package com.fitness.testdemo;

import android.graphics.drawable.GradientDrawable;


public class CategoriesHelperClass {
    int imagec;
    String titlec;
    GradientDrawable rlayout;

    public CategoriesHelperClass(int imagec, String titlec, GradientDrawable rlayout) {
        this.imagec = imagec;
        this.titlec = titlec;
        this.rlayout = rlayout;
    }

    public int getImagec() {
        return imagec;
    }

    public String getTitlec() {
        return titlec;
    }

    public GradientDrawable getRlayout() {
        return rlayout;
    }
}
