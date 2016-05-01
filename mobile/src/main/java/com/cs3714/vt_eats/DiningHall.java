package com.cs3714.vt_eats;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ben on 4/29/2016.
 */
public class DiningHall implements Parcelable {

    private String name;
    Location location;
    HashMap<String, FoodItem> menu;
    ArrayList<BusinessHour> businessHours;
    int secondsPerHour = 60*60;

    public DiningHall(String n) {
        this.name = n;
        this.businessHours = new ArrayList<BusinessHour>();
    }

    protected DiningHall(Parcel in) {
        name = in.readString();
        location = in.readParcelable(Location.class.getClassLoader());
        secondsPerHour = in.readInt();
        businessHours = in.readArrayList(null);
    }

    public static final Creator<DiningHall> CREATOR = new Creator<DiningHall>() {
        @Override
        public DiningHall createFromParcel(Parcel in) {
            return new DiningHall(in);
        }

        @Override
        public DiningHall[] newArray(int size) {
            return new DiningHall[size];
        }
    };

    public void addHours(int day, double open, double close) {
        businessHours.add(new BusinessHour(day, (int)open*secondsPerHour, (int)close*secondsPerHour));
    }

    public boolean isOpenNow() {
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

    public boolean isOpenToday() {
        Calendar c = Calendar.getInstance();
        int thisDay = c.get(Calendar.DAY_OF_WEEK);

        for (BusinessHour bh : businessHours) {
            if (bh.day == thisDay) {
                return true;
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public String getTodaysHoursString() {
        Calendar c = Calendar.getInstance();
        int thisDay = c.get(Calendar.DAY_OF_WEEK);

        return getHoursByDay(thisDay);
    }

    public String getHoursByDay(int day) {
        StringBuilder str = new StringBuilder();

        for (BusinessHour bh : businessHours) {
            if (bh.day == day) {
                str.append(bh.toString() + " ");
            }
        }

        if (str.toString().isEmpty()) {
            return "Closed";
        }

        return str.toString();
    }

    public void setLocation(double lat, double lon){
        Location loc = new Location("");
        loc.setLatitude(lat);
        loc.setLongitude(lon);
        location = loc;
    }

    public Location getLocation(){
        return location;
    }


    public void addFoodItem(String name, FoodItem foodItem){
        menu.put(name, foodItem);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeParcelable(location, flags);
        dest.writeInt(secondsPerHour);
        dest.writeList(businessHours);
    }
}
