package com.cs3714.vt_eats;

import android.graphics.drawable.Drawable;
import android.location.Location;

import java.sql.Time;


/**
 * Created by Stephanie on 5/2/2016.
 */
public class DiningHall {

    Location loc;
    String name;
    int open;
    int close;
    int pic;

    DiningHall(Location l, String n, int o, int c, int id) {

        loc = l;
        name = n;
        open = o;
        close = c;
        pic = id;
    }
}
