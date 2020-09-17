package com.example.touristguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class viewHotSpots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_hot_spots);

        /*
        *
        * It gets the intent from
        * @1 HotPlaces.java
        * @2 HotFood.java
        * @3 HotShopping.java
        *
        * Where all three Are fragments
        *
        * */
        Intent intent = getIntent();

        int imageId = intent.getExtras().getInt("imageId");
        int tittle = intent.getExtras().getInt("Title");
        int description = intent.getExtras().getInt("description");
        int location = intent.getExtras().getInt("address");
        String actionBarText = intent.getExtras().getString("ActionBarText");

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(actionBarText);


       /*
       * Change the Layout "activity_view_hot_spots" dynamically
       * By the intent provided,
       * @var tittle // changes the title of the the subject
       * @var imageId // changes the images of the subject
       * @var description // changes the description of the subject
       * @var location   // changes the address of the subject
       */
        ImageView imageView = findViewById(R.id.image_view_hotPlace);
        imageView.setImageResource(imageId);

        TextView title = findViewById(R.id.title_view_hotSpots);
        title.setText(tittle);

        TextView address = findViewById(R.id.address_detail);
        address.setText(location);

        TextView descriptions = findViewById(R.id.description_hotSpots);
        descriptions.setText(description);
    }
}