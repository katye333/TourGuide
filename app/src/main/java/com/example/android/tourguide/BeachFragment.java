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
public class BeachFragment extends Fragment {


    public BeachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.naples_beach, R.string.naples));
        tours.add(new Tour(R.string.key_west, R.string.key_west_beach));
        tours.add(new Tour(R.string.south_beach, R.string.miami));
        tours.add(new Tour(R.string.siesta_key, R.string.siesta_key_city));
        tours.add(new Tour(R.string.clearwater_beach, R.string.clearwater));
        tours.add(new Tour(R.string.cocoa_beach, R.string.cocoa_beach_city));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_beaches);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
