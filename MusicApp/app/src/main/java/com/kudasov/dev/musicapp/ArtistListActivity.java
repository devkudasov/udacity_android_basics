package com.kudasov.dev.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.kudasov.dev.musicapp.adapters.ArtistAdapter;
import com.kudasov.dev.musicapp.data.DB;

public class ArtistListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);

        DB.init();

        ArtistAdapter adapter = new ArtistAdapter(this, DB.getAllArtists());
        GridView view = findViewById(R.id.grid_artists);
        view.setAdapter(adapter);
    }
}