package com.cs3714.vt_eats;

import android.location.Location;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Stephanie on 5/2/2016.
 */
public class DiningHallManager {

    DiningHall d2;
    DiningHall deets;
    DiningHall dx;
    DiningHall burger37;
    DiningHall westEnd;
    DiningHall owens;
    DiningHall hokieGrill;
    DiningHall abp_squires;
    DiningHall abp_glc;
    DiningHall abp_seb;
    DiningHall subway;
    DiningHall turner;

    Location d2L;
    Location westEndL;
    Location owensL;
    Location squiresL;
    Location glcL;
    Location sebL;
    Location subwayL;
    Location turnerL;

    Location current;

    double[] distances;
    HashMap<Double, DiningHall> key;

    DiningHallManager() {

        d2L = new Location("");
        westEndL = new Location("");
        owensL = new Location("");
        squiresL = new Location("");
        glcL = new Location("");
        sebL = new Location("");
        subwayL = new Location("");
        turnerL = new Location("");

        d2L.setLatitude(37.224373);
        d2L.setLongitude(-80.420987);

        westEndL.setLatitude(37.223309);
        westEndL.setLongitude(-80.422006);

        owensL.setLatitude(37.226504);
        owensL.setLongitude(-80.419104);

        squiresL.setLatitude(37.229191);
        squiresL.setLongitude(-80.418079);

        glcL.setLatitude(37.228192);
        glcL.setLongitude(-80.417650);

        sebL.setLatitude(37.232386);
        sebL.setLongitude(-80.425734);

        subwayL.setLatitude(37.229362);
        subwayL.setLongitude(-80.424635);

        turnerL.setLatitude(37.230955);
        turnerL.setLongitude(-80.422714);

        d2 = new DiningHall(d2L, "Dietrick Hall", 0, 0, R.drawable.d2);
        dx = new DiningHall(d2L, "DX", 0, 0, R.drawable.d2);
        deets = new DiningHall(d2L, "Deet's", 0, 0, R.drawable.d2);

        westEnd = new DiningHall(westEndL, "West End", 0, 0, R.drawable.west);

        owens = new DiningHall(owensL, "Owens", 0, 0, R.drawable.owens);
        hokieGrill = new DiningHall(owensL, "Hokie Grill", 0, 0, R.drawable.owens);

        burger37 = new DiningHall(squiresL, "Burger 37", 0, 0, R.drawable.squires);
        abp_squires = new DiningHall(squiresL, "Squires", 0, 0, R.drawable.squires);

        abp_glc = new DiningHall(glcL, "Grad Life Center", 0, 0, R.drawable.glc);
        abp_seb = new DiningHall(sebL, "Goodwin Hall", 0, 0, R.drawable.seb);
        subway = new DiningHall(subwayL, "Johnston Stud Center", 0, 0, R.drawable.subway);
        turner = new DiningHall(turnerL, "Turner Place", 0, 0, R.drawable.turner);

        current = new Location("");
        current.setLatitude(37.230591);
        current.setLongitude(-80.421751);

        key = new HashMap<>();
        distances = new double[8];

        setDistances();
    }

    public void setDistances() {

        distances[0] = getDistance(d2L);
        key.put(distances[0], d2);
        distances[1] = getDistance(westEndL);
        key.put(distances[1], westEnd);
        distances[2] = getDistance(owensL);
        key.put(distances[2], owens);
        distances[3] = getDistance(squiresL);
        key.put(distances[3], abp_squires);
        distances[4] = getDistance(glcL);
        key.put(distances[4], abp_glc);
        distances[5] = getDistance(sebL);
        key.put(distances[5], abp_seb);
        distances[6] = getDistance(subwayL);
        key.put(distances[6], subway);
        distances[7] = getDistance(turnerL);
        key.put(distances[7], turner);

        Arrays.sort(distances);
    }

    public void setCurrent(Location cur) {

        current = cur;
    }

    public double getDistance(Location loc){

        return current.distanceTo(loc);
    }

    public String getInfo(int index) {

        String name = key.get(distances[index]).name;

        if(name.equals("Dietrick Hall")) {

            return "D2: all-you-care-to-eat dining featuring many international favorites. Brunch served on weekends.\n" +
                    "DXpress: offers a broad selection of grab-n-go fare and is open until 2am.\n" +
                    "Deet’s Place: Virginia Tech’s premier coffee, ice cream, and pastry shop.\n";

        } else if(name.equals("West End")) {

            return "West End Market: marketplace-style dining, " +
                    "features made-to- order items prepared before the customers and " +
                    "offers specialties such as London broil, lobster, and steak.\n";

        } else if(name.equals("Owens")) {

            return "Owens Food Court: 12 shops serving variety of international " +
                    "favorites including pasta, subs, quesadillas, cheese steaks, and stir-fry.\n" +
                    "Hokie Grill: features Chick-fil-A, Pizza Hut, Blue Ridge BBQ, Carvel Ice Cream, and Dunkin Donuts.";

        } else if(name.equals("Squires")) {

            return "Au Bon Pain: distinctive bakery items, upscale sandwiches and wraps, salads, and signature soups.\n" +
                    "Burger '37: features gourmet signature burgers, hand cut fries, and shakes.\n";

        } else if(name.equals("Grad Life Center")) {

            return "Au Bon Pain: distinctive bakery items, upscale sandwiches and wraps, salads, and signature soups.\n";

        } else if(name.equals("Goodwin Hall")) {

            return "Au Bon Pain: distinctive bakery items, upscale sandwiches and wraps, salads, and signature soups.\n";

        } else if(name.equals("Johnston Stud Center")) {

            return "Subway and Seattle's Best Coffee are located on the 2nd floor.\n";

        } else if(name.equals("Turner Place")) {

            return "Turner Place: houses eight separate restaurants.\n" +
                    "Atomic Pizzeria, Jamba Juice, Fire Girll, Qdoba Mexican Grill, " +
                    "Origami Suishi, Soup Garden, Dolci e Caffe, Bruegger's Bagels.\n";
        }

        return "";
    }
}
