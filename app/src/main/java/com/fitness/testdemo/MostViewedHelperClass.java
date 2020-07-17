package com.fitness.testdemo;

public class MostViewedHelperClass {
    int img;
    String tit, des;

    public MostViewedHelperClass(int img, String tit, String des) {
        this.img = img;
        this.tit = tit;
        this.des = des;
    }

    public int getImg() {
        return img;
    }

    public String getTit() {
        return tit;
    }

    public String getDes() {
        return des;
    }
}
