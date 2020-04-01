package com.example.android.tourguide;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {
    private int mColorResourceId;

    public TourAdapter(Context context, ArrayList<Tour> tours, int colorResourceId) {
        super(context, 0, tours);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentTour = getItem(position);
        View container = listItemView.findViewById(R.id.container);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentTour.getNameOfPlace());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentTour.getLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentTour.hasImage()) {
            imageView.setImageResource(currentTour.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
            container.setMinimumHeight(200);

        } else {
            imageView.setVisibility(View.GONE);
            container.setMinimumHeight(88);
        }

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
