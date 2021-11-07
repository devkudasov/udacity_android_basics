package com.kudasov.dev.musicapp.data;

public class Album {
    private int title;
    private int year;

    public Album(int title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
