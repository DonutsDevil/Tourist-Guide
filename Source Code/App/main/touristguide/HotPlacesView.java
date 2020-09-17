package com.example.touristguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


/*
*
*This is the class where fragments are added to the view
* HotPlace
* HotFood
* HotShopping
* Are the tabLyaout Added to the Activity
*/
public class HotPlacesView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_places_view);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setTitle("Hot Spots");


        // viewPager to Slide the pages left and right
        ViewPager2 viewPager2 = findViewById(R.id.viewpager2_hotPlacesView);
        viewPager2.setAdapter(new HotPlaceAdapter(this));


        // sync the view pager and tabLayout
        TabLayout tabLayout = findViewById(R.id.tab_layout_hot_places_view);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:{
                        tab.setText(getResources().getString(R.string.hot_places));
                        break;
                    }
                    case 1:{
                        tab.setText(getResources().getString(R.string.hot_food));
                        break;
                    }
                    case 2: {
                        tab.setText(getResources().getString(R.string.hot_shopping));
                        break;
                    }
                }
            }
        });
        tabLayoutMediator.attach();


    }
}