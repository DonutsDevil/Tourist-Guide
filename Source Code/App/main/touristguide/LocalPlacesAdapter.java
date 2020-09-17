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
import androidx.core.content.ContextCompat;

public class LocalPlacesAdapter extends ArrayAdapter<HauntedAndSecrete> {
    public LocalPlacesAdapter(@NonNull Context context, @NonNull List<HauntedAndSecrete> Places) {
        super(context,0, Places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;

        // inflates the List with the views
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.local_areas_custom_listview,parent,false);
        }
        // get the current position of the view requested
        HauntedAndSecrete place = getItem(position);

        // set the image in the image view of the custom list
        ImageView imageView = listView.findViewById(R.id.image_view);
        if(place.hasImage()){
            imageView.setImageResource(place.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        // sets the title of the image
        TextView title = listView.findViewById(R.id.title_view);
        title.setText(place.getTitle());
        // sets the description of the related image
        TextView description = listView.findViewById(R.id.description);
        description.setText(place.getDescription());

        return listView;
    }
}
