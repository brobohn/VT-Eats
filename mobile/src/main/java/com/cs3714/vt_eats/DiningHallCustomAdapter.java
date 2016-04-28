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
class DiningHallCustomAdapter extends ArrayAdapter<String> {


    DiningHallCustomAdapter(Context context, String[] DiningHalls) {

        super(context, R.layout.custom_row, DiningHalls);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        String singleDiningHall = getItem(position);
        TextView DiningHallText = (TextView) customView.findViewById(R.id.textView);

        DiningHallText.setText(singleDiningHall);

        return customView;

    }

}
