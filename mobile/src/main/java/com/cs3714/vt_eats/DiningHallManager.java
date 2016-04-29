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
        diningHalls = new DiningHall[13];

        // build list here
        buildDiningHalls();
    }

    public DiningHall[] getDiningHalls() {
        return diningHalls;
    }

    private void buildDiningHalls() {
        DiningHall abpglc = new DiningHall("Au Bon Pain - Graduate Life Center");
        abpglc.addHours(Calendar.FRIDAY, 7.5, 15);
        diningHalls[0] = abpglc;

        DiningHall abpsc = new DiningHall("Au Bon Pain - Squires Cafe");
        abpsc.addHours(Calendar.FRIDAY, 0, 20);
        diningHalls[1] = abpsc;

        DiningHall abpsk = new DiningHall("Au Bon Pain - Squires Kiosk");
        abpsk.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[2] = abpsk;

        DiningHall abpg = new DiningHall("Au Bon Pain - Goodwin");
        abpg.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[3] = abpg;

        DiningHall b37 = new DiningHall("Burger '37");
        b37.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[4] = b37;

        DiningHall d2 = new DiningHall("D2");
        d2.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[5] = d2;

        DiningHall deets = new DiningHall("Deet's Place");
        deets.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[6] = deets;

        DiningHall dd = new DiningHall("Dunkin Donuts");
        dd.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[7] = dd;

        DiningHall dx = new DiningHall("DXpress");
        dx.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[8] = dx;

        DiningHall hg = new DiningHall("Hokie Grill");
        hg.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[9] = hg;

        DiningHall owens = new DiningHall("Owens Food Court");
        owens.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[10] = owens;

        DiningHall turner = new DiningHall("Turner Place");
        turner.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[11] = turner;

        DiningHall we = new DiningHall("West End Market");
        we.addHours(Calendar.FRIDAY, 0, 18);
        diningHalls[12] = we;


    }


}
