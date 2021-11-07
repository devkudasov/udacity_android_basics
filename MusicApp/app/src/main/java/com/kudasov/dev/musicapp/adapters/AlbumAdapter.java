package com.kudasov.dev.musicapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kudasov.dev.musicapp.R;
import com.kudasov.dev.musicapp.data.Album;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {
    public AlbumAdapter(Activity activity, ArrayList<Album> albums) {
        super(activity, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);
        }

        Album album = getItem(position);

        TextView albumTitleView = listItemView.findViewById(R.id.album_title);
        albumTitleView.setText(getContext().getString(album.getTitle()));

        TextView albumYearView = listItemView.findViewById(R.id.album_year);
        albumYearView.setText(String.valueOf(album.getYear()));

        return listItemView;
    }
}
