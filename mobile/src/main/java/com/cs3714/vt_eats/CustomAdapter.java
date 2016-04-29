package com.cs3714.vt_eats;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Stev on 4/23/16.
 */
class CustomAdapter extends ArrayAdapter<DiningHall> {

    CustomAdapter(Context context, DiningHall[] diningHalls) {

        super(context, R.layout.custom_row, diningHalls);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        // Name
        String hallName = getItem(position).getName();
        TextView DiningHallText = (TextView) customView.findViewById(R.id.tv_name);
        DiningHallText.setText(hallName);

        // Open
        boolean isOpen = getItem(position).isOpen();

        if (isOpen) {
            // TODO
        }

        // Display hours

        return customView;

    }

}
