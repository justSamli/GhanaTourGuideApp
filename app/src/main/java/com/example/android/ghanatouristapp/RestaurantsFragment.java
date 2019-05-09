package com.example.android.ghanatouristapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of restaurants to visit
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.azmera, R.string.azmera_description, R.string.azmera_address,
                R.string.azmera_contact, R.drawable.azmera));
        places.add(new Place(R.string.ikecafe, R.string.ikecafe_description, R.string.ikecafe_address,
                R.string.ikecafe_contact, R.drawable.ikescafe));

        // Create a {@link FragmentAdapter}, whose data source is a list of {@link Place}s.
        PlaceListAdapter adapter = new PlaceListAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        // Set color for Fragment background
        rootView.setBackgroundColor(Color.parseColor("#e0f2f1"));
        return rootView;
    }


}
