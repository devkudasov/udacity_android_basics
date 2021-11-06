package com.kudasov.dev.musicapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kudasov.dev.musicapp.AlbumListActivity;
import com.kudasov.dev.musicapp.R;
import com.kudasov.dev.musicapp.data.Artist;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {
    public ArtistAdapter(Activity activity, ArrayList<Artist> artists) {
        super(activity, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_item, parent, false);
        }

        Artist artist = getItem(position);

        TextView nameView = listItemView.findViewById(R.id.artist_name);
        nameView.setText(artist.getName());

        ImageView imageView = listItemView.findViewById(R.id.artist_logo);
        imageView.setImageResource(artist.getImage());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getContext();
                Intent intent = new Intent(context, AlbumListActivity.class);
                intent.putExtra(context.getString(R.string.intent_extra_artist_id), artist.getId());
                context.startActivity(intent);
            }
        });

        return listItemView;
    }
}
