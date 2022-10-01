package com.example.android.ghanatouristapp;

public class Place {

    /**
     * String resource ID for the name of the place
     */
    private int mPlaceName;
    /**
     * String resource ID for a short description of the place
     */
    private int mPlaceDescription;
    /**
     * String resource ID for the address or location of the place
     */
    private int mPlaceAddress;
    /**
     * String resource ID for the contact of the place
     */
    private int mPlaceContact;
    /**
     * Image resource ID for the place
     */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param name        is the string resource ID for the name of the place
     * @param description is the string resource Id for a short description of the place
     * @param address     is the string resource ID for the address or location of the place
     * @param contact     is the string resource ID for the place contact number
     * @param image       is the image resource ID for a photo of the place
     */
    public Place(int name, int description, int address, int contact, int image) {
        mPlaceName = name;
        mPlaceDescription = description;
        mPlaceAddress = address;
        mPlaceContact = contact;
        mImageResourceId = image;
    }

    /**
     * Get the string resource ID for the place name.
     */
    public int getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the string resource ID for the place description.
     */
    public int getPlaceDescription() {
        return mPlaceDescription;
    }

    /**
     * Get the string resource ID for the place address.
     */
    public int getPlaceAddress() {
        return mPlaceAddress;
    }

    /**
     * Get the string resource ID for the contact of the place.
     */
    public int getPlaceContact() {
        return mPlaceContact;
    }

    /**
     * Return the image resource ID of a photo of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
