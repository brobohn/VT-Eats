package com.cs3714.vt_eats;

import android.location.Location;

/**
 *
 */
public class Compass {

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    Location currentLocation;

    public Compass() {
        currentLocation = new Location("");
        currentLocation.setLatitude(37.230572);
        currentLocation.setLongitude(-80.421788);
    }

    public double getDistanceTo(Location loc){
        return currentLocation.distanceTo(loc);
    }
}
