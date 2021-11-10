package com.kudasov.dev.eqrthquake.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

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
        magnitudeTextView.setText(String.valueOf(earthquake.getMagnitude()));

        GradientDrawable circle = (GradientDrawable) magnitudeTextView.getBackground();
        circle.setColor(getMagnitudeColor(earthquake.getMagnitude()));

        TextView locationTextView = listItemView.findViewById(R.id.location);
        locationTextView.setText(earthquake.getLocation());

        TextView placeTextView = listItemView.findViewById(R.id.place);
        placeTextView.setText(earthquake.getPlace());

        TextView dateTextView = listItemView.findViewById(R.id.date);
        dateTextView.setText(earthquake.getDate());

        TextView timeTextView = listItemView.findViewById(R.id.time);
        timeTextView.setText(earthquake.getTime());

        listItemView.setOnClickListener((view) -> {
            try {
                getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(earthquake.getUrl())));
            } catch (Exception e) {
                Toast.makeText(getContext(), "Something goes wrong", Toast.LENGTH_SHORT).show();
            }
        });

        return listItemView;
    }

    private int getMagnitudeColor(double magnitude) {
        switch ((int) magnitude) {
            case 1:
                return ContextCompat.getColor(getContext(), R.color.magnitude1);
            case 2:
                return ContextCompat.getColor(getContext(), R.color.magnitude2);
            case 3:
                return ContextCompat.getColor(getContext(), R.color.magnitude3);
            case 4:
                return ContextCompat.getColor(getContext(), R.color.magnitude4);
            case 5:
                return ContextCompat.getColor(getContext(), R.color.magnitude5);
            case 6:
                return ContextCompat.getColor(getContext(), R.color.magnitude6);
            case 7:
                return ContextCompat.getColor(getContext(), R.color.magnitude7);
            case 8:
                return ContextCompat.getColor(getContext(), R.color.magnitude8);
            case 9:
                return ContextCompat.getColor(getContext(), R.color.magnitude9);
            default:
                return ContextCompat.getColor(getContext(), R.color.magnitude10plus);
        }
    }
}
