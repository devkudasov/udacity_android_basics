package com.kudasov.dev.musicapp.data;

public class Artist {
    private String name;
    private int image;

    public Artist(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}

