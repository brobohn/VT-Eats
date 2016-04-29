package com.cs3714.vt_eats;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Ben on 4/29/2016.
 */
public class DiningHallManager {

    final int secondsPerHour = 60*60;

    private DiningHall[] diningHalls;

    public DiningHallManager() {
        diningHalls = new DiningHall[1];

        // build list here
        buildDiningHalls();
    }

    public DiningHall[] getDiningHalls() {
        return diningHalls;
    }

    private void buildDiningHalls() {
        DiningHall dh = new DiningHall("Au Bon Pain - Graduate Life Center");
        dh.addHours(Calendar.FRIDAY, 0, 24*secondsPerHour);
        diningHalls[0] = dh;

    }


}
