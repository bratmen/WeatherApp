package com.android.wheatherapp;

public class Constans {

    private static String ConstApi = "api.openweathermap.org/data/2.5/weather?id=";

    public int London_id = 2643743;
    public int Barcelona_id = 3128759;
    public int Milano_id = 3173435;
    public int Roma_id = 3169070;
    public int Cracow_id = 3085041;
    public int Lleida_id = 3085041;
    public int Madrid_id = 3117735;
    public int Valencia_id = 2509954;
    public int Paris_id = 2988507;
    public int Berlin_id = 2950159;

    public void setConstApi(String ConstApi) {
        this.ConstApi = ConstApi;
    }

    public static String getConstApi() {
        return ConstApi;
    }
}
