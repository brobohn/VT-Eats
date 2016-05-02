package com.cs3714.vt_eats;

import android.graphics.Color;
import android.location.Location;
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

    Location currentLocation;

    DiningHallCustomAdapter(Context context, DiningHall[] diningHalls, Location currentLocation) {
        super(context, R.layout.custom_row, diningHalls);

        this.currentLocation = currentLocation;
    }

    public void updateDistance(Location currentLocation) {

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
            openTextView.setTextColor(getContext().getResources().getColor(R.color.colorOpen));
        } else {
            openTextView.setText("Closed now.");
            openTextView.setTextColor(getContext().getResources().getColor(R.color.colorClosed));
        }

        // Display hours
        boolean isOpenToday = getItem(position).isOpenToday();
        TextView hoursTextView = (TextView) customView.findViewById(R.id.tv_hours);

        if (isOpenToday) {
            hoursTextView.setText(getItem(position).getTodaysHoursString());
        } else {
            hoursTextView.setText("Closed all day.");
        }

        // Display location
        Location otherLocation = getItem(position).getLocation();
        double distance = currentLocation.distanceTo(otherLocation);

        TextView distanceTextView = (TextView) customView.findViewById(R.id.tv_distance);

        distanceTextView.setText(String.format("%.0f meters", distance));

        return customView;

    }

}
