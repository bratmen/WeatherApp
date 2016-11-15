package com.android.wheatherapp.web;

import com.android.wheatherapp.entity.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Weather {
    @GET("api/get")
    Call<List<PostModel>> getData(@Query("name") String resourceName, @Path("id") int cityId);

}
