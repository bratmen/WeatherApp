package com.android.wheatherapp;

public class Constans {

    private static String ConstApi = "https://api.openweathermap.org/data/2.5/";
    private static String LondonId = "weather?id=2643743";
    private static String BarcelonaId = "weather?id=3128759";
    private static String MilanoId = "weather?id=3173435";
    private static String RomaId = "weather?id=3169070";
    private static String CracowId = "weather?id=3085041";
    private static String LleidaId = "weather?id=3085041";
    private static String MadridId = "weather?id=3117735";
    private static String ValenciaId = "weather?id=2509954";
    private static String ParisId = "weather?id=2988507";
    private static String BerlinId = "weather?id=2950159";

    public static String getLondonId() {
        return LondonId;
    }

    public static void setLondonId(String londonId) {
        LondonId = londonId;
    }

    public static String getBarcelonaId() {
        return BarcelonaId;
    }

    public static void setBarcelonaId(String barcelonaId) {
        BarcelonaId = barcelonaId;
    }

    public static String getMilanoId() {
        return MilanoId;
    }

    public static void setMilanoId(String milanoId) {
        MilanoId = milanoId;
    }

    public static String getRomaId() {
        return RomaId;
    }

    public static void setRomaId(String romaId) {
        RomaId = romaId;
    }

    public static String getCracowId() {
        return CracowId;
    }

    public static void setCracowId(String cracowId) {
        CracowId = cracowId;
    }

    public static String getLleidaId() {
        return LleidaId;
    }

    public static void setLleidaId(String lleidaId) {
        LleidaId = lleidaId;
    }

    public static String getMadridId() {
        return MadridId;
    }

    public static void setMadridId(String madridId) {
        MadridId = madridId;
    }

    public static String getValenciaId() {
        return ValenciaId;
    }

    public static void setValenciaId(String valenciaId) {
        ValenciaId = valenciaId;
    }

    public static String getParisId() {
        return ParisId;
    }

    public static void setParisId(String parisId) {
        ParisId = parisId;
    }

    public static String getBerlinId() {
        return BerlinId;
    }

    public static void setBerlinId(String berlinId) {
        BerlinId = berlinId;
    }

    public void setConstApi(String ConstApi) {
        this.ConstApi = ConstApi;
    }

    public static String getConstApi() {
        return ConstApi;
    }
}
