package com.kudasov.dev.tourguideapp;

public class Item {

    private final int NO_IMAGE_ID = -1;

    private String mTitle;
    private String mLink;
    private String mAddress;
    private String mPhone;
    private int mLogoImageID = NO_IMAGE_ID;

    public Item(String title, String link, String address, String phone) {
        this.mTitle = title;
        this.mLink = link;
        this.mAddress = address;
        this.mPhone = phone;
    }

    public Item(String title, String link, String address, String phone, int logoImageID) {
        this.mTitle = title;
        this.mLink = link;
        this.mAddress = address;
        this.mPhone = phone;
        this.mLogoImageID = logoImageID;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getLink() {
        return mLink;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public int getLogoImageID() {
        return mLogoImageID;
    }

    public boolean hasImage() {
        return mLogoImageID != NO_IMAGE_ID;
    }
}
