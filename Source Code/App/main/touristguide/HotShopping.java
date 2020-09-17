package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;

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
public class HotShopping extends Fragment {
    View view;
    public HotShopping() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_hot_shopping, container, false);

        /*
        * it checks for the title and according displays the fragment for the given
        * Requested view
        */

        if(getResources().getString(R.string.bandra).equals((String) ((AppCompatActivity)getActivity()).getSupportActionBar().getTitle())){
            bandraShopping();
        }else if(getResources().getString(R.string.chembur).equals((String)((AppCompatActivity)getActivity()).getSupportActionBar().getTitle())){
                chemburShopping();
        }else if(getResources().getString(R.string.cst_action_bar_text).equals((String)((AppCompatActivity)getActivity()).getSupportActionBar().getTitle())){
                cstShopping();
        }

        return view;
    }


    /*
    * inflates shopping fragment with bandra Shopping details
    */
    private void bandraShopping(){

        ArrayList<HotSpotsGetterClass> hotShoppingCentres = new ArrayList<>();

        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.linking_road,R.string.linkin_road_short_info,R.drawable.linking_road));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.link_square_mall,R.string.link_sqaure_mall_short_info,R.drawable.link_square_mall));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.wooden_design,R.string.wooden_design_short_info,R.drawable.wooden_design));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.link_corner,R.string.link_corner_short_info,R.drawable.link_corner));


        // hooking up listView Custom Adapater and ArrayList
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotShoppingCentres);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.linking_road,R.string.linking_road,R.string.linking_road_des,R.string.linking_road_address,"Bandra");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.link_square_mall,R.string.link_square_mall,R.string.link_square_mode_des,R.string.link_square_mall_address,"Bandra");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.wooden_design,R.string.wooden_design,R.string.wooden_des,R.string.wood_design_address,"Bandra");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.link_corner,R.string.link_corner,R.string.link_corner_des,R.string.link_corner_address,"Bandra");
                        break;
                    }
                }
            }
        });
    }

    private void chemburShopping(){

        ArrayList<HotSpotsGetterClass> hotShoppingCentres = new ArrayList<>();

        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.k_star,R.string.k_star_short_info,R.drawable.k_star));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.mahavir_home_store,R.string.mahavir_store_short_info,R.drawable.mahavir_home_store_chembur));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.cubic,R.string.cubic_short_info,R.drawable.cubic));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.chembur_market,R.string.chembur_market_short_info,R.drawable.chembur_market));


        // hooking up listView Custom Adapater and ArrayList
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotShoppingCentres);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.k_star,R.string.k_star,R.string.k_star_des,R.string.k_star_address,"Chembur");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.mahavir_home_store_chembur,R.string.mahavir_home_store,R.string.mahavir_store_des,R.string.mahavir_home_store_address,"Chembur");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.cubic,R.string.cubic,R.string.cubic_des,R.string.cubic_mall_address,"Chembur");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.chembur_market,R.string.chembur_market,R.string.chembur_market_des,R.string.chembur_market_address,"Chembur");
                        break;
                    }
                }
            }
        });

    }

    //cstShopping
    private void cstShopping(){

        ArrayList<HotSpotsGetterClass> hotShoppingCentres = new ArrayList<>();

        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.fashion_street,R.string.fashion_street_short_info,R.drawable.fashion_street));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.crawford_market,R.string.crawford_market_short_info,R.drawable.crawfordmarket));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.manish_market,R.string.manish_market_short_info,R.drawable.manish_market));
        hotShoppingCentres.add(new HotSpotsGetterClass(R.string.cr_mall,R.string.cr_mall_short_info,R.drawable.cr2));


        // hooking up listView Custom Adapater and ArrayList
        ListView listView = view.findViewById(R.id.hot_places_list_view);
        HotPlaceListViewAdapter hotPlaceListViewAdapter = new HotPlaceListViewAdapter(getActivity(),hotShoppingCentres);
        listView.setAdapter(hotPlaceListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        sendImageAddressDescription(R.drawable.fashion_street,R.string.fashion_street,R.string.fashion_street_des,R.string.fashion_street_address,"C.S.T");
                        break;
                    }
                    case 1 : {
                        sendImageAddressDescription(R.drawable.crawfordmarket,R.string.crawford_market,R.string.crawford_market_des,R.string.crawfrod_market_address,"C.S.T");
                        break;
                    }
                    case 2 : {
                        sendImageAddressDescription(R.drawable.manish_market,R.string.manish_market,R.string.manish_market_des,R.string.manish_market_address,"C.S.T");
                        break;
                    }
                    case 3 : {
                        sendImageAddressDescription(R.drawable.cr2,R.string.cr_mall,R.string.cr_des,R.string.cr_address,"C.S.T");
                        break;
                    }
                }
            }
        });

    }
/*
* @1 param image : sends the Images Resource Id From this Fragment, to  viewHotSpots activity
* @2 param title : sends the title Resource Id From this Fragment, to  viewHotSpots activity
* @3 param description : sends the description Resource Id From this Fragment, to  viewHotSpots activity
* @4 param actionBarText : send the title of the actions, to be set when been viewed
*
*/
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