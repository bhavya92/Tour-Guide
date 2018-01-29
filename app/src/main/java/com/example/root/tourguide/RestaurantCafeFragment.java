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
public class RestaurantCafeFragment extends Fragment {


    public RestaurantCafeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<TourList> cafe = new ArrayList<>();
        cafe.add(new TourList(getString(R.string.cafeOne), getString(R.string.cafeAddOne)));
        cafe.add(new TourList(getString(R.string.cafeTwo), getString(R.string.cafeAddTwo)));
        cafe.add(new TourList(getString(R.string.cafeThree), getString(R.string.cafeAddThree)));
        cafe.add(new TourList(getString(R.string.cafeFour), getString(R.string.cafeAddFour)));
        cafe.add(new TourList(getString(R.string.cafeFive), getString(R.string.cafeAddFive)));
        cafe.add(new TourList(getString(R.string.cafeSix), getString(R.string.cafeAddSix)));
        cafe.add(new TourList(getString(R.string.cafeSeven), getString(R.string.cafeAddSeven)));
        cafe.add(new TourList(getString(R.string.cafeEight), getString(R.string.cafeAddEight)));
        cafe.add(new TourList(getString(R.string.cafeNine), getString(R.string.cafeAddNine)));
        cafe.add(new TourList(getString(R.string.cafeTen), getString(R.string.cafeAddTen)));

        TourListAdapter itemsAdapter = new TourListAdapter(root_view.getContext(), cafe);
        ListView listView = root_view.findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), InformationActivity.class);
                intent.putExtra("information", cafe.get(i));
                startActivity(intent);
            }
        });


        return root_view;
    }

}
