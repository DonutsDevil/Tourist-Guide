package com.example.touristguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.net.URI;
import java.util.ArrayList;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        /*
        * changes the Action Bar text for the activity
        * have to create an object of the action bar first and then setTitle
        */
        // object creation.
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Events");

      //array list to store the information, That has to be displayed on list view in events activity
        final ArrayList<DropDownMenu>eventsInfo = new ArrayList<DropDownMenu>();
        eventsInfo.add(new DropDownMenu("Kala Ghoda Festival", R.string.kala_ghoda_event,R.string.khal_ghoda_link,R.drawable.kalaghoda));
        eventsInfo.add(new DropDownMenu("Comic Con",R.string.comic_con,R.string.comic_con_link,R.drawable.comic_con));
        eventsInfo.add(new DropDownMenu("Mumbai Pride",R.string.mumbai_pride_info,R.string.mumbai_pride_link,R.drawable.mumbaipride));
        eventsInfo.add(new DropDownMenu("Spoken Fest",R.string.spoken_fest_info,R.string.spoken_fest_link,R.drawable.spokenfest));
        eventsInfo.add(new DropDownMenu("Pet Fed",R.string.pet_fed_info,R.string.pet_fed_link,R.drawable.petfed));
        eventsInfo.add(new DropDownMenu("Techfest 2020",R.string.techfes_info,R.string.techfest_link,R.drawable.techfest));

        /*
        * 1. get list view from the xml
        * 2. add a  array dapter that willl take the activity and array list
        * 3. hook listview with adapter
        * */
        ListView eventsList = findViewById(R.id.events_list_view);
        DropDownAdapter listAdapter = new DropDownAdapter(getApplicationContext(),eventsInfo);
        eventsList.setAdapter(listAdapter);

        /*
        * click event to redirect the user the the link of the respective event which user clicks on
        * */
        eventsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get the position number. when user clicks on the listview
                DropDownMenu pos = eventsInfo.get(position);
                if(pos.getTitle().equals("Kala Ghoda Festival")){
                    intentUrl("http://www.kalaghodaassociation.com/");
                }else if(pos.getTitle().equals("Comic Con")){
                    intentUrl("http://comicconindia.com/");
                }else if(pos.getTitle().equals("Mumbai Pride")){
                    intentUrl("http://comicconindia.com/");
                }else if(pos.getTitle().equals("Spoken Fest")){
                    intentUrl("https://kommuneity.com/spoken/");
                }else if(pos.getTitle().equals("Pet Fed")){
                    intentUrl("https://petfed.org/events");
                }else if(pos.getTitle().equals("Techfest 2020")){
                    intentUrl("https://techfest.org/");
                }
            }
        });
    }
    // utility to redirect the user to the browser.
    private void intentUrl(String url){
        Intent urlIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(urlIntent);
    }
}