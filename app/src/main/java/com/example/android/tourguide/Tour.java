package com.example.android.tourguide;

public class Tour {

    private int mNameOfPlace;
    private int mLocation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Tour(int nameOfPlace, int location) {
        mNameOfPlace = nameOfPlace;
        mLocation = location;
    }

    public Tour(int nameOfPlace, int location, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public int getNameOfPlace() {
        return mNameOfPlace;
    }

    public int getLocation() {
        return mLocation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
