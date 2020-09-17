package com.example.touristguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PlacesAdapter extends FragmentStateAdapter {
    public PlacesAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 : return new HauntedPlaces();
            default: return new SecretePlaces();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
