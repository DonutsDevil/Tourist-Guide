package com.example.touristguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HotPlaceListViewAdapter extends ArrayAdapter<HotSpotsGetterClass> {

    public HotPlaceListViewAdapter(@NonNull Context context, @NonNull List<HotSpotsGetterClass> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View hotSpotsList = convertView;
        if(hotSpotsList == null){
            hotSpotsList = LayoutInflater.from(getContext()).inflate(R.layout.hot_places_custom_list,parent,false);
        }

        HotSpotsGetterClass spots = getItem(position);

        TextView title = hotSpotsList.findViewById(R.id.title_text_view);
        title.setText(spots.getmTitle());

        TextView description = hotSpotsList.findViewById(R.id.description_text_view);
        description.setText(spots.getmDescription());

        ImageView imageView = hotSpotsList.findViewById(R.id.image_view_id);
        if(spots.hasImage()){
            imageView.setImageResource(spots.getmImageId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }
        return hotSpotsList;
    }
}
