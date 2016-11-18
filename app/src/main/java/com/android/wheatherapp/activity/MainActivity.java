package com.android.wheatherapp.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.wheatherapp.R;
import com.android.wheatherapp.fragments.WeatherFragment;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String selected = spinner.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_LONG).show();

        FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = manager.findFragmentById(R.id.weatherfragment);

        if (fragment == null) {
            fragment = new android.support.v4.app.Fragment();
            manager.beginTransaction()
                    .add(R.id.weatherfragment, fragment)
                    .commit();
        }

    }
}
