package com.cs3714.vt_eats;

import android.content.Intent;
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

                        int DiningHallSelection = 0;

                        switch (position) {
                            case 0:  DiningHallSelection = 0;
                                break;
                            case 1:  DiningHallSelection = 1;
                                break;
                            case 2:  DiningHallSelection = 2;
                                break;
                            case 3:  DiningHallSelection = 3;
                                break;
                            case 4:  DiningHallSelection = 4;
                                break;
                            case 5:  DiningHallSelection = 5;
                                break;
                            case 6:  DiningHallSelection = 6;
                                break;
                            case 7:  DiningHallSelection = 7;
                                break;
                            case 8:  DiningHallSelection = 8;
                                break;
                            case 9:  DiningHallSelection = 9;
                                break;
                            case 10: DiningHallSelection = 10;
                                break;
                            case 11: DiningHallSelection = 11;
                                break;
                            case 12: DiningHallSelection = 12;
                                break;
                            default: break;
                        }

                        Intent intent = new Intent(MainActivity.this, FoodInfoActivity.class);
                        intent.putExtra("DINING_HALL_SELECTION", DiningHallSelection);
                        intent.putExtra("DINING_HALL_OBJECT", diningHallManager.getDiningHalls()[position]);
                        startActivity(intent);
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
