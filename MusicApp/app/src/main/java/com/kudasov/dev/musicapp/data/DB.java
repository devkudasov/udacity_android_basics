package com.kudasov.dev.musicapp.data;

import com.kudasov.dev.musicapp.R;

import java.util.ArrayList;
import java.util.HashMap;

public class DB {
    private static DB instance;
    private static HashMap<Integer, Artist> artistList = new HashMap<>();

    public static void init() {
        if (instance == null) instance = new DB();
    }

    private DB() {
        // region Rammstein
        Artist rammstein = new Artist(1, R.string.rammstein, R.drawable.rammstain);
        rammstein.addAlbum(new Album(R.string.rammstein_2020, 2020));
        rammstein.addAlbum(new Album(R.string.rammstein_2019, 2019));
        rammstein.addAlbum(new Album(R.string.rammstein_2017, 2017));
        rammstein.addAlbum(new Album(R.string.rammstein_2015, 2015));
        rammstein.addAlbum(new Album(R.string.rammstein_2011, 2011));
        rammstein.addAlbum(new Album(R.string.rammstein_2009, 2009));
        rammstein.addAlbum(new Album(R.string.rammstein_2005, 2005));
        rammstein.addAlbum(new Album(R.string.rammstein_2004, 2004));
        rammstein.addAlbum(new Album(R.string.rammstein_2001, 2001));
        rammstein.addAlbum(new Album(R.string.rammstein_1999, 1999));
        rammstein.addAlbum(new Album(R.string.rammstein_1997, 1997));
        rammstein.addAlbum(new Album(R.string.rammstein_1995, 1995));
        // endregion Rammstein

        // region Queen
        Artist queen = new Artist(2, R.string.queen, R.drawable.queen);
        queen.addAlbum(new Album(R.string.queen_1973, 1973));
        queen.addAlbum(new Album(R.string.queen_1974, 1974));
        queen.addAlbum(new Album(R.string.queen_1975, 1975));
        queen.addAlbum(new Album(R.string.queen_1976, 1976));
        queen.addAlbum(new Album(R.string.queen_1977, 1977));
        queen.addAlbum(new Album(R.string.queen_1978, 1978));
        queen.addAlbum(new Album(R.string.queen_1980, 1980));
        queen.addAlbum(new Album(R.string.queen_1982, 1982));
        queen.addAlbum(new Album(R.string.queen_1984, 1984));
        queen.addAlbum(new Album(R.string.queen_1986, 1986));
        queen.addAlbum(new Album(R.string.queen_1989, 1989));
        queen.addAlbum(new Album(R.string.queen_1991, 1991));
        queen.addAlbum(new Album(R.string.queen_1995, 1995));
        // endregion Queen

        // region Black Sabbath
        Artist blackSabbath = new Artist(3, R.string.black_sabbath, R.drawable.black_sabbath);
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1970, 1970));
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1971, 1971));
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1973, 1973));
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1975, 1975));
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1978, 1978));
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1980, 1980));
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1983, 1983));
        blackSabbath.addAlbum(new Album(R.string.black_sabbath_1987, 1987));
        // endregion Black Sabbath

        // region Accept
        Artist accept = new Artist(4, R.string.accept, R.drawable.accept);
        accept.addAlbum(new Album(R.string.accept_1982, 1982));
        accept.addAlbum(new Album(R.string.accept_1983, 1983));
        accept.addAlbum(new Album(R.string.accept_1985, 1985));
        accept.addAlbum(new Album(R.string.accept_1986, 1986));
        accept.addAlbum(new Album(R.string.accept_1989, 1989));
        accept.addAlbum(new Album(R.string.accept_1994, 1994));
        accept.addAlbum(new Album(R.string.accept_1996, 1996));
        accept.addAlbum(new Album(R.string.accept_2018, 2018));
        // endregion Accept

        // region Iron Maiden
        Artist ironMaiden = new Artist(5, R.string.iron_maiden, R.drawable.iron_maiden);
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1980, 1980));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1981, 1981));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1982, 1982));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1983, 1983));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1984, 1984));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1985, 1985));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1986, 1986));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1988, 1988));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1992, 1992));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1995, 1995));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_1998, 1998));
        ironMaiden.addAlbum(new Album(R.string.iron_maiden_2000, 2000));
        // endregion Iron Maiden

        // region Slayer
        Artist slayer = new Artist(6, R.string.slayer, R.drawable.slayer);
        slayer.addAlbum(new Album(R.string.slayer_1983, 1983));
        slayer.addAlbum(new Album(R.string.slayer_1985, 1985));
        slayer.addAlbum(new Album(R.string.slayer_1986, 1986));
        slayer.addAlbum(new Album(R.string.slayer_1988, 1988));
        slayer.addAlbum(new Album(R.string.slayer_1990, 1990));
        slayer.addAlbum(new Album(R.string.slayer_1994, 1994));
        slayer.addAlbum(new Album(R.string.slayer_1996, 1996));
        slayer.addAlbum(new Album(R.string.slayer_1998, 1998));
        slayer.addAlbum(new Album(R.string.slayer_2001, 2001));
        slayer.addAlbum(new Album(R.string.slayer_2006, 2006));
        // endregion Slayer

        // region Pantera
        Artist pantera = new Artist(7, R.string.pantera, R.drawable.pantera);
        pantera.addAlbum(new Album(R.string.pantera_1990, 1990));
        pantera.addAlbum(new Album(R.string.pantera_1992, 1992));
        pantera.addAlbum(new Album(R.string.pantera_1994, 1994));
        pantera.addAlbum(new Album(R.string.pantera_1996, 1996));
        pantera.addAlbum(new Album(R.string.pantera_2000, 2000));
        // endregion Pantera

        // region Metallica
        Artist metallica = new Artist(8, R.string.metallica, R.drawable.metallica);
        metallica.addAlbum(new Album(R.string.metallica_1983, 1983));
        metallica.addAlbum(new Album(R.string.metallica_1984, 1984));
        metallica.addAlbum(new Album(R.string.metallica_1986, 1986));
        metallica.addAlbum(new Album(R.string.metallica_1988, 1988));
        metallica.addAlbum(new Album(R.string.metallica_1991, 1991));
        metallica.addAlbum(new Album(R.string.metallica_1996, 1996));
        metallica.addAlbum(new Album(R.string.metallica_1997, 1997));
        metallica.addAlbum(new Album(R.string.metallica_1998, 1998));
        metallica.addAlbum(new Album(R.string.metallica_1999, 1999));
        metallica.addAlbum(new Album(R.string.metallica_2003, 2003));
        metallica.addAlbum(new Album(R.string.metallica_2004, 2004));
        metallica.addAlbum(new Album(R.string.metallica_2008, 2008));
        metallica.addAlbum(new Album(R.string.metallica_2011, 2011));
        // endregion Metallica

        // region AC/DC
        Artist acDc = new Artist(9, R.string.ac_dc, R.drawable.ac_dc);
        acDc.addAlbum(new Album(R.string.ac_dc_1976, 1976));
        acDc.addAlbum(new Album(R.string.ac_dc_1977, 1977));
        acDc.addAlbum(new Album(R.string.ac_dc_1978, 1978));
        acDc.addAlbum(new Album(R.string.ac_dc_1979, 1979));
        acDc.addAlbum(new Album(R.string.ac_dc_1980, 1980));
        acDc.addAlbum(new Album(R.string.ac_dc_1983, 1983));
        acDc.addAlbum(new Album(R.string.ac_dc_1984, 1984));
        acDc.addAlbum(new Album(R.string.ac_dc_1985, 1985));
        acDc.addAlbum(new Album(R.string.ac_dc_1986, 1986));
        acDc.addAlbum(new Album(R.string.ac_dc_1988, 1988));
        acDc.addAlbum(new Album(R.string.ac_dc_1990, 1990));
        acDc.addAlbum(new Album(R.string.ac_dc_1995, 1995));
        acDc.addAlbum(new Album(R.string.ac_dc_1997, 1997));
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