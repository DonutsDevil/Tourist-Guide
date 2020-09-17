package com.example.touristguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import static java.lang.Class.forName;

public class HotSpots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_spots);

        ActionBar actionbar = getSupportActionBar();
        assert actionbar != null;
        actionbar.setTitle("Hot Spots");
    }

    public void cst(View view) {
        Intent intent = new Intent(this,HotPlacesView.class);
        intent.putExtra("Title","C.S.T");
        startActivity(intent);

    }


    public void chembur(View view) {
        Intent intent = new Intent(this, HotPlacesView.class);
        intent.putExtra("Title","Chembur");
        startActivity(intent);
    }

    public void bandra(View view) {
        Intent intent = new Intent(this, HotPlacesView.class);
        intent.putExtra("Title","Bandra");
        startActivity(intent);
    }




}

