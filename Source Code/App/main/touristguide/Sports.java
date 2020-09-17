package com.example.touristguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class Sports extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Sports");
        getSupportActionBar().setTitle("Sports"); // provide compatibility to all the versions


        final ArrayList<DropDownMenu> sportInfo = new ArrayList<>();
        sportInfo.add(new DropDownMenu("Football", R.string.Info_football,R.string.footbal_link,R.drawable.football));
        sportInfo.add(new DropDownMenu("Cricket",R.string.info_cricket, R.string.cricket_link,R.drawable.cricket));
        sportInfo.add(new DropDownMenu("Hockey",R.string.info_hockey,R.string.hockey_link,R.drawable.hockey));
        sportInfo.add(new DropDownMenu("Kabbadi",R.string.info_kab,R.string.kabbadi_link,R.drawable.kabbadi));
//        sportInfo.add(new DropDownMenu("Kho kho",description));

        final DropDownAdapter sport_info_Adapter = new DropDownAdapter(getApplicationContext() ,sportInfo);
        final ListView listView_sports_info = findViewById(R.id.sports_List_view);
        listView_sports_info.setAdapter(sport_info_Adapter);

        listView_sports_info.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DropDownMenu pos = sportInfo.get(position);
                if(pos.getTitle().equals("Football")){
                    runUrlIntent("https://www.footballcounter.com/category/football-events/");
                }
                else if(pos.getTitle().equals("Cricket")){
                    runUrlIntent("https://www.mumbaicricket.com/mca/index.php");
                }
                else if(pos.getTitle().equals("Hockey")){
                    runUrlIntent("http://www.mumbaihockey.org/");
                }
                else if(pos.getTitle().equals("Kabbadi")){
                    runUrlIntent("https://www.prokabaddi.com/");
                }

            }
        });

    }

    private void runUrlIntent(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}