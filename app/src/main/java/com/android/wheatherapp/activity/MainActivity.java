package com.android.wheatherapp.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.wheatherapp.R;

import retrofit2.Retrofit;

public abstract class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String selected = spinner.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT).show();


    }


    public void onSaveInstanceState(Retrofit retrofit) {
    }
}
