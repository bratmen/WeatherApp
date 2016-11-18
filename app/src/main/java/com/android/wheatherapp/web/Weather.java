package com.android.wheatherapp.web;

import com.android.wheatherapp.entity.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Weather {
    @GET("https://api.openweathermap.org/data/2.5/{id}")
    Call<List<PostModel>> getData(@Path("id") String cityId);

}
