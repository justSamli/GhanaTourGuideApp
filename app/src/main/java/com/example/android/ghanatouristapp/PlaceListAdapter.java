package com.example.android.ghanatouristapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceListAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceListAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places  is the list of {@link Place} to be displayed.
     */
    public PlaceListAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID placeName
        TextView placeName = (TextView) listItemView.findViewById(R.id.placeName);
        placeName.setText(currentLocation.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID placeDescription.
        TextView placeDescription = (TextView) listItemView.findViewById(R.id.placeDescription);
        placeDescription.setText(currentLocation.getPlaceDescription());

        // Find the TextView in the list_item.xml layout with the ID placeAddress.
        TextView placeAddress = (TextView) listItemView.findViewById(R.id.placeAddress);
        placeAddress.setText(currentLocation.getPlaceAddress());

        // Find the TextView in the list_item.xml layout with the ID placeContact.
        TextView placeContact = (TextView) listItemView.findViewById(R.id.placeContact);
        placeContact.setText(currentLocation.getPlaceContact());

        // Find the ImageView in the list_item.xml layout with the ID placeImage.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.placeImage);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentLocation.getImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }
}
