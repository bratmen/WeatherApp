package com.android.wheatherapp;

import android.app.ListActivity;
import android.os.Bundle;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.android.wheatherapp.web.Weather;

import static com.android.wheatherapp.Constans.getConstApi;


public class BaseApplication extends ListActivity {

    private static Weather weather;
    private Retrofit retrofit;
    public String cityUrl = new String(getConstApi());

    @Override

    protected void onCreate(Bundle onSaveInstanceState) {
        super.onCreate(onSaveInstanceState);
        setContentView(R.layout.post_item);

        retrofit = new Retrofit.Builder()
                .baseUrl(cityUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weather = retrofit.create(Weather.class);
    }



}
