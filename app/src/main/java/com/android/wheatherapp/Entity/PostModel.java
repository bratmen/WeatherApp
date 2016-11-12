package com.android.wheatherapp.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostModel {

    @SerializedName("weather")
    @Expose
    private String weather;

    @SerializedName("main")
    @Expose
    private String main;

    @SerializedName("wind")
    @Expose
    private String wind;

    @SerializedName("rain")
    @Expose
    private String rain;

    @SerializedName("clouds")
    @Expose
    private String clouds;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getClouds() {
        return clouds;
    }

    public void setClouds(String clouds) {
        this.clouds = clouds;
    }
}
