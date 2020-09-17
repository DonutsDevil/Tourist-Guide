package com.example.touristguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HotPlaceAdapter extends FragmentStateAdapter {

    public HotPlaceAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new HotPlaces();
            case 1: return new HotFood();
            default: return new HotShopping();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
