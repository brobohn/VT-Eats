package com.cs3714.vt_eats;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    DiningHallManager diningHallManager;
    ListView lv;

    GPSManager gpsManager;
    Compass compass;

    DiningHallCustomAdapter DiningHallsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gpsManager = new GPSManager(this);
        compass = new Compass();

        diningHallManager = new DiningHallManager();

        DiningHallsAdapter = new DiningHallCustomAdapter(this, diningHallManager.getDiningHalls(), compass.currentLocation);
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
        if(location != null){
            compass.setCurrentLocation(location);

            DiningHallsAdapter.notifyDataSetChanged();
        }
    }
}
