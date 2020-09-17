package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class HotPlaces extends Fragment {

    public HotPlaces() {
        // Required empty public constructor
    }
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_hot_places, container, false);

        // get the title from HotSpots Activity
        Intent intent = getActivity().getIntent();
        String title = intent.getExtras().getString("Title");
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);


        if(title.equals(getResources().getString(R.string.bandra))){
            bandraView();
        }else if(title.equals(getResources().getString(R.string.chembur))){
            chemburPlaces();
        }else if(title.equals(getResources().getString(R.string.cst_action_bar_text))){
            cstPlaces();
        }
        return view;
    }


    private void bandraView(){
        // list to store the views that the list should display.
        ArrayList<HotSpotsGetterClass> hotPlace = new ArrayList<>();
        hotPlace.add(new HotSpotsGetterClass(R.string.bandstand,R.string.bandStand_short_info,R.drawable.bandstand));
        hotPlace.add(new HotSpotsGetterClass(R.string.st_andrews_church,R.string.st_andrews_church_short_info,R.drawable.st_andrews_bandra));
        hotPlace.add(new HotSpotsGetterClass(R.string.bandra_talo,R.string.bandra_talo_short_info,R.drawable.bandra_talo));
        hotPlace.add(new HotSpotsGetterClass(R.string.mount_carmel,R.string.mount_carmel_short_info,R.drawable.mount_carmel));
        hotPlace.add(new HotSpotsGetterClass(R.string.i_love_mumbai,R.string.i_love_mumbai_short_info,R.drawable.i_love_mumbai));


        // inflates the view for bandra view
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotPlace);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.bandstand,R.string.bandstand,R.string.bandstand_des,R.string.bandstand_address,"Bandra");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.st_andrews_bandra,R.string.st_andrews_church,R.string.st_andrews_des,R.string.st_andrews_church_address,"Bandra");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.bandra_talo,R.string.bandra_talo,R.string.bandra_talo_des,R.string.bandra_talo_address,"Bandra");
                        break;
                    }
                    case 3 : {
                            sendImageAddressDescription(R.drawable.mount_carmel,R.string.mount_carmel,R.string.mount_carmel_des,R.string.mount_carmel_address,"Bandra");
                            break;
                    }
                    case 4 : {
                            sendImageAddressDescription(R.drawable.i_love_mumbai,R.string.i_love_mumbai,R.string.i_love_mumbai_des,R.string.i_love_mumbai_address,"Bandra");
                            break;
                    }
                }

            }
        });
    }

    private void chemburPlaces(){
        // list to store the views that the list should display.
        ArrayList<HotSpotsGetterClass> hotPlace = new ArrayList<>();
        hotPlace.add(new HotSpotsGetterClass(R.string.fine_arts_society,R.string.fine_arts_society_short_info,R.drawable.fine_arts));
        hotPlace.add(new HotSpotsGetterClass(R.string.bombay_golf_club,R.string.bombay_gluf_club_short_info,R.drawable.golf));
        hotPlace.add(new HotSpotsGetterClass(R.string.chembur_gymkhana,R.string.chembur_gymkhana_short_info,R.drawable.chembur_gymkhana));
        hotPlace.add(new HotSpotsGetterClass(R.string.rcf,R.string.rcf_short_info,R.drawable.rcf));

        // inflates the view for chembur view
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotPlace);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.fine_arts,R.string.fine_arts_society,R.string.fine_art_des,R.string.fine_art_address,"Chembur");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.golf,R.string.bombay_golf_club,R.string.bombay_glof_club_des,R.string.bombay_gold_club_address,"Chembur");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.chembur_gymkhana,R.string.chembur_gymkhana,R.string.chembur_gym_khana_des,R.string.chembur_gym_khana_address,"Chembur");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.rcf,R.string.rcf,R.string.rcf_des,R.string.rcf_address,"Chembur");
                        break;
                    }
                }

            }
        });
    }

    private void cstPlaces(){

        ArrayList<HotSpotsGetterClass> hotPlace = new ArrayList<>();
        hotPlace.add(new HotSpotsGetterClass(R.string.gate_way_of_india,R.string.gate_Way_of_india_short_info,R.drawable.gate_way_of_india));
        hotPlace.add(new HotSpotsGetterClass(R.string.asiatic_society_of_mumbai,R.string.asiatic_society_of_mumbai_info_short,R.drawable.asiaticlibrary));
        hotPlace.add(new HotSpotsGetterClass(R.string.elephanta_caves,R.string.elephanta_caves_short_info,R.drawable.elephamta));
        hotPlace.add(new HotSpotsGetterClass(R.string.taraporevala_aquarium,R.string.taraporevala_aquarium_short_info,R.drawable.taraporewala_aquarium));

        // inflates the view for cst view
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotPlace);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.gate_way_of_india,R.string.gate_way_of_india,R.string.gateway_of_india_des,R.string.gate_way_of_india_address,"C.S.T");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.asiaticlibrary,R.string.asiatic_society_of_mumbai,R.string.asiatic_library_des,R.string.asiatic_library_address,"C.S.T");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.elephamta,R.string.elephanta_caves,R.string.elephanta_des,R.string.elephanta_address,"C.S.T");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.taraporewala_aquarium,R.string.taraporevala_aquarium,R.string.taraporeal_des,R.string.taraporeal_address,"C.S.T");
                        break;
                    }
                }

            }
        });


    }


    private void sendImageAddressDescription(int image,int title, int description,int address,String actionBarText){
        Intent intent = new Intent(getActivity(),viewHotSpots.class);
        intent.putExtra("imageId",image);
        intent.putExtra("Title",title);
        intent.putExtra("description",description);
        intent.putExtra("address",address);
        intent.putExtra("ActionBarText",actionBarText);
        startActivity(intent);
    }
}