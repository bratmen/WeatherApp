package com.android.wheatherapp;

import com.android.wheatherapp.Activity.MainActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.android.wheatherapp.web.Weather;



public class BaseApplication extends Application{

    private final String TAG = this.getClass().getSimpleName();

    private static Weather weather;
    private Retrofit retrofit;

    @Override

    public void onCreate() {
        super.onSaveInstanceState(retrofit);

        retrofit = new Retrofit.Builder()
                .baseUrl("api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weather = retrofit.create(Weather.class);
    }

    public static Weather getApi(){
        return weather;
    }

}
