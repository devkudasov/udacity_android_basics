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

public class MedsFragment extends Fragment {

    public MedsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add(new Item(getString(R.string.med_idealmed_title), getString(R.string.med_idealmed_link), getString(R.string.med_idealmed_address), getString(R.string.med_idealmed_phone), R.drawable.idealmed));
            items.add(new Item(getString(R.string.med_kravira_title), getString(R.string.med_kravira_link), getString(R.string.med_kravira_address), getString(R.string.med_kravira_phone), R.drawable.kravira));
            items.add(new Item(getString(R.string.med_ecomedservice_title), getString(R.string.med_ecomedservice_link), getString(R.string.med_ecomedservice_address), getString(R.string.med_ecomedservice_phone), R.drawable.ems));
        }

        ListView containerView = rootView.findViewById(R.id.list_container);
        ListAdapter listAdapter = new ListAdapter(getActivity(), items);
        containerView.setAdapter(listAdapter);

        return rootView;
    }
}