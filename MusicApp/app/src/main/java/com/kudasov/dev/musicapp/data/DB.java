package com.kudasov.dev.musicapp.data;

import com.kudasov.dev.musicapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DB {
    private static DB instance;
    private static HashMap<Integer, Artist> artistList = new HashMap<>();
    private static HashMap<Integer, Album> albumList = new HashMap<>();
    private static Map<Integer, String> songList;

    private static Map<Integer, Integer> albumToArtistMap;
    private static Map<Integer, Integer> songToAlbumMap;
    private static Map<Integer, Integer> songToArtistMap;

    public static void init() {
        if (instance == null) instance = new DB();
    }

    private DB() {
        //region Artists
        artistList.put(13002, new Artist("Rammstein", R.drawable.rammstain));
        artistList.put(48474, new Artist("Lamb Of God", R.drawable.lamb_of_god));
        artistList.put(58469, new Artist("Twisted Sister", R.drawable.twisted_sisters));
        artistList.put(79215, new Artist("Queen", R.drawable.queen));
        artistList.put(64592, new Artist("The Offspring", R.drawable.the_offspring));
        artistList.put(3276, new Artist("Black Sabbath", R.drawable.black_sabbath));
        artistList.put(48196, new Artist("Slipknot", R.drawable.slipknot));
        artistList.put(10899, new Artist("Nightwish", R.drawable.nightwish));
        artistList.put(21213, new Artist("Accept", R.drawable.accept));
        artistList.put(36800, new Artist("Linkin Park", R.drawable.linking_pakr));
        artistList.put(11311, new Artist("Guns N' Roses", R.drawable.guns_n_roses));
        artistList.put(88514, new Artist("Iron Maiden", R.drawable.iron_maiden));
        artistList.put(9262, new Artist("Nirvana", R.drawable.nirvana));
        artistList.put(68227, new Artist("Led Zeppelin", R.drawable.led_zeppelin));
        artistList.put(344742, new Artist("Sabaton", R.drawable.sabaton));
        artistList.put(5106, new Artist("Motörhead", R.drawable.motorhead));
        artistList.put(84794, new Artist("Manowar", R.drawable.manowar));
        artistList.put(7147, new Artist("Kiss", R.drawable.kiss));
        artistList.put(46012, new Artist("ZZ Top", R.drawable.zz_top));
        artistList.put(45653, new Artist("Slayer", R.drawable.slayer));
        artistList.put(49053, new Artist("Pantera", R.drawable.pantera));
        artistList.put(64049, new Artist("Stone Sour", R.drawable.stone_sour));
        artistList.put(21618, new Artist("Rob Zombie", R.drawable.rob_zombie));
        artistList.put(3121, new Artist("Metallica", R.drawable.metallica));
        artistList.put(67437, new Artist("System of A Down", R.drawable.soad));
        artistList.put(6964, new Artist("Five Finger Death Punch", R.drawable.ffdp));
        artistList.put(191175, new Artist("AC/DC", R.drawable.ac_dc));
        //endregion Artists

        //region Albums
        albumList.put(10218099, new Album("REMIXES", 2020, 13002));
        albumList.put(7524923, new Album("RAMMSTEIN", 2019, 13002));
        albumList.put(7166038, new Album("Paris", 2017, 13002));
        albumList.put(11784552, new Album("XXI - Klavier", 2015, 13002));
        albumList.put(7166033, new Album("Made in Germany 1995–2011", 2011, 13002));
        albumList.put(9897, new Album("Liebe Ist Für Alle Da", 2009, 13002));
        albumList.put(9627, new Album("Rosenrot", 2005, 13002));
        albumList.put(9752, new Album("Reise, Reise", 2004, 13002));
        albumList.put(3542, new Album("Mutter", 2001, 13002));
        albumList.put(7166036, new Album("Live aus Berlin", 1999, 13002));
        albumList.put(7166032, new Album("Sehnsucht", 1997, 13002));
        albumList.put(12963790, new Album("Herzeleid. XXV Anniversary Edition", 1995, 13002));
        //endregion Albums
    }

    public static ArrayList<Artist> getAllArtists() {
        return new ArrayList<>(artistList.values());
    }
}