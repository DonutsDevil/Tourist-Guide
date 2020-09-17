package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
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
public class HotFood extends Fragment {
    View view;
    public HotFood() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_hot_food, container, false);
        // Inflate the layout for this fragment

        /*
        * the if statement check for the action bar title and return the CharSequence of it and which is casted to String
        * check if equal do the following
        */
        if(getResources().getString(R.string.bandra).equals((String) ((AppCompatActivity)getActivity()).getSupportActionBar().getTitle())){
            bandraFood();
        }
        else if(getResources().getString(R.string.chembur).equals((String) ((AppCompatActivity)getActivity()).getSupportActionBar().getTitle())){
                chemburFood();
        }else if(getResources().getString(R.string.cst_action_bar_text).equals((String) ((AppCompatActivity)getActivity()).getSupportActionBar().getTitle())){
            cstFood();
        }
        return view;
    }

    /*
    *inflates the Fragment listview with the details of Bandra Destination
    *
    */
    public void bandraFood(){
        ArrayList<HotSpotsGetterClass> hotFood = new ArrayList<>();
        hotFood.add(new HotSpotsGetterClass(R.string.pali_bhavan,R.string.pali_bhavann_short_info,R.drawable.pali_bhavan));
        hotFood.add(new HotSpotsGetterClass(R.string.elco_restaurant,R.string.elco_short_info,R.drawable.elco));
        hotFood.add(new HotSpotsGetterClass(R.string.persian_darbar,R.string.persian_darba_short_info,R.drawable.persian_darbar));
        hotFood.add(new HotSpotsGetterClass(R.string.tava_restaurant,R.string.tava_short_info,R.drawable.tava));

        // hooking up listview with the custom adapter
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotFood);
        listView.setAdapter(hotPlaceListViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.pali_bhavan,R.string.pali_bhavan,R.string.palai_bhavan_des,R.string.palai_bhavan_address,"Bandra");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.elco,R.string.elco_restaurant,R.string.elco_des,R.string.elco_address,"Bandra");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.persian_darbar,R.string.persian_darbar,R.string.persian_darba_des,R.string.perian_darbar_address,"Bandra");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.tava,R.string.tava_restaurant,R.string.tava_des,R.string.tava_address,"Bandra");
                        break;
                    }
                }
            }
        });
    }

    private void chemburFood(){
        ArrayList<HotSpotsGetterClass> hotFood = new ArrayList<>();
        hotFood.add(new HotSpotsGetterClass(R.string.nandu_vada_pav,R.string.nandu_vada_pav_shot_info,R.drawable.nandu_vada_pav));
        hotFood.add(new HotSpotsGetterClass(R.string.jhama,R.string.jhama_short_info,R.drawable.jhama_sweets));
        hotFood.add(new HotSpotsGetterClass(R.string.main_lunch_home,R.string.main_lunch_home_short_info,R.drawable.mani_lunch_home));
        hotFood.add(new HotSpotsGetterClass(R.string.china_villa,R.string.china_villa_short_info,R.drawable.china_villa));

        // hooking up listview with the custom adapter
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotFood);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.nandu_vada_pav,R.string.nandu_vada_pav,R.string.nanu_vada_pav_des,R.string.nandu_vada_pav_address,"Chembur");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.jhama_sweets,R.string.jhama,R.string.jhama_des,R.string.jhama_address,"Chembur");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.mani_lunch_home,R.string.main_lunch_home,R.string.mani_des,R.string.mani_address,"Chembur");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.china_villa,R.string.china_villa,R.string.china_villa_des,R.string.china_villa_address,"Chembur");
                        break;
                    }
                }
            }
        });
    }

    private void cstFood(){
        ArrayList<HotSpotsGetterClass> hotFood = new ArrayList<>();
        hotFood.add(new HotSpotsGetterClass(R.string.cst_soldier,R.string.cst_soldier_short_info,R.drawable.the_cst_solider));
        hotFood.add(new HotSpotsGetterClass(R.string.its_lucknowi,R.string.its_lucknowi_short_info,R.drawable.its_lucknowi));
        hotFood.add(new HotSpotsGetterClass(R.string.persian_darbar_cst,R.string.persian_cst_info,R.drawable.persian_darbar_cst));
        hotFood.add(new HotSpotsGetterClass(R.string.pizza_by_the_bay,R.string.pizza_by_the_bay_info,R.drawable.pizza_by_the_bay));

        // hooking up listview with the custom adapter
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotFood);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.the_cst_solider,R.string.cst_soldier,R.string.the_soldier_des,R.string.the_soldier_address,"C.S.T");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.its_lucknowi,R.string.its_lucknowi,R.string.the_lucknowi_des,R.string.the_lucknowi_address,"C.S.T");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.persian_darbar_cst,R.string.persian_darbar_cst,R.string.pd_cst,R.string.persian_darbar_address_cst,"C.S.T");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.pizza_by_the_bay,R.string.pizza_by_the_bay,R.string.pizza_by_the_bay_des,R.string.pizza_by_the_way_address,"C.S.T");
                        break;
                    }
                }
            }
        });
    }


    private void sendImageAddressDescription(int image,int title, int description,int address, String actionBarText){
        Intent intent = new Intent(getActivity(),viewHotSpots.class);
        intent.putExtra("imageId",image);
        intent.putExtra("Title",title);
        intent.putExtra("description",description);
        intent.putExtra("address",address);
        intent.putExtra("ActionBarText",actionBarText);
        startActivity(intent);
    }
}