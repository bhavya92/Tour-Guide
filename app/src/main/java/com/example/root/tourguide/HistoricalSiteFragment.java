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
public class HistoricalSiteFragment extends Fragment {


    public HistoricalSiteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<TourList> historicalSite = new ArrayList<>();
        historicalSite.add(new TourList(getString(R.string.historicalSiteOne), getString(R.string.historicalSiteAddOne), R.drawable.humayunstomb));
        historicalSite.add(new TourList(getString(R.string.historicalSiteTwo), getString(R.string.historicalSiteAddTwo), R.drawable.garden));
        historicalSite.add(new TourList(getString(R.string.historicalSiteThree), getString(R.string.historicalSiteAddThree), R.drawable.indiagate));
        historicalSite.add(new TourList(getString(R.string.historicalSiteFour), getString(R.string.historicalSiteAddFour), R.drawable.gandhismriti));
        historicalSite.add(new TourList(getString(R.string.historicalSiteFive), getString(R.string.historicalSiteAddFive), R.drawable.redfort));
        historicalSite.add(new TourList(getString(R.string.historicalSiteSix), getString(R.string.historicalSiteAddSix), R.drawable.rajghat));
        historicalSite.add(new TourList(getString(R.string.historicalSiteSeven), getString(R.string.historicalSiteAddSeven), R.drawable.puranaquila));
        historicalSite.add(new TourList(getString(R.string.historicalSiteEight), getString(R.string.historicalSiteAddEight), R.drawable.agarsenkibaoli));
        historicalSite.add(new TourList(getString(R.string.historicalSiteNine), getString(R.string.historicalSiteAddNine), R.drawable.majnukatila));
        historicalSite.add(new TourList(getString(R.string.historicalSiteTen), getString(R.string.historicalSiteAddTen), R.drawable.talkatoragarden));

        TourListAdapter itemsAdapter = new TourListAdapter(root_view.getContext(), historicalSite);
        ListView listView = root_view.findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), InformationActivity.class);
                intent.putExtra("information", historicalSite.get(i));
                startActivity(intent);
            }
        });

        return root_view;
    }

}
