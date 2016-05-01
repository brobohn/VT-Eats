package com.cs3714.vt_eats;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    GPSManager gpsManager;
    Compass compass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gpsManager = new GPSManager(this);
        compass = new Compass();

        String[] DiningHallList = {"Au Bon Pain - Graduate Life Center", "Au Bon Pain - Squires Cafe",
                "Au Bon Pain - Squires Kiosk", "Au Bon Pain - Goodwin", "Burger '37", "D2", "Deet's Place", "West End Market", "Turner Place at Lavery",
                "DXpress", "Owens Food Market", "Dunkin Donuts", "Hokie Grill"};


        ListAdapter DiningHallsAdapter = new CustomAdapter(this, DiningHallList);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(DiningHallsAdapter);

        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                    }
                }
        );
        
    }

    public void updateGPSLocation(Location location) {
        compass.setCurrentLocation(location);
    }
}
