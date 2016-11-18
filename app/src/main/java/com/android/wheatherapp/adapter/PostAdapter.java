package com.android.wheatherapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.wheatherapp.R;
import com.android.wheatherapp.entity.PostModel;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>{

    private List<PostModel> weathers;

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        if (weathers == null)
            return 0;
        return weathers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView city;
        RecyclerView weather;
        RecyclerView main;
        RecyclerView wind;
        RecyclerView rain;
        RecyclerView clouds;

        public ViewHolder(View itemView) {
            super(itemView);

        }
    }
}
