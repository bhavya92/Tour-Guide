package com.example.root.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<TourList> hotel = new ArrayList<>();
        hotel.add(new TourList(getString(R.string.hotelOne), getString(R.string.hotelAddOne)));
        hotel.add(new TourList(getString(R.string.hotelTwo), getString(R.string.hotelAddTwo)));
        hotel.add(new TourList(getString(R.string.hotelThree), getString(R.string.hotelAddThree)));
        hotel.add(new TourList(getString(R.string.hotelFour), getString(R.string.hotelAddFour)));
        hotel.add(new TourList(getString(R.string.hotelFive), getString(R.string.hotelAddFive)));
        hotel.add(new TourList(getString(R.string.hotelSix), getString(R.string.hotelAddSix)));
        hotel.add(new TourList(getString(R.string.hotelSeven), getString(R.string.hotelAddSeven)));
        hotel.add(new TourList(getString(R.string.hotelEight), getString(R.string.hotelAddEight)));
        hotel.add(new TourList(getString(R.string.hotelNine), getString(R.string.hotelAddNine)));
        hotel.add(new TourList(getString(R.string.hotelTen), getString(R.string.hotelAddTen)));

        TourListAdapter itemsAdapter = new TourListAdapter(root_view.getContext(), hotel);
        ListView listView = root_view.findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), InformationActivity.class);
                intent.putExtra("information", hotel.get(i));
                startActivity(intent);
            }
        });

        return root_view;
    }

}
