package com.kudasov.dev.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.kudasov.dev.musicapp.adapters.AlbumAdapter;
import com.kudasov.dev.musicapp.data.Artist;
import com.kudasov.dev.musicapp.data.DB;

public class AlbumListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);

        int artistId = getIntent().getIntExtra(getString(R.string.intent_extra_artist_id), 0);

        if (artistId != 0) {
            Artist artist = DB.getArtistById(artistId);
            TextView textView = findViewById(R.id.artist_top_name);
            textView.setText(artist.getName());
            ImageView imageView = findViewById(R.id.artist_top_logo);
            imageView.setImageResource(artist.getImage());

            AlbumAdapter adapter = new AlbumAdapter(this, artist.getAlbums());
            ListView view = findViewById(R.id.album_list);
            view.setAdapter(adapter);
        }
    }
}