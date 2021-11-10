package com.kudasov.dev.eqrthquake.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kudasov.dev.eqrthquake.R;
import com.kudasov.dev.eqrthquake.models.Earthquake;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_item, parent, false);
        }

        Earthquake earthquake = getItem(position);

        TextView magnitudeTextView = listItemView.findViewById(R.id.magnitude);
        TextView locationTextView = listItemView.findViewById(R.id.location);
        TextView dateTextView = listItemView.findViewById(R.id.date);

        magnitudeTextView.setText(earthquake.getMagnitude());
        locationTextView.setText(earthquake.getLocation());
        dateTextView.setText(earthquake.getDate().toString());

        return listItemView;
    }
}
