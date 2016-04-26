package com.github.bgogetap.mapviewidcollision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyMapView mapView = new MyMapView(this);
        ((FrameLayout)findViewById(R.id.container)).addView(mapView);
    }
}
