package com.android.wheatherapp;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.android.wheatherapp.web.Weather;
import com.android.wheatherapp.Constans;


public class BaseApplication extends Application {

    private final String TAG = this.getClass().getSimpleName();

    private static Weather weather;
    private Retrofit retrofit;
    public String cityUrl;

    @Override

    public void onCreate() {
        super.onSaveInstanceState(retrofit);

        retrofit = new Retrofit.Builder()
                .baseUrl(cityUrl.getConstApi())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weather = retrofit.create(Weather.class);
    }



}
