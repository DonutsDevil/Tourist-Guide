package com.example.touristguide;
/*
*Cutsom class for haunted and secrete
* List_view here we are preparing to create a listView
*/
public class HauntedAndSecrete {
     private int description;
     private int imageId = IMAGE_ID;
     private int title;
     // to check if and image is present or not
     private static final int IMAGE_ID = -1;

     public HauntedAndSecrete(int description,int title,int imageId){
         this.description = description;
         this.title = title;
         this.imageId =imageId;
     }

     /*
     * 3 getter methods to access image, title  and  Description
     * of the view in other class
     * */
     public int getTitle(){
         return title;
     }

     public int getDescription(){
         return description;
     }

     public int getImageId(){
         return imageId;
     }

     public boolean hasImage(){
         return imageId != IMAGE_ID;
     }

}
