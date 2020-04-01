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
public class SpringFragment extends Fragment {


    public SpringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.weeki_wachee_springs, R.string.weeki_wachee));
        tours.add(new Tour(R.string.rock_springs, R.string.apopka));
        tours.add(new Tour(R.string.wekiwa_springs, R.string.apopka));
        tours.add(new Tour(R.string.rainbow_springs, R.string.dunnellon));
        tours.add(new Tour(R.string.three_sister_springs, R.string.crystal_river));
        tours.add(new Tour(R.string.ginnie_springs, R.string.high_springs));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_springs);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
