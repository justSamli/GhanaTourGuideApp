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


public class SightseeFragment extends Fragment {

    public SightseeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of tourist sites to visit
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.mole, R.string.moleDescription,
                R.string.moleAddress, R.string.moleContact, R.drawable.molepark));
        places.add(new Place(R.string.capecoastcastle, R.string.capecoast_Description, R.string.capecoast_Address,
                R.string.capecoast_Contact, R.drawable.capecoastcastle));
        places.add(new Place(R.string.elminacastle, R.string.elminaDescription, R.string.elminaAddress,
                R.string.elminaContact, R.drawable.elminacastle));

        // Create a {@link FragmentAdapter}, whose data source is a list of {@link Place}s.
        PlaceListAdapter adapter = new PlaceListAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        // Set color for Fragment background
        rootView.setBackgroundColor(Color.parseColor("#e8f5e9"));
        return rootView;
    }

}