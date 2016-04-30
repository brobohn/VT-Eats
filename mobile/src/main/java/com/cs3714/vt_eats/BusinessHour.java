package com.cs3714.vt_eats;

/**
 * Created by Ben on 4/29/2016.
 */
public class BusinessHour {

    public int day;
    public int open; // seconds since midnight
    public int close; // seconds since midnight

    final int secondsPerHour = 60*60;

    public BusinessHour(int day, int open, int close) {
        this.day = day;
        this.open = open;
        this.close = close;
    }

    private String timeFromSeconds(int seconds) {
        String am_pm = "am";
        if (seconds >= (12*secondsPerHour)) {
            am_pm = "pm";
            seconds -= (12*secondsPerHour);
            if (seconds >= (12*secondsPerHour)) {
                am_pm = "am";
                seconds -= (12*secondsPerHour);
            }
        }

        int hour = seconds / secondsPerHour;
        int minute = (seconds % secondsPerHour) / 60;

        String hourString = (hour != 0) ? Integer.toString(hour) : "12";
        String minuteString = (minute >= 10) ? Integer.toString(minute) : "0" + Integer.toString(minute);

        return String.format("%s:%s%s", hourString, minuteString, am_pm);
    }

    public String toString() {
        return String.format("%s-%s", timeFromSeconds(open), timeFromSeconds(close));
    }


}
