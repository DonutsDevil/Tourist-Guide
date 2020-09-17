package com.example.touristguide;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class HotSpotsGetterClass {
    private int mTitle;
    private int mDescription;
    private static final int IMAGE_ID = -1;
    private int mImageId = IMAGE_ID;


    public HotSpotsGetterClass(int title , int description, int imageId){
        mTitle = title;
        mDescription = description;
        mImageId = imageId;
    }

    public int getmDescription() {
        return mDescription;
    }

    public int getmImageId() {
        return mImageId;
    }

    public int getmTitle() {
        return mTitle;
    }

    public boolean hasImage(){
        return mImageId != IMAGE_ID;
    }

}
