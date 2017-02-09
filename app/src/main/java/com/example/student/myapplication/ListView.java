package com.example.student.myapplication;

/**
 * Created by Student on 2017-02-07.
 */

public class ListView {

    private int title;
    private int Contents;

    public ListView(int title, int contents) {
        this.title = title;
        Contents = contents;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getContents() {
        return Contents;
    }

    public void setContents(int contents) {
        Contents = contents;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListView{");
        sb.append("title=").append(title);
        sb.append(", Contents=").append(Contents);
        sb.append('}');
        return sb.toString();
    }
}
