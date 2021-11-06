package com.kudasov.dev.musicapp.data;

import com.kudasov.dev.musicapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DB {
    private static DB instance;
    private static HashMap<Integer, Artist> artistList = new HashMap<>();

    public static void init() {
        if (instance == null) instance = new DB();
    }

    private DB() {
        // region Rammstein
        Artist rammstein = new Artist(1, "Rammstein", R.drawable.rammstain);
        rammstein.addAlbum(new Album("REMIXES", 2020));
        rammstein.addAlbum(new Album("RAMMSTEIN", 2019));
        rammstein.addAlbum(new Album("Paris", 2017));
        rammstein.addAlbum(new Album("XXI - Klavier", 2015));
        rammstein.addAlbum(new Album("Made in Germany 1995–2011", 2011));
        rammstein.addAlbum(new Album("Liebe Ist Für Alle Da", 2009));
        rammstein.addAlbum(new Album("Rosenrot", 2005));
        rammstein.addAlbum(new Album("Reise, Reise", 2004));
        rammstein.addAlbum(new Album("Mutter", 2001));
        rammstein.addAlbum(new Album("Live aus Berlin", 1999));
        rammstein.addAlbum(new Album("Sehnsucht", 1997));
        rammstein.addAlbum(new Album("Herzeleid. XXV Anniversary Edition", 1995));
        // endregion Rammstein

        // region Queen
        Artist queen = new Artist(2, "Queen", R.drawable.queen);
        queen.addAlbum(new Album("Queen", 1973));
        queen.addAlbum(new Album("Queen II", 1974));
        queen.addAlbum(new Album("Sheer Heart Attack", 1974));
        queen.addAlbum(new Album("A Night At the Opera", 1975));
        queen.addAlbum(new Album("A Day At The Race", 1976));
        queen.addAlbum(new Album("News Of The World", 1977));
        queen.addAlbum(new Album("Jazz", 1978));
        queen.addAlbum(new Album("The Game", 1980));
        queen.addAlbum(new Album("Hot Space", 1982));
        queen.addAlbum(new Album("The Works", 1984));
        queen.addAlbum(new Album("A Kind Of Magic", 1986));
        queen.addAlbum(new Album("The Miracle", 1989));
        queen.addAlbum(new Album("Innuendo", 1991));
        queen.addAlbum(new Album("Made In Heaven", 1995));
        // endregion Queen

        // region Black Sabbath
        Artist blackSabbath = new Artist(3, "Black Sabbath", R.drawable.black_sabbath);
        blackSabbath.addAlbum(new Album("Paranoid", 1970));
        blackSabbath.addAlbum(new Album("Master Of Reality", 1971));
        blackSabbath.addAlbum(new Album("Sabbath Bloody Sabbath", 1973));
        blackSabbath.addAlbum(new Album("Sabotage", 1975));
        blackSabbath.addAlbum(new Album("Never Say Die!", 1978));
        blackSabbath.addAlbum(new Album("Heaven&Hell", 1980));
        blackSabbath.addAlbum(new Album("Born Again", 1983));
        blackSabbath.addAlbum(new Album("The Eternal Idol", 1987));
        // endregion Black Sabbath

        // region Accept
        Artist accept = new Artist(4, "Accept", R.drawable.accept);
        accept.addAlbum(new Album("Restless And Wild", 1982));
        accept.addAlbum(new Album("Balls To The Wall", 1983));
        accept.addAlbum(new Album("Metal Heart", 1985));
        accept.addAlbum(new Album("Russian Roulette", 1986));
        accept.addAlbum(new Album("Eat The Heat", 1989));
        accept.addAlbum(new Album("Death Row", 1994));
        accept.addAlbum(new Album("Predator", 1996));
        accept.addAlbum(new Album("Symphonic Terror", 2018));
        // endregion Accept

        // region Iron Maiden
        Artist ironMaiden = new Artist(5, "Iron Maiden", R.drawable.iron_maiden);
        ironMaiden.addAlbum(new Album("Iron Maiden", 1980));
        ironMaiden.addAlbum(new Album("Killers", 1981));
        ironMaiden.addAlbum(new Album("The Number Of The Beast", 1982));
        ironMaiden.addAlbum(new Album("Peace Of Mind", 1983));
        ironMaiden.addAlbum(new Album("Powerslave", 1984));
        ironMaiden.addAlbum(new Album("Live After Death", 1985));
        ironMaiden.addAlbum(new Album("Somewhere In Time", 1986));
        ironMaiden.addAlbum(new Album("Seventh Sons Of A Seventh...", 1988));
        ironMaiden.addAlbum(new Album("Fear Of The Dark", 1992));
        ironMaiden.addAlbum(new Album("The X Factor", 1995));
        ironMaiden.addAlbum(new Album("Virtual XI", 1998));
        ironMaiden.addAlbum(new Album("Brave New World", 2000));
        // endregion Iron Maiden

        // region Slayer
        Artist slayer = new Artist(6, "Slayer", R.drawable.slayer);
        slayer.addAlbum(new Album("Show No Mercy", 1983));
        slayer.addAlbum(new Album("Hell Awaits", 1985));
        slayer.addAlbum(new Album("Reign In Blood", 1986));
        slayer.addAlbum(new Album("South Of Heaven", 1988));
        slayer.addAlbum(new Album("Seasons In The Abyss", 1990));
        slayer.addAlbum(new Album("Divine Intervention", 1994));
        slayer.addAlbum(new Album("Undisputed Attitude", 1996));
        slayer.addAlbum(new Album("Diabolus In Musika", 1998));
        slayer.addAlbum(new Album("God Hates Us All", 2001));
        slayer.addAlbum(new Album("Christ Illusion", 2006));
        // endregion Slayer

        // region Pantera
        Artist pantera = new Artist(7, "Pantera", R.drawable.pantera);
        pantera.addAlbum(new Album("Cowboys From Hell", 1990));
        pantera.addAlbum(new Album("Vulgar Display Of Power", 1992));
        pantera.addAlbum(new Album("Far Beyond Driven", 1994));
        pantera.addAlbum(new Album("The Great Southern Trendkill", 1996));
        pantera.addAlbum(new Album("Hole In The Sky", 2000));
        // endregion Pantera

        // region Metallica
        Artist metallica = new Artist(8, "Metallica", R.drawable.metallica);
        metallica.addAlbum(new Album("Kill 'Em All", 1983));
        metallica.addAlbum(new Album("Ride The Lightning", 1984));
        metallica.addAlbum(new Album("Master Of Puppets", 1986));
        metallica.addAlbum(new Album("...And Justice For All", 1988));
        metallica.addAlbum(new Album("Metallica", 1991));
        metallica.addAlbum(new Album("Load", 1996));
        metallica.addAlbum(new Album("Reload", 1997));
        metallica.addAlbum(new Album("Garage Inc.", 1998));
        metallica.addAlbum(new Album("S&M", 1999));
        metallica.addAlbum(new Album("St. Anger", 2003));
        metallica.addAlbum(new Album("Some Kind Of Monster", 2004));
        metallica.addAlbum(new Album("Death Magnetic", 2008));
        metallica.addAlbum(new Album("Beyond Magnetic", 2011));
        metallica.addAlbum(new Album("Lulu", 2011));
        // endregion Metallica

        // region AC/DC
        Artist acDc = new Artist(9, "AC/DC", R.drawable.ac_dc);
        acDc.addAlbum(new Album("High Voltage", 1976));
        acDc.addAlbum(new Album("Dirty Deeds Done Dirt Cheap", 1976));
        acDc.addAlbum(new Album("Let There Be Rock", 1977));
        acDc.addAlbum(new Album("Powerage", 1978));
        acDc.addAlbum(new Album("Highway To Hell", 1979));
        acDc.addAlbum(new Album("Back In Black", 1980));
        acDc.addAlbum(new Album("Flick Of The Switch", 1983));
        acDc.addAlbum(new Album("'74 Jailbreak", 1984));
        acDc.addAlbum(new Album("Fly On The Wall", 1985));
        acDc.addAlbum(new Album("Who Made Who", 1986));
        acDc.addAlbum(new Album("Blow Up Your Video", 1988));
        acDc.addAlbum(new Album("The Razors Edge", 1990));
        acDc.addAlbum(new Album("Ballbreaker", 1995));
        acDc.addAlbum(new Album("Bonfire", 1997));
        // endregion AC/DC

        // region Artists
        artistList.put(rammstein.getId(), rammstein);
        artistList.put(queen.getId(), queen);
        artistList.put(blackSabbath.getId(), blackSabbath);
        artistList.put(accept.getId(), accept);
        artistList.put(ironMaiden.getId(), ironMaiden);
        artistList.put(slayer.getId(), slayer);
        artistList.put(pantera.getId(), pantera);
        artistList.put(metallica.getId(), metallica);
        artistList.put(acDc.getId(), acDc);
        // endregion Artists
    }

    public static ArrayList<Artist> getAllArtists() {
        return new ArrayList<>(artistList.values());
    }

    public static Artist getArtistById(int id) {
        return artistList.get(id);
    }
}