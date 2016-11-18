package com.android.wheatherapp.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.wheatherapp.R;
import com.android.wheatherapp.fragments.WeatherFragment;

public class MainActivity extends Activity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "It is OK");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String selected = spinner.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_LONG).show();

        android.app.FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
    /*
    *add fragment
    */
        WeatherFragment weatherfragment = new WeatherFragment();
        fragmentTransaction.add(R.id.activity_main, weatherfragment);
        fragmentTransaction.commit();
    }
}
