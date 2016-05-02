package com.cs3714.vt_eats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by steve on 4/28/2016.
 */
public class FoodListCustomAdapter extends BaseAdapter {

    private HashMap<String, FoodItem> foodItemHashMap;
    private String[] names;
    private Context context;

    public FoodListCustomAdapter(Context context, HashMap<String, FoodItem> foodnames) {
        //super();
        this.context = context;
        this.foodItemHashMap = foodnames;
        names = foodnames.keySet().toArray(new String[foodnames.size()]);
    }

    @Override
    public int getCount() {
        return foodItemHashMap.size();
    }

    @Override
    public Object getItem(int position) {
        return foodItemHashMap.get(names[position]);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View customView = inflater.inflate(R.layout.foodname_row, parent, false);

        FoodItem foodItem = (FoodItem) getItem(position);

        TextView foodNameText = (TextView) customView.findViewById(R.id.food_name_view);
        foodNameText.setText("food item");

        return customView;
    }
}
