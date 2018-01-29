package com.example.root.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 1/22/18.
 */

public class TourListAdapter extends ArrayAdapter<TourList> {

    public TourListAdapter(@NonNull Context context, ArrayList<TourList> t) {
        super(context, 0, t);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        TourList t = getItem(position);
        TextView placeNameTextView = convertView.findViewById(R.id.placeName);
        placeNameTextView.setText(t.getPlaceName());

        TextView placeAddressTextView = convertView.findViewById(R.id.placeAddress);
        placeAddressTextView.setText(t.getPlaceAddress());

        ImageView imageView = convertView.findViewById(R.id.image);

        if (t.hasImageId()) {
            imageView.setImageResource(t.getImageID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return convertView;
    }

}
