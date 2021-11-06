package com.kudasov.dev.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }
}
