package com.example.touristguide;
/*
*
*Custom class for adding data in the Listview of events and activites
* of Mumbai
*/
public class DropDownMenu {
    private String Title;
    private int url;
    private int info;
    private final int CHECK_IMAGE_ID = -1;
    private int imageId = CHECK_IMAGE_ID;
    DropDownMenu(String Title , int info,int url,int imageId){
        this.Title = Title;
        this.url = url;
        this.info = info;
        this.imageId = imageId;

    }

    public int getInfo() {
        return info;
    }

    public String getTitle(){
        return Title;
    }

    public int getUrl() {
        return url;
    }

    public int getImageId(){
        return imageId;
    }

    public boolean hasImage(){
        return imageId != CHECK_IMAGE_ID;
    }
}
