package com.example.root.tourguide;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by root on 1/22/18.
 */

public class TourList implements Parcelable {
    public static final Parcelable.Creator<TourList> CREATOR
            = new Parcelable.Creator<TourList>() {
        public TourList createFromParcel(Parcel in) {
            return new TourList(in);
        }

        public TourList[] newArray(int size) {
            return new TourList[size];
        }
    };
    private static final int NO_IMAGE_PROVIDED = -1;
    private String placeName;
    private String placeAddress;
    private int imageID = NO_IMAGE_PROVIDED;

    public TourList(String placeName, String placeAddress, int imageId) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.imageID = imageId;
    }

    public TourList(String placeName, String placeAddress) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
    }

    public TourList(Parcel in) {
        this.placeName = in.readString();
        this.placeAddress = in.readString();
        this.imageID = in.readInt();

    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public int getImageID() {
        return imageID;
    }

    public boolean hasImageId() {
        return imageID != NO_IMAGE_PROVIDED;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(placeName);
        parcel.writeString(placeAddress);
        parcel.writeInt(imageID);
    }

}

