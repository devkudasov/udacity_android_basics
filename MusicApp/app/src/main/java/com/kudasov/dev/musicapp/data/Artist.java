package com.kudasov.dev.musicapp.data;

import java.util.ArrayList;

public class Artist {
    private int id;
    private int name;
    private int image;
    private ArrayList<Album> albums = new ArrayList<>();

    public Artist(int id, int name, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
}

