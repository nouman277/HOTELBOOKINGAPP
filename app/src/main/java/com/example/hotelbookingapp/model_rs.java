package com.example.hotelbookingapp;
public class model_rs {



    int imageRS;
    String cityCountryRS;

    public model_rs(int imageRS, String cityCountryRS, String numbHotelsRS) {
        this.imageRS = imageRS;
        this.cityCountryRS = cityCountryRS;
        this.numbHotelsRS = numbHotelsRS;
    }

    String numbHotelsRS;

    public int getImageRS() {
        return imageRS;
    }

    public void setImageRS(int imageRS) {
        this.imageRS = imageRS;
    }

    public String getCityCountryRS() {
        return cityCountryRS;
    }

    public void setCityCountryRS(String cityCountryRS) {
        this.cityCountryRS = cityCountryRS;
    }

    public String getNumbHotelsRS() {
        return numbHotelsRS;
    }

    public void setNumbHotelsRS(String numbHotelsRS) {
        this.numbHotelsRS = numbHotelsRS;
    }
}
