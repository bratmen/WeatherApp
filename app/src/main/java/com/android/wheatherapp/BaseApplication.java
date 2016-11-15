package com.android.wheatherapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.android.wheatherapp.entity.PostModel;
import com.android.wheatherapp.web.Weather;

import java.util.List;

import static com.android.wheatherapp.Constans.*;


public class BaseApplication extends Activity {

    private static Weather weather;
    private Retrofit retrofit;
    public String cityUrl = new String(getConstApi());
    public String city_Id = new String(getLondonId());

    @Override

    protected void onCreate(Bundle onSaveInstanceState) {
        super.onCreate(onSaveInstanceState);
        setContentView(R.layout.post_item);

        retrofit = new Retrofit.Builder()
                .baseUrl(cityUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weather = retrofit.create(Weather.class);

        Call<List<PostModel>> response = weather.getData(city_Id);
            response.enqueue(new Callback<List<PostModel>>() {
                @Override
                public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                    Toast.makeText(getApplicationContext(), "it is ok", Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call<List<PostModel>> call, Throwable t) {

                }
            });
    }



}
