package com.example.hotelbookingapp;

public class model_pd {


    int imagePD;
    String cityCountryPD;
    String numbHotelsPD;

    public model_pd(int imagePD, String cityCountryPD, String numbHotelsPD) {
        this.imagePD = imagePD;
        this.cityCountryPD = cityCountryPD;
        this.numbHotelsPD = numbHotelsPD;
    }


    public int getImagePD() {
        return imagePD;
    }

    public void setImagePD(int imagePD) {
        this.imagePD = imagePD;
    }

    public String getCityCountryPD() {
        return cityCountryPD;
    }

    public void setCityCountryPD(String cityCountryPD) {
        this.cityCountryPD = cityCountryPD;
    }

    public String getNumbHotelsPD() {
        return numbHotelsPD;
    }

    public void setNumbHotelsPD(String numbHotelsPD) {
        this.numbHotelsPD = numbHotelsPD;
    }
}