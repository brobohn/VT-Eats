package com.cs3714.vt_eats;

import android.location.Location;

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
        abpglc.addHours(Calendar.MONDAY, 7.5, 20);
        abpglc.addHours(Calendar.TUESDAY, 7.5, 20);
        abpglc.addHours(Calendar.WEDNESDAY, 7.5, 20);
        abpglc.addHours(Calendar.THURSDAY, 7.5, 20);
        abpglc.addHours(Calendar.FRIDAY, 7.5, 15);
        abpglc.setLocation(37.228237, -80.417594);
        diningHalls[0] = abpglc;

        DiningHall abpsc = new DiningHall("Au Bon Pain - Squires Cafe");
        abpsc.addHours(Calendar.SUNDAY, 11, 19);
        abpsc.addHours(Calendar.MONDAY, 8, 19);
        abpsc.addHours(Calendar.TUESDAY, 8, 19);
        abpsc.addHours(Calendar.WEDNESDAY, 8, 19);
        abpsc.addHours(Calendar.THURSDAY, 8, 19);
        abpsc.addHours(Calendar.FRIDAY, 8, 15);
        abpsc.addHours(Calendar.SATURDAY, 10, 19);
        abpsc.setLocation(37.229446, -80.418240);
        diningHalls[1] = abpsc;

        DiningHall abpsk = new DiningHall("Au Bon Pain - Squires Kiosk");
        abpsk.addHours(Calendar.MONDAY, 7, 19);
        abpsk.addHours(Calendar.TUESDAY, 7, 19);
        abpsk.addHours(Calendar.WEDNESDAY, 7, 19);
        abpsk.addHours(Calendar.THURSDAY, 7, 19);
        abpsk.addHours(Calendar.FRIDAY, 7, 19);
        abpsk.setLocation(37.229491, -80.418077);
        diningHalls[2] = abpsk;

        DiningHall abpg = new DiningHall("Au Bon Pain - Goodwin");
        abpg.addHours(Calendar.MONDAY, 7.5, 14);
        abpg.addHours(Calendar.TUESDAY, 7.5, 14);
        abpg.addHours(Calendar.WEDNESDAY, 7.5, 14);
        abpg.addHours(Calendar.THURSDAY, 7.5, 14);
        abpg.addHours(Calendar.FRIDAY, 7.5, 15.5);
        abpg.setLocation(37.232431, -80.425817);
        diningHalls[3] = abpg;

        DiningHall b37 = new DiningHall("Burger '37");
        b37.addHours(Calendar.SUNDAY, 12, 19);
        b37.addHours(Calendar.MONDAY, 10.5, 21);
        b37.addHours(Calendar.TUESDAY, 10.5, 21);
        b37.addHours(Calendar.WEDNESDAY, 10.5, 21);
        b37.addHours(Calendar.THURSDAY, 10.5, 21);
        b37.addHours(Calendar.FRIDAY, 10.5, 19);
        b37.addHours(Calendar.SATURDAY, 11, 19);
        b37.setLocation(37.229209, -80.418380);
        diningHalls[4] = b37;

        DiningHall d2 = new DiningHall("D2");
        d2.addHours(Calendar.SUNDAY, 9.5, 18.5);
        d2.addHours(Calendar.MONDAY, 7, 9.5);
        d2.addHours(Calendar.MONDAY, 11, 14);
        d2.addHours(Calendar.MONDAY, 17, 19);
        d2.addHours(Calendar.TUESDAY, 7, 9.5);
        d2.addHours(Calendar.TUESDAY, 11, 14);
        d2.addHours(Calendar.TUESDAY, 17, 19);
        d2.addHours(Calendar.WEDNESDAY, 7, 9.5);
        d2.addHours(Calendar.WEDNESDAY, 11, 14);
        d2.addHours(Calendar.WEDNESDAY, 17, 19);
        d2.addHours(Calendar.THURSDAY, 7, 9.5);
        d2.addHours(Calendar.THURSDAY, 11, 14);
        d2.addHours(Calendar.THURSDAY, 17, 19);
        d2.addHours(Calendar.FRIDAY, 7, 9.5);
        d2.addHours(Calendar.FRIDAY, 11, 14);
        d2.addHours(Calendar.FRIDAY, 17, 19);
        d2.setLocation(37.224483, -80.421081);
        diningHalls[5] = d2;

        DiningHall deets = new DiningHall("Deet's Place");
        deets.addHours(Calendar.SUNDAY, 10, 24);
        deets.addHours(Calendar.MONDAY, 7.5, 24);
        deets.addHours(Calendar.TUESDAY, 7.5, 24);
        deets.addHours(Calendar.WEDNESDAY, 7.5, 24);
        deets.addHours(Calendar.THURSDAY, 7.5, 24);
        deets.addHours(Calendar.FRIDAY, 7.5, 24);
        deets.addHours(Calendar.SATURDAY, 10, 24);
        deets.setLocation();
        diningHalls[6] = deets;

        DiningHall dd = new DiningHall("Dunkin Donuts");
        dd.addHours(Calendar.MONDAY, 7.5, 21);
        dd.addHours(Calendar.TUESDAY, 7.5, 21);
        dd.addHours(Calendar.WEDNESDAY, 7.5, 21);
        dd.addHours(Calendar.THURSDAY, 7.5, 21);
        dd.addHours(Calendar.FRIDAY, 7.5, 21);
        diningHalls[7] = dd;

        DiningHall dx = new DiningHall("DXpress");
        dx.addHours(Calendar.SUNDAY, 0, 2);
        dx.addHours(Calendar.SUNDAY, 9, 24);
        dx.addHours(Calendar.MONDAY, 0, 2);
        dx.addHours(Calendar.MONDAY, 7, 24);
        dx.addHours(Calendar.TUESDAY, 0, 2);
        dx.addHours(Calendar.TUESDAY, 7, 24);
        dx.addHours(Calendar.WEDNESDAY, 0, 2);
        dx.addHours(Calendar.WEDNESDAY, 7, 24);
        dx.addHours(Calendar.THURSDAY, 0, 2);
        dx.addHours(Calendar.THURSDAY, 7, 24);
        dx.addHours(Calendar.FRIDAY, 0, 2);
        dx.addHours(Calendar.FRIDAY, 7, 24);
        dx.addHours(Calendar.SATURDAY, 0, 2);
        dx.addHours(Calendar.SATURDAY, 7, 24);
        diningHalls[8] = dx;

        DiningHall hg = new DiningHall("Hokie Grill");
        hg.addHours(Calendar.MONDAY, 10.5, 21);
        hg.addHours(Calendar.TUESDAY, 10.5, 21);
        hg.addHours(Calendar.WEDNESDAY, 10.5, 21);
        hg.addHours(Calendar.THURSDAY, 10.5, 21);
        hg.addHours(Calendar.FRIDAY, 10.5, 21);
        hg.addHours(Calendar.SATURDAY, 12, 20);
        diningHalls[9] = hg;

        DiningHall owens = new DiningHall("Owens Food Court");
        owens.addHours(Calendar.SUNDAY, 10.5, 21);
        owens.addHours(Calendar.MONDAY, 10.5, 21);
        owens.addHours(Calendar.TUESDAY, 10.5, 21);
        owens.addHours(Calendar.WEDNESDAY, 10.5, 21);
        owens.addHours(Calendar.THURSDAY, 10.5, 21);
        owens.addHours(Calendar.FRIDAY, 10.5, 20);
        owens.addHours(Calendar.SATURDAY, 10.5, 20);
        diningHalls[10] = owens;

        DiningHall turner = new DiningHall("Turner Place");
        turner.addHours(Calendar.MONDAY, 7, 22);
        turner.addHours(Calendar.TUESDAY, 7, 22);
        turner.addHours(Calendar.WEDNESDAY, 7, 22);
        turner.addHours(Calendar.THURSDAY, 7, 22);
        turner.addHours(Calendar.FRIDAY, 7, 22);
        diningHalls[11] = turner;

        DiningHall we = new DiningHall("West End Market");
        we.addHours(Calendar.SUNDAY, 11, 20);
        we.addHours(Calendar.MONDAY, 10.5, 20);
        we.addHours(Calendar.TUESDAY, 10.5, 20);
        we.addHours(Calendar.WEDNESDAY, 10.5, 20);
        we.addHours(Calendar.THURSDAY, 10.5, 20);
        we.addHours(Calendar.FRIDAY, 10.5, 20);
        we.addHours(Calendar.SATURDAY, 11, 20);
        diningHalls[12] = we;


    }


}
