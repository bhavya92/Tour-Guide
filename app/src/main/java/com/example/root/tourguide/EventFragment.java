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
public class EventFragment extends Fragment {


    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<TourList> events = new ArrayList<>();
        events.add(new TourList(getString(R.string.eventOne), getString(R.string.eventAddOne)));
        events.add(new TourList(getString(R.string.eventTwo), getString(R.string.eventAddTwo)));
        events.add(new TourList(getString(R.string.eventThree), getString(R.string.eventAddThree)));
        events.add(new TourList(getString(R.string.eventFour), getString(R.string.eventAddFour)));
        events.add(new TourList(getString(R.string.eventFive), getString(R.string.eventAddFive)));
        events.add(new TourList(getString(R.string.eventSix), getString(R.string.eventAddSix)));
        events.add(new TourList(getString(R.string.eventSeven), getString(R.string.eventAddSeven)));
        events.add(new TourList(getString(R.string.eventEight), getString(R.string.eventAddEight)));
        events.add(new TourList(getString(R.string.eventNine), getString(R.string.eventAddNine)));
        events.add(new TourList(getString(R.string.eventTen), getString(R.string.eventAddTen)));

        TourListAdapter itemsAdapter = new TourListAdapter(root_view.getContext(), events);
        ListView listView = root_view.findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), InformationActivity.class);
                intent.putExtra("information", events.get(i));
                startActivity(intent);
            }
        });
        return root_view;
    }

}