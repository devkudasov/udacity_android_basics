package com.kudasov.dev.eqrthquake.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

    private Double mMag;
    private String mLocation;
    private long mDate;
    private String mUrl;

    public Earthquake(Double mMag, String mLocation, long mDate, String url) {
        this.mMag = mMag;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mUrl = url;
    }

    public Double getMagnitude() {
        return mMag;
    }

    public String getLocation() {
        String[] splitLocation = mLocation.split(" of ");

        if (splitLocation.length > 1) {
            return splitLocation[0];
        }

        return "Near the";
    }

    public String getPlace() {
        String[] splitLocation = mLocation.split(" of ");

        if (splitLocation.length > 1) {
            return splitLocation[1];
        }

        return splitLocation[0];
    }

    public String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM DD, yyyy");
        return formatter.format(new Date(mDate));
    }

    public String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:m a");
        return formatter.format(new Date(mDate));
    }

    public String getUrl() {
        return mUrl;
    }
}
