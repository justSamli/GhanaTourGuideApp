package com.example.android.ghanatouristapp;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of hotels to visit
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.goldenTulip, R.string.tulipDescription,
                R.string.tulipAddress, R.string.tulipContact, R.drawable.golden_tulip));
        places.add(new Place(R.string.zaina, R.string.zainaDescription, R.string.zainaAddress,
                R.string.zainaContact, R.drawable.zainalodge));
        places.add(new Place(R.string.kumasiTulip, R.string.kumasi_tulipDescription, R.string.kumasi_tulipAddress,
                R.string.kumasi_tulipContact, R.drawable.tulipkumasicity));

        // Create a {@link FragmentAdapter}, whose data source is a list of {@link Place}s.
        PlaceListAdapter adapter = new PlaceListAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        // Set color for Fragment background
        rootView.setBackgroundColor(Color.parseColor("#fbe9e7"));
        return rootView;
    }


}
