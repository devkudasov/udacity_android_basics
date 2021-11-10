package com.kudasov.dev.eqrthquake.models;

public class Earthquake {

    private String mMag;
    private String mLocation;
    private long mDate;

    public Earthquake(String mMag, String mLocation, long mDate) {
        this.mMag = mMag;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getMagnitude() {
        return mMag;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return String.valueOf(mDate);
    }
}
