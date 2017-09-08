package com.example.android.quakereport;

/**
 * Created by Xiaoqian on 4/30/17.
 */

public class Earthquake {
    private double magnitude;
    private String location;
    /** Time of the earthquake */
    private long timeInMilliseconds;
    private String url;

    public Earthquake(double magnitude, String location, long time, String url) {
        this.magnitude = magnitude;
        this.location = location;
        timeInMilliseconds = time;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getUrl() {
        return url;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
