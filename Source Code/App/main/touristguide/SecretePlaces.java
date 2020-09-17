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
public class SecretePlaces extends Fragment {
    public SecretePlaces() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_secrete_places, container, false);

        /*
        * @param 1: description
        * @param 2: title
        * @param 3: Drawable id
        * */
        ArrayList<HauntedAndSecrete> secreteSpots = new ArrayList<>();
        secreteSpots.add(new HauntedAndSecrete(R.string.description_sion_fort,R.string.sion_fort,R.drawable.sion_fort));
        secreteSpots.add(new HauntedAndSecrete(R.string.description_diamond_garden,R.string.diamond_garden,R.drawable.diamond_garden));
        secreteSpots.add(new HauntedAndSecrete(R.string.description_upvan_lake,R.string.upvan_lake,R.drawable.upvan_lake));
        secreteSpots.add(new HauntedAndSecrete(R.string.description_dharavi,R.string.dharavi,R.drawable.dharavi));
        secreteSpots.add(new HauntedAndSecrete(R.string.description_chota_khasmir,R.string.chota_khasmir,R.drawable.chota_kashmir));

        ListView secreteListView = view.findViewById(R.id.secrete_spots_list);
        LocalPlacesAdapter ArrayAdapater= new LocalPlacesAdapter(getActivity(),secreteSpots);
        secreteListView.setAdapter(ArrayAdapater);



        secreteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intendAble(R.string.sion_fort,R.string.des_sion_fort,R.drawable.sion_fort_full);
                        break;

                    case 1:
                        intendAble(R.string.diamond_garden,R.string.des_diamond_garden,R.drawable.diamond_garden_full);
                        break;
                    case 2:
                        intendAble(R.string.upvan_lake,R.string.des_upvan_lake,R.drawable.upvanlake_full);
                        break;

                    case 3:
                        intendAble(R.string.dharavi,R.string.des_dharavi,R.drawable.dharavi_full);
                        break;

                    case 4:
                        intendAble(R.string.chota_khasmir,R.string.des_chotta_khasmir,R.drawable.chhotakashmir_full);
                        break;
                }
            }
        });
        return view;
    }

    private void intendAble(int tittle, int description, int imageID){
        Intent intent = new Intent(getActivity(),ViewHauntedPlace.class);
        intent.putExtra("Title",tittle);
        intent.putExtra("description",description);
        intent.putExtra("image",imageID);
        startActivity(intent);
    }
}