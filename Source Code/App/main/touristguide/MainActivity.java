package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    // take reference of spinner and videoViewer
    Spinner events;
    VideoView mumbaiV;
    String spinnerValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mumbaiV = findViewById(R.id.videoView);

        // create a array, for spinner where you  want to display your drop down menus
        String event[] = {"Choose Category","Sports", "Events"};

        // connect java with xml using findviebyid
        events = findViewById(R.id.static_spinner);

        // create a adapter with custom spinner layout xml file.
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this,R.layout.spinner_text_view,event);
        // how would the drop down of the spinner will look like.
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_text_view);
        // finally attach spinner and arrayAdapter
        events.setAdapter(spinnerAdapter);


        mumbaiV = (VideoView)findViewById(R.id.videoView);
        // uri is used to get the path of the item where android.resource://+package_name()+raw or mp4 file.
        Uri uri = Uri.parse("android.resource://com.example.touristguide/"+R.raw.mumbai);
        // now let video view get the loaction where video is kept
        mumbaiV.setVideoURI(uri);
        // start the video
        mumbaiV.start();

        // When coming back from another activity this will start the video again.
        mumbaiV.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mumbaiV.start();
            }
        });

        // if iy stops again. start it again
        // this will be fired only when video is done playing.
        mumbaiV.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {
                mumbaiV.start();
            }
        } );

        // when an item is selected. What action to perform is done by setOnItemSelectedListener
        events.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // String is return on basis of what is selected
                spinnerValue  = (String) events.getSelectedItem();
                // accordingly performed
                switch (spinnerValue){
                    case "Sports":
                        Intent sportsIntent = new Intent(MainActivity.this,Sports.class);
                        startActivity(sportsIntent);
                        break;
                    case "Events" : Intent eventsIntent = new Intent(MainActivity.this, Events.class);
                        startActivity(eventsIntent);
                        break;
                    default : // do nothing
                                break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Button localAreas = findViewById(R.id.Locals_Area);
        localAreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LocalAreas.class);
                startActivity(intent);
            }
        });

        Button HotSpots = findViewById(R.id.locationMarker);
        HotSpots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.touristguide.HotSpots.class);
                startActivity(intent);
            }
        });

    }

    // when video is to be closed to save ram
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        mumbaiV.suspend();
//    }



}