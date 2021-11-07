package com.kudasov.dev.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID;
    private int mSoundResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceID, int imageResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundResourceID = soundResourceID;
        mImageResourceID = imageResourceID;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation, int soundResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        mSoundResourceID = soundResourceID;
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

    public int getSoundResourceID() {
        return mSoundResourceID;
    }
}
