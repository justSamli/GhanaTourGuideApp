package com.example.android.ghanatouristapp;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of shopping centres to visit
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.accra_mall, R.string.aMall_description, R.string.aMall_address,
                R.string.aMall_contact, R.drawable.accramall));
        places.add(new Place(R.string.kumasi_mall, R.string.kMall_description, R.string.kMall_address,
                R.string.kMall_contact, R.drawable.kumasicitymall));

        // Create a {@link FragmentAdapter}, whose data source is a list of {@link Place}s.
        PlaceListAdapter adapter = new PlaceListAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        // Set color for Fragment background
        rootView.setBackgroundColor(Color.parseColor("#fffde7"));
        return rootView;

    }

}
