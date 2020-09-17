package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class HauntedPlaces extends Fragment {
    public HauntedPlaces() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_haunted_places, container, false);
        // content displayed in listView
        ArrayList<HauntedAndSecrete> hauntedSpots = new ArrayList<HauntedAndSecrete>();
        hauntedSpots.add(new HauntedAndSecrete(R.string.description_aarey_colony,R.string.title_aarey_colony,R.drawable.aarey_milk_colony));
        hauntedSpots.add(new HauntedAndSecrete(R.string.description_Nasserwanji_wadi,R.string.title_Nasserwanji_Wadi,R.drawable.nasserwanji_wadi));
        hauntedSpots.add(new HauntedAndSecrete(R.string.description_Vrindavan_Society,R.string.title_vrindavan_society,R.drawable.vrindavan_society));
        hauntedSpots.add(new HauntedAndSecrete(R.string.description_dsouza_chawl,R.string.title_dsouza_chawl,R.drawable.dsouza_chawl));
        hauntedSpots.add(new HauntedAndSecrete(R.string.description_poonam_chambers,R.string.title_poonam_chambers,R.drawable.poonam_chambers));
        // finding the list view
        ListView localListView = view.findViewById(R.id.haunted_spots_list);
        // declaring the adapter
        LocalPlacesAdapter ArrayAdapter = new LocalPlacesAdapter(getActivity(),hauntedSpots);
        // attaching the listView with the adapter
        localListView.setAdapter(ArrayAdapter);


        localListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        intendAble(R.string.title_aarey_colony,R.string.des_aarey_colony,R.drawable.arrey_colony_places);
                        break;

                    case 1:
                        intendAble(R.string.title_Nasserwanji_Wadi,R.string.des_nasserwanji_wadi,R.drawable.nassernwanji_wadi_full);
                        break;

                    case 2:
                        intendAble(R.string.title_vrindavan_society,R.string.des_vrindavan_society,R.drawable.vrindavan_full);
                        break;

                    case 3:
                        intendAble(R.string.title_dsouza_chawl,R.string.des_vrindavan_society,R.drawable.dsouza_chawl_full);
                        break;

                    case 4 :
                        intendAble(R.string.title_poonam_chambers,R.string.des_poonam_chamber,R.drawable.poonam_camber_full);
                        break;

                }
            }
        });
        return view;
    }

    private void intendAble(int tittle, int description , int imageID){
        Intent intent = new Intent(getActivity(),ViewHauntedPlace.class);
        intent.putExtra("Title",tittle);
        intent.putExtra("description",description);
        intent.putExtra("image",imageID);
        startActivity(intent);
    }

}