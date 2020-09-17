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

// this set the list view of Events and Activities of mumbai
public class DropDownAdapter extends ArrayAdapter<DropDownMenu> {

    public DropDownAdapter(@NonNull Context context, @NonNull List<DropDownMenu> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.drop_down_cutsom_list,parent,false);
        }
        DropDownMenu currentWord = getItem(position);
        TextView textTitle = (TextView) listView.findViewById(R.id.header);
        textTitle.setText(currentWord.getTitle());

        TextView url = (TextView) listView.findViewById(R.id.discribe);
        url.setText(currentWord.getUrl());

        TextView info = listView.findViewById(R.id.info);
        info.setText(currentWord.getInfo());

        ImageView imageView = listView.findViewById(R.id.RefferPic);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return listView;
    }
}
