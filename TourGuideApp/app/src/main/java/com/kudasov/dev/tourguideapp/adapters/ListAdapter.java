package com.kudasov.dev.tourguideapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kudasov.dev.tourguideapp.R;
import com.kudasov.dev.tourguideapp.Item;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Item> {

    private Context mContext;

    public ListAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);

        mContext = context;
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
        ImageView linkImageView = listItemView.findViewById(R.id.item_link);
        ImageView phoneImageView = listItemView.findViewById(R.id.item_phone);

        titleTextView.setText(item.getTitle());
        addressTextView.setText(item.getAddress());

        linkImageView.setOnClickListener((view) -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(item.getLink()));

            try {
                mContext.startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(mContext, mContext.getString(R.string.open_intent_error_message), Toast.LENGTH_SHORT).show();
            }
        });

        phoneImageView.setOnClickListener((view) -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(item.getPhone()));

            try {
                mContext.startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(mContext, mContext.getString(R.string.open_intent_error_message), Toast.LENGTH_SHORT).show();
            }
        });

        if (item.hasImage()) {
            imageView.setImageResource(item.getLogoImageID());
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
