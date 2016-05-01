package com.cs3714.vt_eats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by steve on 4/28/2016.
 */
public class FoodListCustomAdapter extends ArrayAdapter<String> {

    FoodListCustomAdapter(Context context, String[] foodnames) {

        super(context, R.layout.foodname_row, foodnames);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.foodname_row, parent, false);

        String foodname = getItem(position);
        TextView FoodnNameText = (TextView) customView.findViewById(R.id.textView34);

        FoodnNameText.setText(foodname);

        return customView;
    }

}
