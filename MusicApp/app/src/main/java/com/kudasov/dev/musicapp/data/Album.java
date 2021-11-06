package com.kudasov.dev.musicapp.data;

public class Album {
    private String title;
    private int year;

    public Album(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
