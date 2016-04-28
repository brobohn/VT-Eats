package com.cs3714.vt_eats;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;


public class FoodInfoActivity extends Activity {

    ListView foodlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodinfo);

        String[] ABPFoodList = {"Black Angus Steak", "Classic Grilled Cheese", "Country Grilled Cheese",
                "Ham & Two Cheese", "Mayan Chicken Harvest Hot Wrap", "Newport Turkey", "Oven Hot Margherita",
                "Roasted Vegetarian Harvest Hot Wrap", "Teriyaki Steak Harvest Hot Wrap"};

        ListAdapter FoodNamesAdapter = new FoodListCustomAdapter(this, ABPFoodList);
        foodlist = (ListView) findViewById(R.id.listView2);
        foodlist.setAdapter(FoodNamesAdapter);

        foodlist.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        );

    }
}
