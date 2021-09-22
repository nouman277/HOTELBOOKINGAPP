package com.example.hotelbookingapp;

public class modelTopDestination {

    public modelTopDestination() {
    }

    String CityName, CityPhoto;

    public modelTopDestination(String cityName, String cityPhoto) {
        CityName = cityName;
        CityPhoto = cityPhoto;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getCityPhoto() {
        return CityPhoto;
    }

    public void setCityPhoto(String cityPhoto) {
        CityPhoto = cityPhoto;
    }
}

