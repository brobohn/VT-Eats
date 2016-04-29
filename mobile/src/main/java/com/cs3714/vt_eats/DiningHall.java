package com.cs3714.vt_eats;

import android.location.Location;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by Ben on 4/29/2016.
 */
public class DiningHall {

    private String name;
    Location location;
    HashMap<String, FoodItem> menu;
    ArrayList<BusinessHour> businessHours;
    final int secondsPerHour = 60*60;

    public DiningHall(String n) {
        this.name = n;
        this.businessHours = new ArrayList<BusinessHour>();
    }

    public void addHours(int day, double open, double close) {
        businessHours.add(new BusinessHour(day, (int)open*secondsPerHour, (int)close*secondsPerHour));
    }

    public boolean isOpen() {
        Calendar c = Calendar.getInstance();

        int thisDay = c.get(Calendar.DAY_OF_WEEK);
        int hours = c.get(Calendar.HOUR);
        int minutes = c.get(Calendar.MINUTE);
        int seconds = c.get(Calendar.SECOND);
        int am_pm = c.get(Calendar.AM_PM);

        if (am_pm == Calendar.PM) {
            hours += 12;
        }

        int currentTimeInSeconds = seconds + (60*minutes) + (60*60*hours);

        for (BusinessHour bh : businessHours) {
            if (bh.day == thisDay) {
                if (currentTimeInSeconds >= bh.open && currentTimeInSeconds < bh.close) {
                    return true;
                }
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }



}
