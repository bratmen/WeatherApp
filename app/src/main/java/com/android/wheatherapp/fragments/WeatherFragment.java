package com.android.wheatherapp.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.wheatherapp.R;

public class WeatherFragment extends Fragment{
    public WeatherFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.weatherfragment, container, false);
        RecyclerView weatherlist = (RecyclerView) view.findViewById(R.id.posts_recycle_view);
        return view;
    }
}
