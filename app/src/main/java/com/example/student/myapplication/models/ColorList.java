package com.example.student.myapplication.models;

/**
 * Created by Student on 2017-02-09.
 */

public class ColorList {

    private String mColorList;

    public ColorList(String mColorList) {
        this.mColorList = mColorList;
    }

    public String getmColorList() {
        return mColorList;
    }

    public void setmColorList(String mColorList) {
        this.mColorList = mColorList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ColorList{");
        sb.append("mColorList='").append(mColorList).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
