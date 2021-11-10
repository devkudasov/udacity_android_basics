package com.kudasov.dev.tourguideapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kudasov.dev.tourguideapp.R;
import com.kudasov.dev.tourguideapp.Item;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Item> {
    public ListAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Item item = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.item_image);
        TextView titleTextView = listItemView.findViewById(R.id.item_title);
        TextView addressTextView = listItemView.findViewById(R.id.item_address);

        titleTextView.setText(item.getTitle());
        addressTextView.setText(item.getAddress());

        if (item.hasImage()) {
            imageView.setImageResource(item.getLogoImageID());
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
