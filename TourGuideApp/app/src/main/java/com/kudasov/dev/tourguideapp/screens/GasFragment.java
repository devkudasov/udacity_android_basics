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

public class GasFragment extends Fragment {

    public GasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add(new Item(getString(R.string.gas_19_title), getString(R.string.gas_19_link), getString(R.string.gas_19_address), getString(R.string.gas_19_phone), R.drawable.belneft));
            items.add(new Item(getString(R.string.gas_l_1_title), getString(R.string.gas_l_1_link), getString(R.string.gas_l_1_address), getString(R.string.gas_l_1_phone), R.drawable.lukoil));
            items.add(new Item(getString(R.string.gas_a_100_19_title), getString(R.string.gas_a_100_19_link), getString(R.string.gas_a_100_19_address), getString(R.string.gas_a_100_19_phone), R.drawable.a100));
        }

        ListView containerView = rootView.findViewById(R.id.list_container);
        ListAdapter listAdapter = new ListAdapter(getActivity(), items);
        containerView.setAdapter(listAdapter);

        return rootView;
    }
}