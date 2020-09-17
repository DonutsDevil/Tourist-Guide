package com.example.touristguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LocalAreas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_areas);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("local Areas");

        ViewPager2 viewPager2 = findViewById(R.id.viewpager2);
        viewPager2.setAdapter(new PlacesAdapter(this));

        final TabLayout tabLayout = findViewById(R.id.tabLayout_haunted_local_places);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0: {
                        tab.setText("Haunted");
                        tab.setIcon(R.drawable.haunted);
                        break;
                    }
                    case 1: {
                        tab.setText("Secrete Spots");
                        tab.setIcon(R.drawable.secretespot);
                        break;
                    }
                }
            }
        }
        );
        tabLayoutMediator.attach();
    }
}