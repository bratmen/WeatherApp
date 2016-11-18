package com.android.wheatherapp.fragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.android.wheatherapp.R;
import com.android.wheatherapp.adapter.PostAdapter;

public class WeatherFragment extends Fragment{

    @Override
    public RecyclerView onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){
        Context context = getActivity().getApplicationContext();
        RecyclerView recyclerView = new RecyclerView(context);
        View weatherlist = recyclerView.findViewById(R.id.recycle_view_fragment);
        recyclerView.addView(weatherlist);

        return recyclerView;
    }
}
