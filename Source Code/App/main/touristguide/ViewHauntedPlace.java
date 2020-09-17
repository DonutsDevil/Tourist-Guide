package com.example.touristguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHauntedPlace extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_haunted_place);

        Intent intent = getIntent();
        int mTitle = intent.getExtras().getInt("Title");

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(mTitle);

        TextView title = findViewById(R.id.title_places);
        title.setText(mTitle);
        if(mTitle == R.string.title_dsouza_chawl){

            title.setTextColor(R.color.material_on_background_emphasis_high_type);
            title.setTypeface(null, Typeface.BOLD);
        }

        int mDescription = intent.getExtras().getInt("description");
        TextView description = findViewById(R.id.describe_haunted_places);
        description.setText(mDescription);

        int mImageId = intent.getExtras().getInt("image");
        ImageView imageView = findViewById(R.id.image_haunted);
        imageView.setImageResource(mImageId);

    }
}