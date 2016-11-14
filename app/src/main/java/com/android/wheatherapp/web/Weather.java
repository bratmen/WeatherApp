package com.android.wheatherapp.web;

import com.android.wheatherapp.Entity.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface Weather {
    @GET("api/get")
    Call<List<PostModel>> getData(@Path("name") String resourceName, int count);
}
