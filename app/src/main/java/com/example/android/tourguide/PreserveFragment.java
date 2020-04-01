package com.example.android.tourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PreserveFragment extends Fragment {


    public PreserveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.little_manatee_park, R.string.wimauma));
        tours.add(new Tour(R.string.osprey_trail, R.string.dunedin));
        tours.add(new Tour(R.string.lettuce_lake_park, R.string.hillsborough_county));
        tours.add(new Tour(R.string.everglade_park, R.string.everglade_park));
        tours.add(new Tour(R.string.myakka_river_park, R.string.sarasota));
        tours.add(new Tour(R.string.dry_tortugas, R.string.key_west));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_nature);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
