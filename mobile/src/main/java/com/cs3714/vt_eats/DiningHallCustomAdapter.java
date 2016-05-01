package com.cs3714.vt_eats;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Stev on 4/23/16.
 */
class DiningHallCustomAdapter extends ArrayAdapter<DiningHall> {

    DiningHallCustomAdapter(Context context, DiningHall[] diningHalls) {

        super(context, R.layout.custom_row, diningHalls);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        // Name
        String hallName = getItem(position).getName();
        TextView nameTextView = (TextView) customView.findViewById(R.id.tv_name);
        nameTextView.setText(hallName);

        // Open
        boolean isOpenNow = getItem(position).isOpenNow();
        TextView openTextView = (TextView) customView.findViewById(R.id.tv_open);
        if (isOpenNow) {
            openTextView.setText("Open now!");
        } else {
            openTextView.setText("Closed now.");
        }

        // Display hours
        boolean isOpenToday = getItem(position).isOpenToday();
        TextView hoursTextView = (TextView) customView.findViewById(R.id.tv_hours);

        if (isOpenToday) {
            hoursTextView.setText(getItem(position).getTodaysHoursString());
        } else {
            hoursTextView.setText("Closed all day.");
        }

        return customView;

    }

}
