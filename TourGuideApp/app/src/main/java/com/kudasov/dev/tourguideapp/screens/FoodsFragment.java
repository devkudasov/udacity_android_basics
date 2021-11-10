package com.kudasov.dev.tourguideapp.screens;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kudasov.dev.tourguideapp.R;
import com.kudasov.dev.tourguideapp.adapters.ListAdapter;
import com.kudasov.dev.tourguideapp.Item;

import java.util.ArrayList;

public class FoodsFragment extends Fragment {

    public FoodsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add(new Item(getString(R.string.food_tokiny_title), getString(R.string.food_tokiny_link), getString(R.string.food_tokiny_address), getString(R.string.food_tokiny_phone), R.drawable.tokiny));
            items.add(new Item(getString(R.string.food_mc_title), getString(R.string.food_mc_link), getString(R.string.food_mc_address), getString(R.string.food_mc_phone), R.drawable.mc));
            items.add(new Item(getString(R.string.food_garage_title), getString(R.string.food_garage_link), getString(R.string.food_garage_address), getString(R.string.food_garage_phone), R.drawable.garage));
        }

        ListView containerView = rootView.findViewById(R.id.list_container);
        ListAdapter listAdapter = new ListAdapter(getActivity(), items);
        containerView.setAdapter(listAdapter);

        return rootView;
    }
}