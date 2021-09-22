package com.example.hotelbookingapp;

public class modelFeaturedHotel {

    public  modelFeaturedHotel(){}

    String HotelImage;
    String HotelName;
    String CityName;
    String HotelRating;
    String PeopleRecommend;
    String PricePerNight;

    public modelFeaturedHotel(String hotelImage, String hotelName, String cityName, String hotelRating, String peopleRecommend, String pricePerNight) {
        HotelImage = hotelImage;
        HotelName = hotelName;
        CityName = cityName;
        HotelRating = hotelRating;
        PeopleRecommend = peopleRecommend;
        PricePerNight = pricePerNight;
    }

    public String getHotelImage() {
        return HotelImage;
    }

    public void setHotelImage(String hotelImage) {
        HotelImage = hotelImage;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getHotelRating() {
        return HotelRating;
    }

    public void setHotelRating(String hotelRating) {
        HotelRating = hotelRating;
    }

    public String getPeopleRecommend() {
        return PeopleRecommend;
    }

    public void setPeopleRecommend(String peopleRecommend) {
        PeopleRecommend = peopleRecommend;
    }

    public String getPricePerNight() {
        return PricePerNight;
    }

    public void setPricePerNight(String pricePerNight) {
        PricePerNight = pricePerNight;
    }
}
