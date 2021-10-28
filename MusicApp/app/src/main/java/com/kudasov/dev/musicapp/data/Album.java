package com.kudasov.dev.musicapp.data;

public class Album {
    private String title;
    private int year;
    private int artistId;

    public Album(String title, int year, int artistId) {
        this.title = title;
        this.year = year;
        this.artistId = artistId;
    }
}
