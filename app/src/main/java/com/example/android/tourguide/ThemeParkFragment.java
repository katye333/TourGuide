package com.example.android.tourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThemeParkFragment extends Fragment {


    public ThemeParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.adventure_island, R.string.tampa, R.drawable.adventure_island));
        tours.add(new Tour(R.string.busch_gardens, R.string.tampa, R.drawable.busch_gardens));
        tours.add(new Tour(R.string.disney_world, R.string.orlando, R.drawable.disney_world));
        tours.add(new Tour(R.string.sea_world, R.string.orlando, R.drawable.seaworld));
        tours.add(new Tour(R.string.legoland, R.string.orlando, R.drawable.legoland));
        tours.add(new Tour(R.string.universal_studios, R.string.orlando, R.drawable.universal_studios));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_theme_parks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
