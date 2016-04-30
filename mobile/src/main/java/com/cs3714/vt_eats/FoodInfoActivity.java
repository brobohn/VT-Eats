package com.cs3714.vt_eats;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;


public class FoodInfoActivity extends AppCompatActivity {

    ListView foodlist;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodinfo);

        // Toolbar is defined in the layout file
    /*    Toolbar myToolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolBar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true); */

        Intent intent = getIntent();
        int defaultValue = 0;
        int DiningHallSelected = intent.getIntExtra("DINING_HALL_SELECTION", defaultValue);

        String[] ABPFoodList = {"Black Angus Steak", "Classic Grilled Cheese", "Country Grilled Cheese",
                "Ham & Two Cheese", "Mayan Chicken Harvest Hot Wrap", "Newport Turkey", "Oven Hot Margherita",
                "Roasted Vegetarian Harvest Hot Wrap", "Teriyaki Steak Harvest Hot Wrap"};

        iv = (ImageView) findViewById(R.id.imageView);

        switch (DiningHallSelected) {

            case 0:  iv.setImageResource(R.drawable.abp);
                break;
            case 1:  iv.setImageResource(R.drawable.abp);
                break;
            case 2:  iv.setImageResource(R.drawable.abp);
                break;
            case 3:  iv.setImageResource(R.drawable.abp);
                break;
            case 4:  iv.setImageResource(R.drawable.burger37);
                break;
            case 5:  iv.setImageResource(R.drawable.d2);
                break;
            case 6:  iv.setImageResource(R.drawable.deets);
                break;
            case 7:  iv.setImageResource(R.drawable.westend);
                break;
            case 8:  iv.setImageResource(R.drawable.dolciecaffe);
                break;
            case 9:  iv.setImageResource(R.drawable.dxpress);
                break;
            case 10: iv.setImageResource(R.drawable.owens);
                break;
            case 11: iv.setImageResource(R.drawable.dunkindonuts);
                break;
            case 12: iv.setImageResource(R.drawable.hokiegrill);
                break;
            default: break;

        }

        ListAdapter FoodNamesAdapter = new FoodListCustomAdapter(this, ABPFoodList);
        foodlist = (ListView) findViewById(R.id.menulistview);
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
