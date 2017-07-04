package com.example.android.quakereport;

/**
 * Created by EMASYS ND on 7/4/2017.
 */

public class Earthquake {
    private String mag;
    private String city;
    private String location;
    private String date;
    private String time;



    public Earthquake(String mag, String location, String city, String date, String time) {
        this.mag = mag;
        this.city = city;
        this.date = date;
        this.time = time;
        this.location = location;

    }

    public String getMag() {
        return mag;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }
}
