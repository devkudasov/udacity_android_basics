package com.kudasov.dev.tourguideapp.screens;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kudasov.dev.tourguideapp.Item;
import com.kudasov.dev.tourguideapp.R;
import com.kudasov.dev.tourguideapp.adapters.ListAdapter;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add(new Item(getString(R.string.shop_columbia_title), getString(R.string.shop_columbia_link), getString(R.string.shop_columbia_address), getString(R.string.shop_columbia_phone)));
            items.add(new Item(getString(R.string.shop_kairos_title), getString(R.string.shop_kairos_link), getString(R.string.shop_kairos_address), getString(R.string.shop_kairos_phone)));
            items.add(new Item(getString(R.string.shop_love_weekend_title), getString(R.string.shop_love_weekend_link), getString(R.string.shop_love_weekend_address), getString(R.string.shop_love_weekend_phone)));
        }

        ListView containerView = rootView.findViewById(R.id.list_container);
        ListAdapter listAdapter = new ListAdapter(getActivity(), items);
        containerView.setAdapter(listAdapter);

        return rootView;
    }
}