package com.wordpress.shloknangia.quakenotifier;

/**
 * Created by SHLOK on 12-10-2016.
 */
public class Earthquake {
    private String mMagnitude;

    private String mLocation;

    private String mDate;

    public Earthquake(String mMagnitude, String mLocation, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
