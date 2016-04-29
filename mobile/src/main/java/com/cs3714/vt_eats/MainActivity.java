package com.cs3714.vt_eats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    DiningHallManager diningHallManager;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diningHallManager = new DiningHallManager();



        String[] DiningHallList = {"Au Bon Pain - Graduate Life Center", "Au Bon Pain - Squires Cafe",
                "Au Bon Pain - Squires Kiosk", "Au Bon Pain - Goodwin", "Burger '37", "D2", "Deet's Place", "West End Market", "Turner Place at Lavery",
                "DXpress", "Owens Food Market", "Dunkin Donuts", "Hokie Grill"};


        ListAdapter DiningHallsAdapter = new CustomAdapter(this, diningHallManager.getDiningHalls());
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
}
