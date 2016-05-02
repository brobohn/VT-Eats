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
import android.widget.TextView;

import java.util.Calendar;


public class FoodInfoActivity extends AppCompatActivity {

    ListView foodlist;
    ImageView iv;
    DiningHall diningHall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodinfo);

        Intent intent = getIntent();
        int defaultValue = 0;
        int DiningHallSelected = intent.getIntExtra("DINING_HALL_SELECTION", defaultValue);
        diningHall = (DiningHall) intent.getParcelableExtra("DINING_HALL_OBJECT");

        // Display Hall info
        TextView tv_title = (TextView) findViewById(R.id.dininghalltitle);
        tv_title.setText(diningHall.getName());

        TextView tv_sunday_open = (TextView) findViewById(R.id.sundayopeningtext);
        tv_sunday_open.setText(diningHall.getHoursByDay(Calendar.SUNDAY));

        TextView tv_monday_open = (TextView) findViewById(R.id.mondayopeningtext);
        tv_monday_open.setText(diningHall.getHoursByDay(Calendar.MONDAY));

        TextView tv_tuesday_open = (TextView) findViewById(R.id.tuesdayopeningtext);
        tv_tuesday_open.setText(diningHall.getHoursByDay(Calendar.TUESDAY));

        TextView tv_wednesday_open = (TextView) findViewById(R.id.wedopeningtext);
        tv_wednesday_open.setText(diningHall.getHoursByDay(Calendar.WEDNESDAY));

        TextView tv_thursday_open = (TextView) findViewById(R.id.thursopeningtext);
        tv_thursday_open.setText(diningHall.getHoursByDay(Calendar.THURSDAY));

        TextView tv_friday_open = (TextView) findViewById(R.id.fridayopeningtext);
        tv_friday_open.setText(diningHall.getHoursByDay(Calendar.FRIDAY));

        TextView tv_saturday_open = (TextView) findViewById(R.id.satopeningtext);
        tv_saturday_open.setText(diningHall.getHoursByDay(Calendar.SATURDAY));







        String[] ABPFoodList = {"Black Angus Steak", "Classic Grilled Cheese", "Country Grilled Cheese",
                "Ham & Two Cheese", "Mayan Chicken Harvest Hot Wrap", "Newport Turkey", "Oven Hot Margherita",
                "Roasted Vegetarian Harvest Hot Wrap", "Teriyaki Steak Harvest Hot Wrap"};


        // Picture
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
            case 7:  iv.setImageResource(R.drawable.dunkindonuts);
                break;
            case 8:  iv.setImageResource(R.drawable.dxpress);
                break;
            case 9:  iv.setImageResource(R.drawable.hokiegrill);
                break;
            case 10: iv.setImageResource(R.drawable.owens);
                break;
            case 11: iv.setImageResource(R.drawable.dolciecaffe);
                break;
            case 12: iv.setImageResource(R.drawable.westend);
                break;
            default: break;
        }


        // Menu
        ListAdapter FoodNamesAdapter = new FoodListCustomAdapter(this, diningHall.menu);
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
