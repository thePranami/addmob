package com.jindal.oktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListAdapter listAdapter;
    private ListView listView;
    private AdView mainAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        MobileAds.initialize(MainActivity.this, "ca-app-pub-3940256099942544~3347511713");

        listAdapter = new ListAdapter();
        listView.setAdapter(listAdapter);

        mainAdView = findViewById(R.id.adViewMain);
        AdRequest adRequest = new AdRequest.Builder().build();
        mainAdView.loadAd(adRequest);

    }
}
